let myAccount = {
    name: 'Andrew Mead',
    expenses: 0,
    income: 0
}

/*
let otherAccount = myAccount
otherAccount.income = 1000
otherAccount = {}
*/

let addExpense = function (account, amount) {
    account.expenses = account.expenses + amount
}

// addIncome
let addIncome = function (account, amount) {
    account.income = account.income + amount
}

// resetAccount
let resetAccount = function (account) {
    account.expenses = 0
    account.income = 0
}

// getAccountSummary
// Account for Andrew has $900, $1000 in income, $100 in expenses
let getAccountSummary = function (account) {
    let balance = account.income - account.expenses
    return `Account for ${account.name} has $${balance}, $${account.income} in income, and $${account.expenses} in expenses`
}


// addIncome
addIncome(myAccount, 1200)
// addExpense
addExpense(myAccount, 100)
// addExpense
addExpense(myAccount, 50)
// getAccountSummary
console.log(getAccountSummary(myAccount))
// resetAccount
resetAccount(myAccount)
// getAccountSummary
console.log(getAccountSummary(myAccount))