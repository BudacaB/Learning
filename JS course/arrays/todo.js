// const todos = ['Workout', 'Brush teeth', 'Learn German', 'Learn to code', 'Do dishes']

// 1. Convert array to array of objects -> text, completed 
// 2. Create function to remove a todo by text value

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

console.log(todos)
const deleteTodo = function (todos, todoTitle){
    todos.find (function (todo, index){
        if (todo.title.toLowerCase() === todoTitle.toLowerCase()){
            return todos.splice(index, 1)
        }
    })
}

const getThingsToDo = function(todos) {
    return todos.filter(function(todo) {
        return !todo.completed
    })
}

const sortTodos = function (todos) {
    todos.sort(function (a, b) {
        if (!a.completed && b.completed) {
            return -1
        } else if (a.completed && !b.completed) {
            return 1
        } else {
            return 0
        }
    })
}

sortTodos(todos)
console.log(todos)

//console.log(getThingsToDo(todos))

// deleteTodo(todos, 'workout')
// console.log(todos)
