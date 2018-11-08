// Multiple arguments
let add = function (a, b, c) {
    return a + b + c
}

let result = add(10, 1, 5)
console.log(result)

// Default arguments
let getScoreText = function (name = 'Anonymous', score = 0) {
    // return 'Name: ' + name + ' - Score: ' + score
    return `Name: ${name} - Score: ${score}`
}

let scoreText = getScoreText(undefined, 99)
console.log(scoreText)

// Challenge area
// total, tipPercent .2 or .1

let getTip = function (total, tipPercent = .2) {
    return `The tip for a bill of ${total} is: ` + total * tipPercent
}

let tip = getTip(100)
console.log(tip)

let tip2 = getTip(50, .1)
console.log(tip2)


