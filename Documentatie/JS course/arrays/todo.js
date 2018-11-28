const todos = ['workout', 'brush teeth', 'learn German', 'learn to code', 'do dishes']

// Delete the 3rd item
todos.splice(2, 1)
// Add a new item onto the end
todos.push('get food')
// Remove the first item from the list
todos.shift()

console.log(`You have ${todos.length} todos`)
console.log(todos)


