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

deleteTodo(todos, 'workout')
console.log(todos)
