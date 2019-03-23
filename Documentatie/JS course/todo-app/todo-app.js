let todos = []

const filters = {
    searchText: '',
    checked: false
}

const todosJSON = localStorage.getItem('todos')
if (todosJSON !== null) {
    todos = JSON.parse(todosJSON)
}

const renderTodos = function(todos, filters) {
    const filteredTodos = todos.filter(function(todo) {
        const searchMatch = todo.title.toLowerCase().includes(filters.searchText.toLowerCase());
        const hideCompleted = !filters.checked || !todo.completed

        return searchMatch && hideCompleted
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

        if(todo.title.length > 0) {
            addTodo.textContent = todo.title
        } else {
            addTodo.textContent = 'Unnamed todo'
        }
        
        document.querySelector('#todos').appendChild(addTodo)
    })
}

renderTodos(todos, filters)

document.querySelector("#search-text").addEventListener('input', function(e) {
    filters.searchText = e.target.value
    renderTodos(todos, filters)
})

document.querySelector("#todo-form").addEventListener('submit', function(e) {
    e.preventDefault();
    todos.push({
        title: e.target.elements.addTodo.value,
        completed: false
    })
    localStorage.setItem('todos', JSON.stringify(todos))
    renderTodos(todos, filters)
    e.target.elements.addTodo.value = '';
})

document.querySelector('#hide-completed').addEventListener('change', function(e){
    filters.checked = e.target.checked
    renderTodos(todos, filters)
})