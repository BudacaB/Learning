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

// 1. Setup a div contain for todos
// 2. Setup filters (searchText) and wire up a new filter input to change it
// 3. Create a renderTodos function to render and rerender the latest filtered data

const filters = {
    searchText: ''
}

const renderTodos = function(todos, filters) {
    const filteredTodos = todos.filter(function(todo) {
        return todo.title.toLowerCase().includes(filters.searchText.toLowerCase())
    })

    const incompleteTodos = filteredTodos.filter(function(todo) {
        return !todo.completed
    })
    
    document.querySelector('#todos').innerHTML = ''
    const summary = document.createElement('h2')
    summary.textContent = `You have ${incompleteTodos.length} todos left`
    document.querySelector('#todos').appendChild(summary)

    filteredTodos.forEach(function(todo) {
        const addTodo = document.createElement('p')
        addTodo.textContent = todo.title
        document.querySelector('#todos').appendChild(addTodo)
    })
}

renderTodos(todos, filters)


// Listen for new todo creation
document.querySelector('#add-todo').addEventListener('click', function() {
    console.log("I'm adding a new todo")
})

document.querySelector('#create-todo').addEventListener('input', function(e) {
    console.log(e.target.value)
})

document.querySelector("#search-text").addEventListener('input', function(e) {
    filters.searchText = e.target.value
    renderTodos(todos, filters)
})