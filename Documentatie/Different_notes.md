Change in DB

Gen ai in DB un table Player, cu doua coloane: FirstName, Lastname
Si codezi appu incat sa citeasca coloanele amandoua. cand modifici o chestie, trb sa o faci "gracefully" incat sa nu crashuiesti vechiul cod
Gen, sa zicem ca atunci cand creezi un nou Player ai acele doua campuri obligatorii, ca trb sa ii stii nume si prenume
Si gen vine un coleg si adauga un al 3lea camp obligatoriu, Age
Dar uita sa schimbe in cod cand creeazi un player, sa ceara userului sa dea input si age
Ca sa stocheze in noul camp obligatoriu
Ce trb sa se intample aici, e ca modificarea din DB trb backwards compatible, adica trb sa fie specificat in DB ca fieldul Age sa aiba un default value 0, pt ca atunci cand vechiul cod adauga un player fara Age, sa fie adaugat Age = 0, ca sa nu crashuiasca DB

In mod normal schimbarile astea se faceau in vremurile de demult gen,

1. take production site down for maintenance
2. deploy change in Db to production
3. deploy new code to ask user also for age on "create player" page
4. inform users site is back up

But that used to take a full day. nowadays, de cand cu cloud computing, se poate asa, close to zero downtime for users:

1. clone DB in the cloud - you got Database A has only 2 fields in the Player table, Database B has 3 fields in Player table
2. implement code to ask for Age in frontend
3. adaugi un "feature toggle" mechanism (un simplu if case in cod) that says : "is Age feature deployed?" if yes, go to Database B, if not then stay on database A.
4. deploy frontend cu acest feature toggle, users can still work with old DB
5. deploy new DB with 3 fields in Player table
6. press the switch in the "feature toggle" mechanism to notify frontend that feature was deployed. users dont feel a thing, they will be instantly redirected to Database B ,when creating new players on "create player" page
7. now oyu have unnecesary code leftovers in frontend , acel toggle mechanism nu mai e necesar , since you got a new DB now - clean the code in frontend that makes this switch, redeploy frontend
8. remove the old DB in the cloud

=======================================================

internal
The type or member can be accessed by any code in the same assembly

Same assembly?

Acelasi dll file
Your visual studio solution file can contain multiple projects

---

static
Use the static modifier to declare a static member, which belongs to the type itself rather than to a specific object

Belongs to type rather than object, what does that mean? -> not needed to create object / instantiate class - can run its method directly

========================================================

SOLID Programming Priciples:

1. S: Single Responsibility Principle (SRP)
2. O: Open closed Principle (OSP)
3. L: Liskov substitution Principle (LSP)
4. I: Interface Segregation Principle (ISP)
5. D: Dependency Inversion Principle (DIP)

ISP - https://www.youtube.com/playlist?list=PLLWMQd6PeGY3ob0Ga6vn1czFZfW6e-FLr

=========================================================

so that when you initialize it cu cuvantul new Blabla(), all that needs to happen for it towork, is that Blabla implementeaza acea interface directly , or the interface that it implements la randu ei implementeaza interfata specificata in proprietatea currentWeapon

exemplu:

public IBlade currentWeapon

poti pune obiecte sharp in currentWEpaon, adica: currentWeapon = new Knife(), sau new Machete() , new Katana() etc etc

daca ai :
public IGun currentWeapon

poti zice currentWeapon= new Gun(), sau new MachineGun(), etc etc

dar daca spui
public IWeapon currentWeapon; (adica interfata cea mai generala posibila, pe care si IBlade , si IGun o implementeaza)

atunci poti asigna lu currentWeeapon literally orice:

currentWeapon = new Knife(), new Katana(), new Pistol(), etcetc

============================================================

class library -> dll -> not exe - reused as needed

virtual -> subclasses can extend this method (and override)
override -> overrides method or property from base class

Sometimes you need a base class from which to extract multiple things - default behaviour

1st ONE class extended, then interface(s) implemented

============================================================

All code written with C# -> part of .Net framework

Serialization - C# object -> JSON formatted text
Deserialization - JSON formatted text -> C# object

---

1. By default C# sends objects as XML to FE and we need JSON
   Hence we must transfrom the objects to JSON through 'serialization'
   The reverse of serialization, turning JSON into C# objects, is called 'deserialization'

   Newtonsoft.Json library is used for JSON serialization

2. You can override the ToString() method for your class

============================================================

Docker

- VM for system needed for a service
- For example push backend docker image to AWS

Docker CLI commands:

- docker pull -> fetches an image from docker hub
- docker images -a > lists all local images
- docker run -p 8000:8000 amazon/dynamodb-local -> launches connection to DB server
- docker container list - > lists containers on which local images are running

- aws dynamodb list-tables --endpoint-url http://localhost:8000 -> lists DB tables

=============================================================

ngClass -> toggles class based on condition

============================================================

AWS S3 CLI commands

aws s3 rm s3://bogdanbudaca.com/ --recursive

aws s3 sync . s3://bogdanbudaca.com/ --acl public-read

aws s3 cp MyFirstSite s3://bogdanbudaca.com/ --recursive --acl public-read

=============================================================

https://hub.docker.com/r/aaronshaf/dynamodb-admin/

1. start the dynamodb docker image cu docker run
2. docker pull aia de mai sus
3. configure cum scrie acolo cu endpointu de dynamodb local (localhost:8000 or whatv)
4. run gui, goto browser

==============================================================

SQL DB - tables - rows are values / columns are attributes - vertically scalable - add new resources

# NoSQL DB - key -> value pairs - horizontally scalable - add new machines

LINQ
https://docs.microsoft.com/en-us/dotnet/csharp/programming-guide/concepts/linq/

Lodash - Linq equivalent for JS
https://lodash.com/docs/

==============================================================

serialization - object -> json string

deserialization - json string -> object

==============================================================

sudo apt -y install npm;

sudo apt-get -y install gedit;

sudo snap install --classic code;

sudo apt -y install git;

sudo apt-get -y install lib32stdc++6;

sudo apt -y install awscli;

sudo apt -y install xclip;

==============================================================

{ "name":"Aspirina", "clasa":"A", "target":"ficat", "interactor": "Paracetamol" }

{ "name":"Paracetamol", "clasa":"B", "target":"raceala", "interactor": " " }

{ "name":"Algocalmin", "clasa":"X", "target":"dureri", "interactor": "Aspirina }

Relational DB - SQL - structured query language

MedicineTable

ID_PrimaryKey NAME CLASS TARGET

1 Asp A ficat

2 Para B raceala

3 Algo X dureri

InteractionsTable

ID_PrimaryKey FirstMedicine_ForeignKey SecondMedicine_ForeignKey

1 1 2

2 3 1

SELECT \* FROM InteractionsTable WHERE FirstMedicine='Med2' OR SecondMedicine='Med2' (query language)

=======================================

state mgmt - 'starea appului'

- redux store stocheaza starea de a fi logat a unui user - centralizeaza starea tuturor obiectelor din app in one place
  check store for any state needs

- reducers update the state

- action objects are passed to the reducers and they say 'this is what we want changed, and this is the value that we want it changed to'

- reducers must be pure functions

=======================================

There are 3 basic uses of functions:

    - mapping inputs to outputs

    - procedures - a list of instructions for the PC to follow - call it how many times it's needed (procedural programming)

    - I/O - network requests, UI, drawing to the screen etc.

    Mapping:

    	- input / arguments -> function -> output / return value

    	- like in math e.g. f(x) = 2x then f(2) = 4

    		- f(2) is equivalent to 4 -> this is called referential transparency (vs. opacity)

    Pure function (functional programming)

    	- given the same input it will always produce the same output

    	- produces no side effects

    	- is useful to avoid shared state and the resulting debugging

    	- giveaway that a function is impure is if it makes sense to call it without using its return value

    Impure function

    	- relies on time for example

    	- generating random numbers

    	- depends on I/O - user input, disk access, network

    Side effects

    	- in JS objects get reference so ops inside the function change original objects

    	- to avoid side effects - create a new objects from the original to work on

=======================================

## Functional Programming

Key concepts:

- Pure functions
- Function composition
- Avoid shared state
- Avoid mutating state
- Avoid side effects

### FP

- is the process of building software by composing pure functions, avoiding shared state, mutable data, and side-effects.
- is declarative rather than imperative, and application state flows through pure functions ; contrast with object oriented programming, where application state is usually shared and colocated with methods in objects.

### Pure functions

- Given the same inputs, always returns the same output
- Has no side-effects
- a very important property is referential transparency (you can replace a function call with its resulting value without changing the meaninf of the program)

### Function composition

- is the process of combining two or more functions in order to produce a new function or perform some computation
- e.g. the composition f . g (the dot means “composed with”) is equivalent to f(g(x)) in JavaScript

### Shared State

- is any variable, object, or memory space that exists in a shared scope, or as the property of an object being passed between scopes.
- a shared scope can include global scope or closure scopes.
- often, in object oriented programming, objects are shared between scopes by adding properties to other objects.
- when you avoid shared state, the timing and order of function calls don’t change the result of calling the function.
- with pure functions, given the same input, you’ll always get the same output. This makes function calls completely independent of other function calls, which can radically simplify changes and refactoring. A change in one function, or the timing of a function call won’t ripple out and break other parts of the program.

### Immutability

- an immutable object is an object that can’t be modified after it’s created.
- conversely, a mutable object is any object which can be modified after it’s created.

### Side Effects

- a side effect is any application state change that is observable outside the called function other than its return value. Side effects include:

Side effects include:

- Modifying any external variable or object property (e.g., a global variable, or a variable in the parent function scope chain)
- Logging to the console
- Writing to the screen
- Writing to a file
- Writing to the network
- Triggering any external process
- Calling any other functions with side-effects

### Reusability Through Higher Order Functions

- Functional programming tends to reuse a common set of functional utilities to process data.
- Object oriented programming tends to colocate methods and data in objects.
- In functional programming, any type of data is fair game.
- JavaScript has first class functions, which allows us to treat functions as data — assign them to variables, pass them to other functions, return them from functions, etc…
- A higher order function is any function which takes a function as an argument, returns a function, or both.

#### Higher order functions are often used to:

- Abstract or isolate actions, effects, or async flow control using callback functions, promises, monads, etc…
- Create utilities which can act on a wide variety of data types
- Partially apply a function to its arguments or create a curried function for the purpose of reuse or function composition
- Take a list of functions and return some composition of those input functions

#### Containers, Functors, Lists, and Streams

- A functor is something that can be mapped over. In other words, it’s a container which has an interface which can be used to apply a function to the values inside it.
- When you see the word functor, you should think “mappable”.
- The same map() utility can act on a variety of data types. It does that by lifting the mapping operation to work with a functor API. The important flow control operations used by map() take advantage of that interface. In the case of Array.prototype.map(), the container is an array, but other data structures can be functors, too — as long as they supply the mapping API.

(A list expressed over time is a stream)

### Declarative vs Imperative

- Functional programming is a declarative paradigm, meaning that the program logic is expressed without explicitly describing the flow control.
- Imperative programs spend lines of code describing the specific steps used to achieve the desired results — the flow control: How to do things.
- Declarative programs abstract the flow control process, and instead spend lines of code describing the data flow: What to do. The how gets abstracted away.
- Imperative code frequently utilizes statements. A statement is a piece of code which performs some action. Examples of commonly used statements include for, if, switch, throw, etc…
- Declarative code relies more on expressions. An expression is a piece of code which evaluates to some value. Expressions are usually some combination of function calls, values, and operators which are evaluated to produce the resulting value.

### Conclusion

Functional programming favors:

- Pure functions instead of shared state & side effects
- Immutability over mutable data
- Function composition over imperative flow control
- Lots of generic, reusable utilities that use higher order functions to act on many data types instead of methods that only operate on their colocated data
- Declarative rather than imperative code (what to do, rather than how to do it)
- Expressions over statements
- Containers & higher order functions over ad-hoc polymorphism

---

## RXJS

Use cases::

- mergeMap() - handy if you have multiple data sources and you want to merge them into one, where one of the data sources is the one telling you when the event emission happens (inner observable)
- switchMap() - for http requests - if you have some autocompletion functionality and you reach out to your server whenever the user types something, you don't want the old requests to continue whenever the user changes his opinion; you're sending a new request and want to cancel the old one / the old observables, so that you don't have to handle the data that will eventually come back, rxjs will handle that
- BehaviourSubject - typically used whenever you do use your Subject like a normal variable which should hold the value, but which you want to change eventually, and which should then inform other parts of the app of this change
