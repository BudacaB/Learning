// Fetch existing todos from localStorage
// getSavedTodos

let getSavedTodos = function() {
    const todosJSON = localStorage.getItem('todos')
    if (todosJSON !== null) {
    return JSON.parse(todosJSON)
    }
}

// Save todos to localStorage
// saveTodos

let saveTodos = function() {
    return localStorage.setItem('todos', JSON.stringify(todos))
}

// Render application todos based on filters
// renderTodos

const renderTodos = function (todos, filters) {

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
}

// Get the DOM elements for an individual note
// generateTodoDOM

// Get the DOM elements for list summary
// generateSummaryDOM