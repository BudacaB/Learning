const todos = [{
    title: 'Workout',
    completed: true
    }, {
    title: 'Brush teeth',
    completed: true
    }, {
    title: 'Learn German',
    completed: true
    }, {
    title: 'Learn to code',
    completed: false
    }, {
    title: 'Do dishes',
    completed: false
}]

// You have 2 todos left (p element)
// Add a p for each todo above (use text value)

const incompleteTodos = todos.filter(function (todo) {
    return !todo.completed
})

const todosLeft = document.createElement('h2');
todosLeft.textContent = `You have ${incompleteTodos.length} todos left`;
document.querySelector('body').appendChild(todosLeft)

todos.forEach(function (todo) {
    const newParagraph = document.createElement('p')
    newParagraph.textContent = todo.title
    document.querySelector('body').appendChild(newParagraph)
})


// Listen for new todo creation
document.querySelector('#add-todo').addEventListener('click', (e) => {
    console.log('Add a new todo...')
})

document.querySelector('#add-todo-box').addEventListener('input', function (e) {
    console.log(e.target.value)
})