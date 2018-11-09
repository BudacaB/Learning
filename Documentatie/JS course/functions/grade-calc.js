// students score, total possible score
// 15/20 -> You got a C (75%)!
// A 90-100, B 80-89, C 70-79, D 60-69, F 0-59

let gradeCalc = function(studentScore, possibleScore) {
    let percent = studentScore / possibleScore * 100
    if (90 <= percent && percent <= 100) {
        return `You got an A (${percent}%)`
    }
    else if (80 <= percent && percent <= 89) {
        return `You got a B (${percent}%)`
    }
    else if (70 <= percent && percent <= 79) {
        return `You got a C (${percent}%)`
    }
    else if (60 <= percent && percent <= 69) {
        return `You got a D (${percent}%)`
    }
    else if (0 <= percent && percent <= 59) {
        return `You got a F (${percent}%)`
    }
}

let result = gradeCalc(87, 100)
console.log(result)