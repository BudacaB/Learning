const account = {
    name: 'Andrew Mead',
    expenses: [],
    income: [],
    addIncome: function (desc, amount){
        this.income.push({
            description: desc,
            amount: amount
        })
    },
    addExpense: function (desc, amount) {
        this.expenses.push({
            description: desc,
            amount: amount
        })
    },
    getAccountSummary: function () {
        let totalExpenses = 0
        let totalIncome = 0

        this.expenses.forEach(function (expense) {
            totalExpenses += expense.amount
        })

        this.income.forEach(function (income) {
            totalIncome += income.amount  
        })

        return `${this.name} has a balance of $${totalIncome - totalExpenses}, $${totalIncome} income, $${totalExpenses} in expenses`
    }
}

account.addExpense('Rent', 950)
account.addExpense('Coffee', 2)
account.addIncome('Job', 1000)
console.log(account.getAccountSummary())