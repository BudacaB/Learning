'use strict'

let todos = getSavedTodos()

const filters = {
    searchText: '',
    checked: false
}

renderTodos(todos, filters)

document.querySelector("#search-text").addEventListener('input', (e) => {
    filters.searchText = e.target.value
    renderTodos(todos, filters)
})

document.querySelector("#todo-form").addEventListener('submit', (e) => {
    e.preventDefault();
    todos.push({
        id: uuidv4(),
        title: e.target.elements.addTodo.value,
        completed: false
    })
    saveTodos(todos)
    renderTodos(todos, filters)
    e.target.elements.addTodo.value = '';
})

document.querySelector('#hide-completed').addEventListener('change', (e) => {
    filters.checked = e.target.checked
    renderTodos(todos, filters)
})