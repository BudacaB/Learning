import { getNotes, createNote, removeNote, updateNote } from './notes'
import { getFilters, setFilters } from './filters'

// console.log(getNotes())
// createNote()
//removeNote('02d3f017-7d60-4676-853c-b622c34edfae')

// updateNote('2da64071-5a31-44dd-bbf9-e90fb26151a5', {
//     title: 'My note title',
//     body: 'This is the body for my note'
// })
//console.log(getNotes())

console.log(getFilters())
setFilters({
    searchText: 'Office',
    sortBy: 'byCreated'
})
console.log(getFilters())