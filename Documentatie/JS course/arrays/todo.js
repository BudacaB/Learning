const todos = ['workout', 'brush teeth', 'learn German', 'learn to code', 'do dishes']

todos.splice(2, 1)
todos.push('get food')
todos.shift()

console.log(`You have ${todos.length} todos`)

todos.forEach(function (todo, index) {
    console.log(`${index + 1}. ${todo}`)
})

for (let count = 0; count < todos.length; count++) {
    console.log(`${count + 1}. ${todos[count]}`)
}

