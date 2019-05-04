const getSavedTodos = () => {
    const todosJSON = localStorage.getItem('todos')
    
    return todosJSON !== null ? JSON.parse(todosJSON) : []
}

const saveTodos = (todos) => {
    localStorage.setItem('todos', JSON.stringify(todos))
}

const removeTodo = (id) => {
    const todoIndex = todos.findIndex((todo) => todo.id === id)
    if(todoIndex > -1) {
        todos.splice(todoIndex, 1)
    }
}

const toggleTodo = (id) => {
    const todo = todos.find((todo) => todo.id === id)

    if(todo !== undefined) {
        todo.completed = !todo.completed
    }
}

const renderTodos = (todos, filters) => {
    const filteredTodos = todos.filter((todo) => {
        const searchMatch = todo.title.toLowerCase().includes(filters.searchText.toLowerCase());
        const hideCompleted = !filters.checked || !todo.completed
        return searchMatch && hideCompleted
    })

    const incompleteTodos = filteredTodos.filter((todo) => !todo.completed)

    document.querySelector('#todos').innerHTML = ''
    document.querySelector('#todos').appendChild(generateSummaryDOM(incompleteTodos))

    filteredTodos.forEach((todo) => {
        document.querySelector('#todos').appendChild(generateTodoDOM(todo))
    })
}

const generateTodoDOM = (todo) => {
    const todoEl = document.createElement('div')

    const checkbox = document.createElement('input')
    checkbox.setAttribute('type', 'checkbox')
    checkbox.checked = todo.completed
    todoEl.appendChild(checkbox)
    checkbox.addEventListener('change', () => {
        toggleTodo(todo.id)
        saveTodos(todos)
        renderTodos(todos, filters)
    })
    
    const textEl = document.createElement('span')
    const button = document.createElement('button')
    button.textContent = 'x'
    button.addEventListener('click', () => {
        removeTodo(todo.id)
        saveTodos(todos)
        renderTodos(todos, filters)
    })

    
    
        if(todo.title.length > 0) {
            textEl.textContent = todo.title
        } else {
            textEl.textContent = 'Unnamed todo'
        }

        todoEl.appendChild(textEl)
        todoEl.appendChild(button)

        return todoEl
        
}

const generateSummaryDOM = (incompleteTodos) => {
    
    const summary = document.createElement('h2')
    summary.textContent = `You have ${incompleteTodos.length} todos left`
    return summary
}