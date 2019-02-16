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

// Render application todos based on filters
// renderTodos

// Get the DOM elements for an individual note
// generateTodoDOM

// Get the DOM elements for list summary
// generateSummaryDOM