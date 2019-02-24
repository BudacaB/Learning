// Fetch existing todos from localStorage
// getSavedTodos

const getSavedTodos = function() {
    const todosJSON = localStorage.getItem('todos')
    if (todosJSON !== null) {
        return JSON.parse(todosJSON)
    } else {
        return []
    }
}

// Save todos to localStorage
// saveTodos

const saveTodos = function(todos) {
    localStorage.setItem('todos', JSON.stringify(todos))
}

// Render application todos based on filters
// renderTodos

const renderTodos = function (todos, filters) {

    const filteredTodos = todos.filter(function (todo) {
        const searchTextMatch = todo.title.toLowerCase().includes(filters.searchText.toLowerCase());
        const hideCompletedMatch = !filters.hideCompleted || !todo.completed;

        return searchTextMatch && hideCompletedMatch;
    })

    const incompleteTodos = filteredTodos.filter(function (todo) {
        return !todo.completed
    })

    document.querySelector('#todos').innerHTML = ''
    document.querySelector('#todos').appendChild(generateSummaryDOM(incompleteTodos))

    filteredTodos.forEach(function (todo) {
        document.querySelector('#todos').appendChild(generateTodoDOM(todo))
    })
}

// Get the DOM elements for an individual note
// generateTodoDOM

const generateTodoDOM = function(todo) {
    const todoEl = document.createElement('div')
    const textEl = document.createElement('span')
    const checkout = document.createElement('input')
    const button = document.createElement('button')

    checkout.type = 'checkbox'
    todoEl.appendChild(checkout)

    button.textContent = 'x'
    textEl.appendChild(button)

    if (todo.title.length > 0) {
        textEl.textContent = todo.title
    } else {
        textEl.textContent = 'Unnamed todo'
    }

    todoEl.appendChild(textEl)
    textEl.appendChild(button)
    return todoEl
}

// Get the DOM elements for list summary
// generateSummaryDOM

const generateSummaryDOM = function(incompleteTodos) {
    const todosLeft = document.createElement('h2');
    todosLeft.textContent = `You have ${incompleteTodos.length} todos left`;
    return todosLeft
}