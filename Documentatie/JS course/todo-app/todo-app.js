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

/* let todosLeft = 0;
todos.forEach(function(todo) {
    if (!todo.completed) {
        todosLeft++;
    }
}) */

const incompleteTodos = todos.filter(function(todo) {
    return !todo.completed
})

const summary = document.createElement('h2')
summary.textContent = `You have ${incompleteTodos.length} todos left`
document.querySelector('body').appendChild(summary)

todos.forEach(function(todo) {
    const addTodo = document.createElement('p')
    addTodo.textContent = todo.title
    document.querySelector('body').appendChild(addTodo)
})

// Listen for new todo creation
document.querySelector('#add-todo').addEventListener('click', function() {
    console.log("I'm adding a new todo")
})

document.querySelector('#create-todo').addEventListener('input', function(e) {
    console.log(e.target.value)
})