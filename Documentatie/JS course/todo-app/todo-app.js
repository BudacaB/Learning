let todos = getSavedTodos()

const filters = {
    searchText: '',
    hideCompleted: false
}

/* const renderTodos = function (todos, filters) {

    const filteredTodos = todos.filter(function (todo) {
        const searchTextMatch = todo.title.toLowerCase().includes(filters.searchText.toLowerCase())
        const hideCompletedMatch = !filters.hideCompleted || !todo.completed

        return searchTextMatch && hideCompletedMatch
    })

    // filteredTodos = filteredTodos.filter(function (todo) {
    // 1.
    //     return !filters.hideCompleted || !todo.completed
    // 2.
    //     if (filters.hideCompleted) {
    //         return !todo.completed
    //     } else {
    //         return true
    //     }
    // })

    const incompleteTodos = filteredTodos.filter(function (todo) {
        return !todo.completed
    })

    document.querySelector('#todos').innerHTML = ''
    
    const todosLeft = document.createElement('h2');
    todosLeft.textContent = `You have ${incompleteTodos.length} todos left`;
    document.querySelector('#todos').appendChild(todosLeft)
    
    filteredTodos.forEach(function (todo) {
        const newParagraph = document.createElement('p')

        if (todo.title.length > 0){
            newParagraph.textContent = todo.title
        } else {
            newParagraph.textContent = 'Unnamed todo'
        }

        
        document.querySelector('#todos').appendChild(newParagraph)
    })
} */

renderTodos(todos, filters)

document.querySelector('#search-text').addEventListener('input', function(e) {
    filters.searchText = e.target.value
    renderTodos(todos, filters)
})

document.querySelector('#todo-form').addEventListener('submit', function(e) {
    e.preventDefault()
    todos.push({
        title: e.target.elements.todoName.value,
        completed: false
    })
    //localStorage.setItem('todos', JSON.stringify(todos))
    saveTodos(todos)
    e.target.elements.todoName.value = ''
    renderTodos(todos, filters)
})

document.querySelector('#hide-completed').addEventListener('change', function(e) {
    filters.hideCompleted = e.target.checked
    renderTodos(todos, filters)
})

