const getSavedTodos = function() {
    const todosJSON = localStorage.getItem('todos')
    if (todosJSON !== null) {
        return JSON.parse(todosJSON)
    } else {
        return []
    }
}

const saveTodos = function(todos) {
    localStorage.setItem('todos', JSON.stringify(todos))
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
    document.querySelector('#todos').appendChild(generateSummaryDOM(incompleteTodos))

    filteredTodos.forEach(function(todo) {
        document.querySelector('#todos').appendChild(generateTodoDOM(todo))
    })
}



const generateTodoDOM = function(todo) {
    const todoEl = document.createElement('div')

    const checkbox = document.createElement('input')
    checkbox.setAttribute('type', 'checkbox')
    
    const textEl = document.createElement('span')
    const button = document.createElement('button')
    button.textContent = 'x'
    todoEl.appendChild(checkbox)
    
        if(todo.title.length > 0) {
            textEl.textContent = todo.title
        } else {
            textEl.textContent = 'Unnamed todo'
        }

        todoEl.appendChild(textEl)
        todoEl.appendChild(button)

        return todoEl
        
}

const generateSummaryDOM = function(incompleteTodos) {
    
    const summary = document.createElement('h2')
    summary.textContent = `You have ${incompleteTodos.length} todos left`
    return summary
}