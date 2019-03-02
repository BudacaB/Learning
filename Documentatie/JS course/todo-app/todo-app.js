const removeThe = document.querySelectorAll('p')

removeThe.forEach(function(p) {
    if (p.textContent.toLowerCase().includes('the')) {
        p.remove()
    }
})