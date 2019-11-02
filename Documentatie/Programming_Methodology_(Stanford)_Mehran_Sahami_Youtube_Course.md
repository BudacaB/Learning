## Stanford - Programming Methodology - Mehran Sahami - (Java)

Notes

OBOB – ‘off by one’ bug -> something needed to be done one more time

Top down design - starting from most complex

Bottom up design – starting from primitives

! Decomposition !

- Solve 1 problem
- Methods should have 1-15 lines
- Good names / naming
- Use comments

! Always write code that can be understood also by humans, use:

- Descriptive variable and method names
- Comments
- Separation of concerns

- High-level language – compiled (with compiler) to machine level language

  - Source code -> object code
  - Object files (compiled from source files) -> made into an executable file with a linker
  - Class files (compiled from source files- > made into JAR (java archive) -> JVM (Java VM) – Java interpreter approach for portability

- Superclass / subclass – subclass has properties inherited from the superclass + more ‘ proprietary’

label.setColor – ‘label’ = receiver / ‘setColor’ = message
Math.pow – ‘Math’ = class received / ‘pow’ = method message

---

Variable – name – starts with letter or ‘\_’

- Type
- Value

Primitive types – int (integer) – whole number

- Double – real value
- Boolean – logical value
- Char – character

int vs boolean -> how many vs how much

---

Hierarchy

GObject <- GLabel <- GRect <- GOval <- GLine

---

% - remainder

7 % 2 = 1

7 % 20 = 0 -> times 20 goes into 7

int / int – just int – truncates remainder

int / double -> double

CAST -> for a purpose / 1 operation – specify type

double y = 5/2 -> returns int only

double y = (double) 5/2 -> way to go

---

private static final double Pi = 3.14

private – defined only in class

static – lives for the class / is only 1

final – final value for constant

double - type

---

### Creating a method

Visibility type name (parameters) {
...body...
}

Parameters - none to multiple

Visibility - private - only used in a single class - Public

Type - type of return value

Void - doesn’t return anything

- return ‘expression’; -> method stops
- parameter has type and name as well
- multiple params; multiple returns - if … return ; else … return
- predicate method - return boolean

### Information hiding

Methods / functions -> do 1 thing - hiding the code from the user

### Local variable (vs instance variable) - local comp.

```
private void run() {
    int i; -> local - exists only in this method
} // declared in a method -> visible in method (also lives)
```

### Class

client -> user

implementor -> coder

### Instance variable (ivar)

- Declared in a class but not method (like constants/properties)
- Visible in entire object
  Lives as long as the object lives
  State

---

Random generator - first value is called Seed -> can be set

---

### Strings

String str -> string of characters - inside double quotes

string name = “Bog”;

int age = 20;

string s = “name: “ + name + “age: “ + age;

Name: Bog age: 20

string line = readline(“?”)

---

### Writing classes

public class name (extends superclass) {

…

}
! if not extending superclass - extends default class Object

In Java every class is a name.java file

- Contains methods, variables, costants
- Public or private

Public methods or variables in a class can be accessed in other classes - usually methods will be private

Passing parameter types

- Only objects get passed as reference - program knows where they live
- Other types are passed as copies - program doesn’t know where they live

---

instance var -> each obj. of a class has a different version of that variable

class var -> each obj. of a class refers to the same single variable - use ‘static’ (like constants)

All classes that are not in a program - extend a console program or graphics program- should always have a toString() -> returns some test to inform the user or return part of the info.

### Extending classes

- Build classes that extend functionality of existing classes
- Super - call superclass constructor in the subclass constructor method
- Subclass toString() method overrides/defines a new version of a that method -> in subclass private variables from superclass get accessed with ‘getters’ inside the toString() method

### Graphics

Layering is called the stacking order (or Z order)

GCanvas - represents background canvas of collage

- Graphics Program automatically creates GCanvas that fills the entire program window
- When you call add(...) in Graphics Program it is forwarding your call to GCanvas

### Interface (that programs work with)

- Set of methods
- Set of classes that have that set of methods
- Sometimes you want a set of classes to have a set of methods -> without having a hierarchical relationship
- Decoupling hierarchy

GCompound -> groups together multiple graphics objects within one object for usage

---

Asynchronous -> not in sequential order / depending on previous action

Events (mouse / keyboard) need listeners.

init() method - gets initialized at start of program (for example to call listeners) -> doesn’t do any actual work as opposed to run() method

---

### Enumeration

set numbers

set of items that go together

public static find int FRESHMAN = 1;

---

char ch

ch = “a”;

char 0 != digit 0 in ASCII

\ -> escape character - treat next chat as literal -> ch = ‘ \’ ’;

string s = readline();

char ch = s.charAt(0); -> isolates first char from s

```
public char toLower (char ch) {
    if (ch > ‘A’ && ch <= ‘Z’) {
        return ((ch - ’A’) + ‘a’);
    }
    return ch;
}
```

Sequenced in ASCII

‘a’ … ‘z’

‘A’ … ‘Z’

‘0’ … ‘9’

```
for (char ch =’A’; ch <= ‘Z’; ch ++) { … }
```

---

Class in Java called character

- it’s static -> not every object in that class has it, just the class

  char ch;

  ch = Character.toUpperCase(ch);

---

### String

string str = readline();

- immutable in Java -> can’t replace characters -> only if declared anew

char - primite type

string - class

char ch;

Ch = Character.toUpperCase(ch);

string str;

str = str.toUpperCase();

---

```
private int countUpperCase (string str) {
    int count = 0;
    for (int i = 0; i < str.length ; i++) {
        char ch = str.charAt(i);
        if (Character.isUpperCase(ch) {
            Count++;
        }
    }
    return count;
}
```

### Tokenizers

- Strings delimited by whitespace or others

```
import java.util.\*;
string line = readline();
string Tokenizer tokenizer = new StringTokenizer(line);
boolean hasMoreTokens();
string nextToken();
```

### Encryption

Caesar Cipher -> shift character order

---

### Memory (RAM)

bit - binary digit ->0 or 1

byte - 8 bits 0-255 integers

word - 4 bytes

kilobyte - 210 = 1024 bytes

megabyte - 1024K

gigabyte - 1024M

terabyte

petabyte

exabyte

zettabyte

yottabyte

---

### Hexadecimal (base 16)

0 A = 10

1 B = 11

2 C = 12

3 D = 13

4 E = 14

5 F = 15

6

7

8

9

0000

A000

A001

A002

…

FFFF

### Where are things stored:

- Static variables / constants - special location
- Dynamic variables = new GOval (...)
- Heap -> garbage collection
- Local variables - stack

1000 static/special

2000 heap

…

FFFF stack

int -> 4 bytes

char -> 2 bytes / 4 bytes

---

Primitive data types -> copies get passed around

Objects -> address to the actual object gets passed around

(Primitive data types can be encapsulated in objects to have them changed)

| Primitive | Class equivalent |
| --------- | ---------------- |
| int       | Integer          |
| boolean   | Boolean          |
| char      | Character        |

Don’t provide methods for changing primitives
double Double (immutable)

---

### Files

=> reading

myprog.java

1. Open

- object -> file (on disk)
- Buffered Reader

2. Read file (line by line)
3. Close

```
BufferedReader rd = new BufferedReader (new FileReader (“students.txt”))
while (true) {
    string line = rd.readline();
    if (line == null) break;
    println(line);
}
rd.close();
```

### Exception

=> “throws”

Let PC know that what you’re doing might throw an exception -> “try”

```
try {
    code for file access
}
catch (IOException ex) {
    deal w/ exception
}
```

---

```
private BufferedReader (string prompt) {
    BufferedReader rd = null;
    while (rd == null) {
        try {
            string name = readline (prompt);
            rd = new BufferedReader (new FileReader(name));
        } catch (IOException ex) {
            println (“bad file”);
        }
    }
}
return rd;
```

---

=> writing

1. Open

   PrintWriter

2. Write

   println

3. Close

---

### Array

- Ordered -> index
- Homogeneous -> stores same type

```
int [] myArray = new int [5];
myArray [0] = 5; -> assign value ‘5’ to 1st position in array

for (int i = 0; i < 5; i++) {
    myArr [i] = readInt(“?”);
}
```

type[] name = new type[size];

String[] slist = new String [100];

GOval[] circles = new GOval[10]; -> creates space for 10 GOvals - not created yet

GOval o = new GOval(0, 0, 100, 100) -> creates new GOval object

circles [0] = new GOval(0,0,100,100) -> sends oval to the 1st position in the circles array

---

x++ -> post increment -> first returns x then adds 1

++x -> pre increment -> adds 1 then returns x

---

Array:

| Actual size | Effective size |
| ----------- | -------------- |
| declared    | in use         |

---

```
private static final int SENTINEL = -1;
private static final int MAX.SIZE = 500;
public void run() {
    int[] mid = new int[MAX.SIZE];
    int numScores = 0;
    while (true) {
        int score = readInt(“?”)
        if (score == SENTINEL) break;
        mid[numScores++] = score;
    }
}
```

```
public void run() {
    int[] ar = new int [10];
    readArray(arr);
}
private void readArray (int[] a) {
    for (int i = 0; a.length > i; i++) {
        a[i] = readInt(“?”);
    }
}
```

! (Arrays get passed like objects -> actual array / address, not copies) ! -> changes persist

---

int [] arr = {2, 4, 6, 8};

---

### ArrayList

import java.util.\*;

ArrayList -> also called template -> when created it’s actually a class

ArrayList<String> strList = new ArrayList<String>();

string line = “Hello”;

strList.add(line); | append to end

strList.add(“there”); | append to end

strList.size(); -> int of how many elements

strList.get(i); -> get element of ith position

---

### Multidimensional arrays

Matrix -> grid of info - numbers -> 2D array

2x3

int [ ][ ] matrix = new int [2][3];

[0][0] [0][1] [0][2]

[1][0] [1][1] [1][2]

matrix [0][5] = 5 -> assign value to row 0 column 5

```
for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 3; j++) {
        Matrix [ i ][ j ] = 1;
    }
}
```

### ArrayList - import java.util.\*;

- Called template

### Class methods:

- boolean add (<T> element) -> adds to end ; always true
- void add (int index, <T> element) -> inserts before the position specified by index
- <T> remove (int index) -> removes element at index position and returns that value
- boolean remove (<T> element) -> removes the 1stinstance of element, if it appears -> returns true if a match is found
- void clear() -> removes all elements from the ArrayList
- int size() -> returns number of elements
- <T> get (int index) -> returns object at the specified index
- <T> set (int index, <T> value) -> sets the element at the specified index to the new value and returns the old value

```
public void run() {
    ArrayList <string> sList = new ArrayList <string>();
    while (true) {
        string line = readline (“?”);
        if (line.equals(“”)) break;
        sList.add(line);
    }
    for (int i = 0; i < sLine.size(); i++) {
        printll (sList.get(i));
    }
}
```

ArrayList holds **objects**

| primitive | class “wrapper”    |
| --------- | ------------------ |
| int       | ArrayList<Integer> |
| double    | Double             |
| bool      | Boolean            |
| char      | Character          |

int x = 5;

integer y = new Integer (x); -> (Boxing)

int z = y.intValue(); -> old way (Unboxing)

---

! Wrapper classes are also immutable !

---

### Multi-dim arrays

int [ ][ ] = new int [2][100]; (2 x 100)

scores [0][0] - single int

scores [0] -> int [ ]

ArrayList:

Pros:

- Dynamic resizing
- Other ops.

Cons:

- Less efficient than an array
- Syntax is bulky
- Pre version 5.0 -> really bad

---

### Debugging

Design - Architect

Coding - Engineer

Testing - Vandal (bang ‘till break)

Debugging - Detective

Design -> Development -> Debugging -> Deployment - x10 cost if issue is cascaded

Some causes:

- Bad variable values
- Faulty logic
- Unwarranted assumptions

1. Most problems -> SIMPLE
2. Be systematic
3. Assumptions about prob. < facts
4. Be critical of your code
5. Don’t panic!!!

Extra:

1. Use println to see values throughtout the code
2. Unit test -> testing individual methods / units

---

### Interface

-> Set of methods

-> Common functionality among set of classes

GObject

GRect -> Gfillable interface

GLabel -> not needed

```
public class ClassName implements InterfaceName { … }
(GRect class implemente Gfillable - behind the scene)
```

! Diff between extends class and implements interface is -> no superclass - sublcass hierarchical relationship with interfaces

E.g. ‘human’ extends ‘primate’ but implements ‘intelligence’ (‘dolphin’ implements intelligence as well)

! Can implement multiple interfaces

---

Map
Java interface

Way to associate:
Key
Value

E.g. dictionary - key - words
value - definitions
Phonebook etc.
HashMap (class) -> implements Map

template
-> 2 types - for key and for values

HashMap <String, String> dict = new HashMap <String, String>();
HashMap <String, Integer> phonebook = new HashMap <String, Integer>();

HashMap methods:
put (key, value) -> dict.put(key, value);
get -> dict.get(key); -> returns value / or null

phonebook.put (“Mehran”, 7236059);
phonebook.put (“Jenny”, 8675309);

Integer mNum = phonebook.get(“Mehran”);

phonebook.remove (key);
phonebook.containskey (key);
phonebook.size();

Iterator - (this is what Map, ArrayList provide)
List through set of values

ArrayList <String> names = new ArrayList <string>(); -> order
Iterator <Strings> it = names.iterator();
while (it.hasNext()) {
println (it.next());
}

Hashmap -> no order

GUI - Graphical User Interface

Buttons
Sliders
Checkboxes
Radio buttons
Combo box (dropdown)
Text box / form
Interactors ^

---

import jav.awt.event._;
import javax.swing._;

All elements are -> JComponent
JComponent <- Abstract Button <- JButton / JToggleButton

Window regions

In graphics or console Program, window -> divided in 5 regions: North, South, East, West, Center
Center -> action takes place
Console Prog adds a console to Center
GraphicsProgram puts a GCanvas to Center
Other regions are visible only if you add an interactor to them
Regions where interactors are placed -> Control Bars

Button

JButton but = new JButton (“Hi”);
(addActionlisteners();)
Add (but, SOUTH);

---

public void init() {
add (new JButton(“Hi”), SOUTH);
Add Actionlisteners();
}

public void actionPerformed (actionEvent) {
string cmd = e.getActionCommand();
if (cmd.equals (“Hi”)) {
println(“Hello”);
}
}

Checkbox

JCheckbox check = new JCheckbox (“Front”);
check.setSelected(true);
add (check, SOUTH);

---

sm = new JRadioButton (“small”);
…

Combobox

JComboBox pick = new JComboBox(); -> up in instance variables at beginning ^
pick.addItem (“Black”);
… (“Blue”)’ etc

pick.setEditable(false);
pick.setSelectedItem (“Black”);
add (pick, SOUTH);

Text Field

… init() {
JTextField tf = new JTextField(10);
tf.addActionListener(this);
add (tf, SOUTH);

public void ActionPerformed (ActionEvent e) {
if (e.getSource == tf ) {
println(“hi” + tf.getText())}

Layout

Border layout:
Console
Graphics

GridLayout (2, 3) - 2 rows & 3 columns -> fills screen
TableLayout (2, 3) -> only uses as much space needed max by the elements

Component / Container

Component - anything that can appear / be displayed in a generic window - at a generic level
Component <- Container <- everything else

listeners for components -> resizing the window

public class MyProg extend Program {
public void init() {
MyCanvas canvas = new MyCanvas();
add (Canvas);
}
}
public class MyCanvas extends GCanvas implements ComponentListener { … }

HashMap <string, Album> inventory = nwe HashMap <string, Album> ();

Searching and sorting - on arrays

The simpler of these 2 is searching -> finding an element in an array or some other kind of sequence
typically returns the index
element searching for is called key

Linear search -> start at the beginning of the array and look at each elem in turn - simplest
strategy

private int linearSearch(int key, int [] array) {
for (int i = 0; i < array.length: i++) {
if(key == array[i]) return i;
}
return -1;
}

Binary search

private int binarySearch(int key) {
int lh = 0;
int rh = disp.length() -1;
while (lh <= rh) {
int mid = (lh + rh) / 2;
if(key == disp.get(mid)) return mid;
if(key < disp.get(mid)) {
rh = mid - 1;
} else {
lh = mid + 1;
}
}
}

Efficiency - the running time of binary search also depends on the number of elem
On each step - it rules out half of the remaining possibilities in an ordered array
Worst case - number of steps required is equal to the number of times you can divide the original size of the array in half until there is only 1 elem remaining
l = N / 2 / / 2 / 2 …/ 2 -> k times
l = N / 2k -> k = log2N

Comparing search efficiencies

The difference in the number of steps required for the two search algorithms is illustrated by the following table - compares the values of N and the closest integer to log2N

N
log2N
10
3
100
7
1000
10
1000000
20
1000000000
30

Sorting

Binary search works only on arrays in which the elems are arranged in order.
Process of puttin the elements on an array in order -> sorting

Selection sort

private void sort (int [ ] array) {
for (int lh = 0; lh < array.length; lh++) {
int rh = findSmallest (array, lh, array.length);
swapElements (array, lh, rh);
}
}

lh -> points to each pos. in turn
rh -> points to smallest value in rest of array

Efficiency -> depends as well on size of array
Another way to estimate the running time is to count how many ops are required to sort an array of size N.
The number of ops involved in each call to findSmallest changes as the algorithm proceeds.

N(N + 1) / 2 = N2 + N -> reduce small things and simplify by dropping
Can intuitively hint speed as N2
Double input size -> square time that it took

Algorithms whose running times increase in proportion to the square of the problem size are said to be quadratic

Radix sort
Old technique - punched cards

Data structures

Online stores use a lot of data management
Social networks
Web search

Principles

nouns -> classes
verbs -> methods

Data -> unique identifier -> SSN / CNP etc.

Design

Collection of objects

Useful methods of collection

Classes that implement the Collection interface, such as ArrayList or the key set of HashMap, provide the following useful methods:
boolean add (<T> value) -> adds a specified value to the collection - returns true if the collection changes
boolean remove (<T> value) -> removes the first instance of the element if it appears, returns true if a match is found
void clear() -> removes all elements from the collection
int size() -> returns the number of elements in the collection
boolean contains (<T> value) -> returns true if the collection contains the specific value
boolean isEmpty() -> returns true is there’s no element in the collection
Iterator iterator() -> returns an iterator that allows the client to step through the values in the collection

Ex. Flytunes

add Songs
add Albums

Class Song
name String -> get
band String -> get
price double -> get + set
unique identifier

Class Album

name String
band String
list of songs - ArrayList
^
add list (iterating)

ArrayList <song> songs = new ArrayList <song> ();
HashMap <String, Album> albums = new ...
name object

Songs - object references contained
Stairway to heaven
L. Z.
0.49
Highway to hell
AC/DC
0.69
Eye of the tiger
Survivor
0.79

Song - created only once -> gets referenced in the album array -> Shallow Copy (vs. Deep Copy)

Social Network

profile / person
-> name (unique ID)
-> status (String)
-> image (GImage)
-> list of friends (names)

Friendship -> reciprocal

Concurrency

Email, IM, watching vid

The PCdoes one thing at a time but alternates very fast and makes it look simultaneous

Thread (of execution) - a program can have multiple threads of execution

Runnable

public class MyClass implements Runnable {
public MyClass|() {
…
}
public void run() {
}
}

MyClass X = new Myclass ();
Thread T = new Thread (X);
T.start();

One thread can execute stuff, one listens for events etc.
Shared data between threads.

ACM libraries
ACM - association for computing machinery

Standard Java

main -> method at which Java classes start running

main method header:
public static void main (String<> args) {
…
e.g. new NameSurfer().Start(args);
}
Without ACM and the libraries to help -> a lot more standard Java to write

What follows

CS106A
|
V
CS106B -> C++
Implement a hashmap
Recursion - ‘method calls itself’
n! = n x (n -1) x (n - 2) x … x 1
n! = n x (n - 1)!
‘define a function in terms of itself’

CS103A/B -> Discrete Math

Computability -> some functions can’t be computed

CS107 -> low - level (hardware - software interaction)
CS108 -> OO systems / larger apps

CS121 / 221 -> A>I> / robotics
Computational biology
Data analysis

CS140 - Op. systems
CS161 - data structures

Graphics
Movie graphics
Digital photography

Databases

Google.standford.edu
Mispelling of googol - 10100
Crypto -> Web. sec.

Machine Learning -> spam filtering

HCI - human-computer interactions

CS
EE - electrical engineering (hardware)
Math + Comp. Sci. -> math
Sym. Sys. -> symbolic systems
Linguistics
CS
Philosophy
Psychology

CS + business
Prod. mgmt.
Entrepreneurship
Finance ( computational)

CS + bio
Bio informatics - medical (BMI - bio-medical info.)
Genomics
Bio engineering

CS + Law
Digital media intelectual property, copyright, filesharing

CS (+CS)
Programming
Engineering mgmt.
Teaching (CS198)

CS198 - CS106A/B
Teach section
Social
Faculty
Network
