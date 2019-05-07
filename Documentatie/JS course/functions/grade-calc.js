// students score, total possible score
// 15/20 -> You got a C (75%)!
// A 90-100, B 80-89, C 70-79, D 60-69, F 0-59

const gradeCalc = function(studentScore, possibleScore) {
    if (typeof studentScore !== 'number' || typeof possibleScore !== 'number') {
        throw Error('Please input numbers')
    }

    const percent = studentScore / possibleScore * 100
        let letterGrade = ''
    
        if (90 <= percent) {
            letterGrade = 'A'
        }
        else if (80 <= percent) {
            letterGrade = 'B'
        }
        else if (70 <= percent) {
            letterGrade = 'C'
        }
        else if (60 <= percent) {
            letterGrade = 'D'
        }
        else {
            letterGrade = 'F'
        }
    
        return `You got a ${letterGrade} (${percent}%)`

}

try {
    const result = gradeCalc('check', 100)
    console.log(result)
} catch (e) {
    console.log(e.message)
}

