# JavaScript

- [JavaScript](#javascript)
  - [JavaScript Introduction](#javascript-introduction)
    - [JavaScript Can Change HTML Content](#javascript-can-change-html-content)
    - [JavaScript Can Change HTML Attribute Values](#javascript-can-change-html-attribute-values)
    - [JavaScript Can Change HTML Styles (CSS)](#javascript-can-change-html-styles-css)
  - [JavaScript Where To](#javascript-where-to)
    - [The script Tag](#the-script-tag)
    - [JavaScript Functions and Events](#javascript-functions-and-events)
    - [JavaScript in head or body tag](#javascript-in-head-or-body-tag)
    - [External JavaScript](#external-javascript)
    - [External References](#external-references)
  - [JavaScript Output](#javascript-output)
  - [JavaScript Statements](#javascript-statements)
  - [JavaScript Syntax](#javascript-syntax)
    - [Values(literals and variables两种类型)](#valuesliterals-and-variables%e4%b8%a4%e7%a7%8d%e7%b1%bb%e5%9e%8b)
    - [Literals](#literals)
    - [Variables](#variables)
    - [Operators](#operators)
    - [JavaScript Expressions](#javascript-expressions)
  - [JavaScript Variables](#javascript-variables)
  - [JavaScript Operators](#javascript-operators)
  - [JavaScript Data Types](#javascript-data-types)
    - [JavaScript Types are Dynamic](#javascript-types-are-dynamic)
    - [Empty Values](#empty-values)
    - [Primitive Data](#primitive-data)
    - [Complex Data](#complex-data)
  - [JavaScript Functions](#javascript-functions)
    - [JavaScript Function Syntax](#javascript-function-syntax)
    - [Function Invocation](#function-invocation)
    - [Function Return](#function-return)
    - [The () Operator Invokes the Function](#the--operator-invokes-the-function)
    - [Functions Used as Variable Values](#functions-used-as-variable-values)
    - [Local Variables](#local-variables)
  - [JavaScript Objects](#javascript-objects)
    - [Object Definition](#object-definition)
    - [Object Properties](#object-properties)
    - [Accessing Object Properties](#accessing-object-properties)
    - [Object Methods](#object-methods)
      - [The this Keyword](#the-this-keyword)
      - [Accessing Object Methods](#accessing-object-methods)
      - [new keyword](#new-keyword)
  - [JavaScript Events](#javascript-events)
    - [HTML Events](#html-events)
    - [Common HTML Events](#common-html-events)
  - [基本数据类型和方法-String,Number,Array,Date,Math,Random,Boolean](#%e5%9f%ba%e6%9c%ac%e6%95%b0%e6%8d%ae%e7%b1%bb%e5%9e%8b%e5%92%8c%e6%96%b9%e6%b3%95-stringnumberarraydatemathrandomboolean)
    - [JavaScript Strings](#javascript-strings)
      - [String Length](#string-length)
      - [Escape Character](#escape-character)
      - [Strings Can be Objects](#strings-can-be-objects)
    - [JavaScript String Methods](#javascript-string-methods)
      - [Finding a String in a String](#finding-a-string-in-a-string)
      - [Searching for a String in a String](#searching-for-a-string-in-a-string)
      - [Extracting String Parts](#extracting-string-parts)
      - [Replacing String Content](#replacing-string-content)
      - [Converting to Upper and Lower Case](#converting-to-upper-and-lower-case)
      - [Extracting String Characters](#extracting-string-characters)
      - [Converting a String to an Array](#converting-a-string-to-an-array)
    - [JavaScript Numbers](#javascript-numbers)
      - [Infinity](#infinity)
      - [Hexadecimal](#hexadecimal)
    - [JavaScript Number Methods](#javascript-number-methods)
      - [Converting Variables to Numbers](#converting-variables-to-numbers)
      - [Number Properties](#number-properties)
    - [JavaScript Array](#javascript-array)
      - [Array Elements Can Be Objects](#array-elements-can-be-objects)
      - [Array Properties and Methods](#array-properties-and-methods)
      - [Associative Arrays](#associative-arrays)
      - [The Difference Between Arrays and Objects](#the-difference-between-arrays-and-objects)
    - [JavaScript Array Methods](#javascript-array-methods)
      - [JavaScript Sorting Arrays](#javascript-sorting-arrays)
      - [Sorting Object Arrays](#sorting-object-arrays)
    - [JavaScript Array Iteration Methods](#javascript-array-iteration-methods)
      - [Array.forEach()](#arrayforeach)
      - [Array.map()](#arraymap)
      - [Array.filter()](#arrayfilter)
      - [Array.reduce()](#arrayreduce)
      - [Array.every()](#arrayevery)
      - [Array.some()](#arraysome)
      - [Array.indexOf()](#arrayindexof)
    - [JavaScript Date Objects](#javascript-date-objects)
      - [Date Methods](#date-methods)
      - [JavaScript Date Format](#javascript-date-format)
      - [Date Input - Parsing Dates](#date-input---parsing-dates)
      - [Date Get Method](#date-get-method)
      - [Date Set Methods](#date-set-methods)
    - [Math](#math)
    - [Random and Booleans](#random-and-booleans)
  - [JavaScript Statements](#javascript-statements-1)
    - [JavaScript Line Length and Line Breaks](#javascript-line-length-and-line-breaks)
    - [Data Type](#data-type)
    - [Variable](#variable)
    - [Operators](#operators-1)
    - [Statement:](#statement)
      - [if](#if)
      - [switch](#switch)
      - [Loop For](#loop-for)
      - [break](#break)
      - [continue](#continue)
  - [Type Conviersion-类型转换](#type-conviersion-%e7%b1%bb%e5%9e%8b%e8%bd%ac%e6%8d%a2)
    - [Data Type](#data-type-1)
    - [The typeof Operator](#the-typeof-operator)
    - [The constructor property](#the-constructor-property)
    - [JavaScript Type Conversion](#javascript-type-conversion)
      - [Converting Numbers to Strings](#converting-numbers-to-strings)
      - [Converting Booleans to Strings](#converting-booleans-to-strings)
      - [Converting Dates to Strings](#converting-dates-to-strings)
      - [Converting Strings to Numbers](#converting-strings-to-numbers)
      - [Converting Booleans to Numbers](#converting-booleans-to-numbers)
      - [Converting Dates to Numbers](#converting-dates-to-numbers)
      - [Automatic String Conversion](#automatic-string-conversion)
  - [JavaScript Regular Expressions](#javascript-regular-expressions)
    - [Syntax](#syntax)
    - [Using String Methods](#using-string-methods)
    - [Regular Expression Modifiers](#regular-expression-modifiers)
    - [Regular Expression Patterns](#regular-expression-patterns)
    - [Using the RegExp Object](#using-the-regexp-object)
  - [JavaScript Errors - Throw and Try to Catch](#javascript-errors---throw-and-try-to-catch)
    - [The Error Object](#the-error-object)
  - [JavaScript Hoisting(写代码时遵守先declare在use的规则)](#javascript-hoisting%e5%86%99%e4%bb%a3%e7%a0%81%e6%97%b6%e9%81%b5%e5%ae%88%e5%85%88declare%e5%9c%a8use%e7%9a%84%e8%a7%84%e5%88%99)
    - [The let and const Keywords](#the-let-and-const-keywords)
  - [JavaScript Stric Mode](#javascript-stric-mode)
    - [JavaScript this keyword](#javascript-this-keyword)
    - [this in a Method](#this-in-a-method)
    - [this Alone](#this-alone)
    - [this in a Function (Default)](#this-in-a-function-default)
    - [this in Event Handlers](#this-in-event-handlers)
    - [Explicit Function Binding](#explicit-function-binding)
  - [JavaScript Let](#javascript-let)
    - [JavaScript Block Scope](#javascript-block-scope)
    - [Loop Scope](#loop-scope)
  - [JavaScript Const](#javascript-const)
  - [JavaScript Array Function](#javascript-array-function)
    - [What About this?](#what-about-this)
  - [JavaScript Classes](#javascript-classes)
    - [Class Definition](#class-definition)
    - [Methods](#methods)
    - [Static Methods](#static-methods)
    - [Inheritance](#inheritance)
    - [Getters and Setters](#getters-and-setters)
    - [JavaScript Debugging](#javascript-debugging)


## JavaScript Introduction
### JavaScript Can Change HTML Content
`document.getElementById("demo").innerHTML = "Hello JavaScript";`

### [JavaScript Can Change HTML Attribute Values](https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_lightbulb)
JavaScript changes the value of the `src` (source) attribute of an `<img>` tag

### JavaScript Can Change HTML Styles (CSS)
`document.getElementById("demo").style.fontSize = "35px";`

## JavaScript Where To
### The script Tag
```
<script>
...
</script>
```

### JavaScript Functions and Events
`function` is a block of JavaScript code.that can be executed when "called" for.

For example, a function can be called when an `event` occurs, like when the user clicks a button.
`Event`是调用`Function`的一个场景

### JavaScript in head or body tag

### External JavaScript
`<script src="myScript.js"></script>`

### External References
`<script src="https://www.w3schools.com/js/myScript1.js"></script>`



## JavaScript Output
- `innerHTML`--输出到元素上
- `document.write()`--输出到HTML文档中,在输出数据后，会情况HTML文档中的所有元素。
- `window.alert()`--输出到弹出框中
- `console.log()`--输出后浏览器控制台中

## JavaScript Statements
instructions -> statements -> (blocks) -> JavaScript program

statement由分号隔开并标识一条语句,block是将statement分组在一起，放在花括号{}中的代码。
`function`正是block的一种方式。

```
function myFunction() {
  document.getElementById("demo1").innerHTML = "Hello Dolly!";
  document.getElementById("demo2").innerHTML = "How are you?";
}
```

> 由此可见statement的分号和block的花括号是两个很重要的符号。

## JavaScript Syntax
### Values(literals and variables两种类型)
The JavaScript syntax defines two types of values: Fixed values and variable values.

Fixed values are called `literals`. Variable values are called `variables`.
### Literals
3.14
"John Doe"
### Variables
```
var x;
x = 6;
```
### Operators
- arithmetic operators: `+,-,*,/`
- assignment operator:`=`
- ...

### JavaScript Expressions
An expression is a combination of values(**literals**), variables, and operators, which computes to a value.
The computation is called an evaluation.
```
---------
Literals|-------------------
--------|                  |
    |                      |
----------                 |      -------------       ------------       ------------       ---------
Variables|-----------------|----> |Expressions| ----> |Statements| ----> |Functions | ----> |Program|
---------|                 |      ------------|       -----------|       -----------|       ---------
    |                      |
----------                 |
Operators|-----------------|
---------|
```


## JavaScript Variables
```
var carName;  //这是变量carName为undefined状态
carName = "BMW"
```

## JavaScript Operators
- Arithmetic Operators:`+,-,*,/,%,++,--`
- String Operators: +
- Comparison Operators:==,!=,>,<,>=,<=
- Logical Operators:&&,||,!
- Type Operators: typeof, instanceof
- Bitwase Operators:&,|,^,~,<<,>>
- Assignment Operators:=,+=,-=,*=,/=,%=
- Conditional Operators:?:

## JavaScript Data Types
### JavaScript Types are Dynamic
JavaScript has dynamic types. This means that the same variable can be used to hold different data types:
```
var x;           // Now x is undefined
x = 5;           // Now x is a Number
x = "John";      // Now x is a String
```

- Strings
- Numbers
- Booleans
- Array
- Objects
- Undefined

### Empty Values
```
var car = "";    // The value is "", the typeof is "string", not undefined
```

### Primitive Data
- strings
- number
- boolean
- undefined

### Complex Data
- function
- object

## JavaScript Functions
A JavaScript function is **a block of code** designed to perform a particular task.
A JavaScript function is executed when "something" invokes it (calls it).


### JavaScript Function Syntax
```
function name(parameter1, parameter2, parameter3) {
  // code to be executed
}
```
### Function Invocation
调用方法有
- event occurs
- 其他函数调用
- 自动调用

### Function Return
`return`

### The () Operator Invokes the Function
通过加()来调用函数
### Functions Used as Variable Values
```
var x = toCelsius(77);  // function result存在x中
var text = "The temperature is " + x + " Celsius";
```

### Local Variables
function内部的变量全部是`LOCAL`的

## JavaScript Objects
### Object Definition
`var person = {firstName:"John", lastName:"Doe", age:50, eyeColor:"blue"};`
可以将这个person object看成是多个变量的集合，类似于HashMap

### Object Properties
`name:values`这样的键值对叫做properties,`name`为property,
`value`为property value.

### Accessing Object Properties
`objectName.propertyName` or `objectName["propertyName"]`

### Object Methods
Methods are stored in properties as **function definitions**.

```
var person = {
  firstName: "John",
  lastName : "Doe",
  id       : 5566,
  fullName : function() {
    return this.firstName + " " + this.lastName;
  }
};
```
> A method is a function stored as a property.
> method是属性的特殊形式。

#### The this Keyword
上面例子中`this`指的是person object
#### Accessing Object Methods
`name = person.fullName();`

#### new keyword
使用`new`关键字声明变量时，该变量为Object

## JavaScript Events
### HTML Events
Often, when events happen, you may want to do something.
JavaScript lets you execute code when events are detected.

HTML allows **event handler attributes**, with JavaScript code, to be added to HTML elements.

> event hander也是一个属性,和object的method一样的道理

如:
`<element event="some JavaScript">`

`<button onclick="document.getElementById('demo').innerHTML = Date()">The time is?</button>`

```
<button onclick="displayDate()">The time is?</button>

<script>
function displayDate() {
  document.getElementById("demo").innerHTML = Date();
}
</script>
```

### Common HTML Events
- onclick
- onchange
- onmouseover
- onmouseout
- onkeydown
- onload

[HTML DOM Events](https://www.w3schools.com/jsref/dom_obj_event.asp)

关于event,event handler更多的内容可以参考[HTML DOM](https://www.w3schools.com/js/js_htmldom.asp)

## 基本数据类型和方法-String,Number,Array,Date,Math,Random,Boolean
### JavaScript Strings
`var txt = "ABCDEF";`

#### String Length
可以通过built-in length property来获取strings的长度
`var sln = txt.length;`

#### Escape Character
转移字符`\`,需要转移的字符有，`'`,`"`,`\`

#### Strings Can be Objects
```
var x = "John";
var y = new String("John");

// typeof x will return string
// typeof y will return object
```
> object是不可以使用`==,===`来比较的

### JavaScript String Methods

#### Finding a String in a String
- indexOf
- lastIndexOf

#### Searching for a String in a String
- search

#### Extracting String Parts
- slice(start, end)
- substring(start, end)
- substr(start, length)

#### Replacing String Content
- replace

#### Converting to Upper and Lower Case
- toUpperCase()
- toLowerCase()

#### Extracting String Characters
- charAt(position)
- charCodeAt(position)
- Property access [ ]
  
#### Converting a String to an Array
- split()

[String Reference API](https://www.w3schools.com/jsref/jsref_obj_string.asp)

### JavaScript Numbers
**JavaScript Numbers are Always 64-bit Floating Point**

**NaN - Not a Number**

#### Infinity
`Infinity` (or `-Infinity`) is the value JavaScript will return if you calculate a number outside the largest possible number.

#### Hexadecimal
`var x = 0xFF;        // x will be 255`

Numbers.toString(base)，默认是10进制
```
var myNumber = 32;
myNumber.toString(10);  // returns 32
myNumber.toString(32);  // returns 10
myNumber.toString(16);  // returns 20
myNumber.toString(8);   // returns 40
myNumber.toString(2);   // returns 100000
```

### JavaScript Number Methods
- toString
- toExponential
- toFixed
- toPrecision
- valueOf

#### Converting Variables to Numbers
- Number()
- parseInt()
- parseFloat()

#### Number Properties
- MAX_VALUE
- MIN_VALUE
- POSITIVE_INFINITY
- NEGATIVE_INFINITY
- NaN

[Number API](https://www.w3schools.com/jsref/jsref_obj_number.asp)

### JavaScript Array
数组的正常用法和其他语言类似
#### Array Elements Can Be Objects
数组是特殊类型的对象。可以在数组中存放不同类型的对象，甚至可以在数组元素中存储数组。

#### Array Properties and Methods
- length
- sort
- forEach
- push
  
#### Associative Arrays
JavaScript中不支持这种命名索引(即HashMap)的数据类型---可以使用object代替
JavaScript array总是使用numbered indexe数字索引

#### The Difference Between Arrays and Objects
arrays use **numbered indexes**.

objects use **named indexes**.

> Arrays are a special kind of objects, with numbered indexes

> Avoid new Array(), use `[]` instead

### JavaScript Array Methods
- toString()
- join()
- push and pop
- shift - remove the first element from Array
- unshift - add a element to array at the beginning
- delete arrname[0] -delete a element
- splice(added, removed, elements)
  - splice(0, 1) - remove the first element
- concat() - merge array
- slice() - slice array
  
[Array API](https://www.w3schools.com/jsref/jsref_obj_array.asp)

#### JavaScript Sorting Arrays
- sort(cmp)
- reverse

#### Sorting Object Arrays
```
var cars = [
  {type:"Volvo", year:2016},
  {type:"Saab", year:2001},
  {type:"BMW", year:2010}
];

cars.sort(function(a, b){return a.year - b.year});

function sortByType() {
  cars.sort(function(a, b){
    var x = a.type.toLowerCase();
    var y = b.type.toLowerCase();
    if (x < y) {return -1;}
    if (x > y) {return 1;}
    return 0;
  });
}
```

### JavaScript Array Iteration Methods
Array iteration methods operate on every array item.

#### Array.forEach()
```
var txt = "";
var numbers = [45, 4, 9, 16, 25];
numbers.forEach(myFunction);

function myFunction(value, index, array) {
  txt = txt + value + "<br>";
}
```

#### Array.map()
- The map() method **creates a new array** by performing a function on each array element.
- The map() method does not execute the function for array elements without values.
- The map() method does not change the original array.

对数组中存在的每个元素执行function, 创建出新的数组---这好像是大数据MapReduce的原型吧。

```
var numbers1 = [45, 4, 9, 16, 25];
var numbers2 = numbers1.map(myFunction);

function myFunction(value, index, array) {
  return value * 2;
}
```

#### Array.filter()
The filter() method **creates a new array** with array elements that passes a test.
过滤出符合条件的元素
```
var numbers = [45, 4, 9, 16, 25];
var over18 = numbers.filter(myFunction);

function myFunction(value, index, array) {
  return value > 18;
}
```

#### Array.reduce()
The reduce() method runs a function on each array element to produce (reduce it to) a single value.

calcuate the sum
```
var numbers1 = [45, 4, 9, 16, 25];
var sum = numbers1.reduce(myFunction);
// var sum = numbers1.reduce(myFunction, 100); accept an initial value 100

function myFunction(total, value, index, array) {
  return total + value;
}
四个参数的含义
The total (the initial value / previously returned value)
The item value
The item index
The array itself
```

#### Array.every()
和filter类似,只是不创建新的数组.
返回一个bool值
```
var allOver18 = numbers.every(myFunction);

function myFunction(value, index, array) {
  return value > 18;
}
```
#### Array.some()
返回bool值

#### Array.indexOf()
- indexOf(item, index)
- lastIndexOf(item, start)
- find()
- findIndexOf()

### JavaScript Date Objects
create Date
- new Date()
- new Date(dateString)
- new Date(milliseconds)

#### Date Methods
- toUTCString
- toDateString

#### JavaScript Date Format
- ISO Date
- Short Date
- Long Date

#### Date Input - Parsing Dates
If you have a valid date string, you can use the Date.parse() method to convert it to milliseconds.
`Date.parse()` returns the number of milliseconds between the date and January 1, 1970.

You can then use the number of milliseconds to convert it to a date object.

#### Date Get Method
[Date Get Methods](https://www.w3schools.com/jsref/jsref_obj_date.asp)
#### Date Set Methods
[Date Set Method](https://www.w3schools.com/jsref/jsref_obj_date.asp)

### Math
[Math API](https://www.w3schools.com/jsref/jsref_obj_math.asp)

### Random and Booleans
[Booleans API](https://www.w3schools.com/jsref/jsref_obj_boolean.asp)


## JavaScript Statements
语句由Values, Operators, Expressions, Keywords, and Comments组成
分号`Semicolons;`用于分隔语句

### JavaScript Line Length and Line Breaks
Line Length: 80
Line break after  an operator.
```
document.getElementById("demo").innerHTML =
"Hello Dolly!";
```
### Data Type
- number
- string
- boolean
- null
- undefined
- object
- function
### Variable
definition
`var age;`
variable scope
    global and local(in function)
### Operators
Arithmetic Operators:`+,-,*,/,%,++,--`
String Operators: +
Comparison Operators:==,!=,>,<,>=,<=
Logical Operators:&&,||,!
Type Operators: typeof, instanceof
[Bitwase Operators](https://www.w3schools.com/js/js_bitwise.asp):&,|,^,~,<<,>>
Assignment Operators:=,+=,-=,*=,/=,%=
Conditional Operators:?:
Miscellaneous Operator:typeof

### Statement:
#### if
    ```
    if...else
        1. if
        2. if...else
        3. if...else if...else
    ```
#### switch
    ```
    switch...case
        switch (expression) {
        case condition 1: statement(s)
        break;
        
        case condition 2: statement(s)
        break;
        ...
        
        case condition n: statement(s)
        break;
        
        default: statement(s)
    }
    ```
#### Loop For

Different Kinds of Loops
`for` - loops through a block of code a number of times

`for/in` - loops through the properties of an **object**

`for/of` - loops through the values of an iterable object, such as Arrays, Strings, Maps, NodeLists, and more.

`while` - loops through a block of code while a specified condition is true

`do/while` - also loops through a block of code while a specified condition is true

```
// for
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}

// for/in
var person = {fname:"John", lname:"Doe", age:25};

var text = "";
var x;
for (x in person) {
  text += person[x];
}

// for/of
var cars = ['BMW', 'Volvo', 'Mini'];
var x;

for (x of cars) {
  document.write(x + "<br >");
}

```

#### break
break后面可以跟着label

#### continue
和其他语言类似


## Type Conviersion-类型转换
### Data Type
五种值类型(直接包含值的数据类型)--基础数据类型
- string
- number
- boolean
- object
- function

六种对象类型
- String
- Number
- Boolean
- Object
- Date

两个不能包含值得数据类型
- null
- undefined

### The typeof Operator
`typeof`操作符可以知道变量的数据类型
```
typeof "Jon"
typeof 3.14
...
```

typeof操作符和其他操作符，比如+,-,*,/一样，没有数据类型

### The constructor property
JS中的所有变量都有一个constructor属性,调用时返回constructor函数
```
"John".constructor                // Returns function String()  {[native code]}
(3.14).constructor                // Returns function Number()  {[native code]}
false.constructor                 // Returns function Boolean() {[native code]}
[1,2,3,4].constructor             // Returns function Array()   {[native code]}
{name:'John',age:34}.constructor  // Returns function Object()  {[native code]}
new Date().constructor            // Returns function Date()    {[native code]}
function () {}.constructor        // Returns function Function(){[native code]}

```

### JavaScript Type Conversion
JS变量可以转换到一个新的变量或者另外一个数据类型
- 通过显式的转换函数(constructor返回的函数)
- JS自身自动转换

#### Converting Numbers to Strings

String(123)
(123).toString()daq

#### Converting Booleans to Strings
String(false)
#### Converting Dates to Strings
String(Date())
Date().toString()

#### Converting Strings to Numbers
Number("3.14")
`parseFloat(),parseInt()`

#### Converting Booleans to Numbers
Number(false) // 0
Number(true)  // 1

#### Converting Dates to Numbers
`Number(new Date());`
or 
```
d = new Date()
d.getTime();
```
#### Automatic String Conversion
JavaScript automatically calls the variable's toString() function when you try to "output" an object or a variable:
`document.getElementById("demo").innerHTML = myVar;`

## JavaScript Regular Expressions
A regular expression is a sequence of characters that forms a **search pattern**.

The search pattern can be used for **text search** and **text replace** operations.

### Syntax
`/patern/modifier`
/pattern用于text search
/modifier用于text replace

### Using String Methods
 regular expression通常与`search()`和`replace()`这两个方法一起使用。
 `search()`用于text search, `replace()`用于text replace

### Regular Expression Modifiers
有以下三种
- i, 忽略大小写
- g, 全局搜索
- m, 多次匹配

### Regular Expression Patterns
- [abc]
- [0-9]
- (x|y)

**Metacharacters** are characters with a special meaning
- `\d`
- `\s`
- `\b`
**Quantifiers** define quantities--量词
- n+, 至少一次
- n*, 0或多次
- n?, 0或一次

### Using the RegExp Object
In JavaScript, the RegExp object is a regular expression object with predefined properties and methods.

- test()
- exec()

[RegExp API](https://www.w3schools.com/jsref/jsref_obj_regexp.asp)

## JavaScript Errors - Throw and Try to Catch
try,catch, throw, finally

### The Error Object
JavaScript has a built in error object that provides error information when an error occurs.

The error object provides two useful properties: name and message.

Six different values can be returned by the error name property:
- EvalError
- RangeError
- ReferenceError
- SyntaxError
- TypeError
- URIError
  
## JavaScript Hoisting(写代码时遵守先declare在use的规则)
JS中的变量是可以先使用在声明的。
Hoisting is JavaScript's default behavior of moving all declarations to the top of the current scope (to the top of the current script or the current function).

```
x = 5; // Assign 5 to x

elem = document.getElementById("demo"); // Find an element
elem.innerHTML = x;                     // Display x in the element

var x; // Declare x
```

Hoisting

```
var x; // Declare x
x = 5; // Assign 5 to x

elem = document.getElementById("demo"); // Find an element
elem.innerHTML = x;                     // Display x in the element
```

### The let and const Keywords
Variables and constants declared with let or const are not hoisted!

## JavaScript Stric Mode
The "use strict"; Syntax
The syntax, for declaring strict mode, was designed to be compatible with older versions of JavaScript.

The `this` keyword in functions behaves differently in strict mode.
The `this` keyword refers to the object that called the function.


### JavaScript this keyword
`this`在不同的场景下有不同的含义
- function
- method
- event
- alone单独使用

```
var person = {
  firstName: "John",
  lastName : "Doe",
  id       : 5566,
  fullName : function() {
    return this.firstName + " " + this.lastName;
  }
};
```

### this in a Method
In an object method, this refers to the "owner" of the method.

In the example on the top of this page, `this` refers to the **person object**.

### this Alone
When used alone, the owner is the Global object, so this refers to the `Global object`.

In a browser window the Global object is `[object Window]`.

### this in a Function (Default)
In a JavaScript function, the owner of the function is the `default` binding for `this`.

So, in a function, this refers to the Global object `[object Window]`.

### this in Event Handlers
In HTML event handlers, `this` refers to the HTML element that received the event:
指的是点击的元素

### Explicit Function Binding
The `call()` and `apply()` methods are predefined JavaScript methods.
They can both be used to call an object method with another object as argument.

`functionName.call(argument)`的语法调用`call和apply`

```
var person1 = {
  fullName: function() {
    return this.firstName + " " + this.lastName;
  }
}
var person2 = {
  firstName:"John",
  lastName: "Doe",
}
person1.fullName.call(person2);  // Will return "John Doe"
```

person1.fullName中的this在`person1.fullName.call(person2);`这行代码中指的是person2这个对象。

[this keyword](https://www.w3schools.com/js/js_this.asp)

## JavaScript Let
ES2015 introduced two important new JavaScript keywords: `let` and `const`.
These two keywords provide **Block Scope** variables (and constants) in JavaScript.

Before ES2015, JavaScript had only two types of scope: **Global Scope** and **Function Scope**. 

### JavaScript Block Scope
Variables declared inside a block {} can be accessed from outside the block.

```
{
  var x = 2;
}
// x CAN be used here
```

Variables declared with the `let` keyword can **have Block Scope**.

Variables declared inside a block `{}` can not be accessed from outside the block:

```
{
  let x = 2;
}
// x can NOT be used here
```

### Loop Scope
using `var` in a loop
```
var i = 5;
for (var i = 0; i < 10; i++) {
  // some statements
}
// Here i is 10
```

using `let` in a loop
```
let i = 5;
for (let i = 0; i < 10; i++) {
  // some statements
}
// Here i is 5
```

## JavaScript Const
与let类似

## JavaScript Array Function
Arrow functions were introduced in ES6.
Before:
```
hello = function() {
  return "Hello World!";
}
```

With Arrow Function
```
hello = () => {
  return "Hello World!";
}
// the function has only one statement, and the statement returns a value
hello = () => "Hello World!";

// If you have parameters, you pass them inside the parentheses:
hello = (val) => "Hello " + val;


// if have only one parameter, you can skip the parentheses as well
hello = val => "Hello " + val;
```

### What About this?
With arrow functions the `this` keyword **always represents the object that defined the arrow function**.

```
//Arrow Function:
hello = () => {
  document.getElementById("demo").innerHTML += this; // 这里的this总是window
}

```
## JavaScript Classes
ES6, also known as ECMAScript2015, introduced classes.
### Class Definition

Use the keyword `class` to create a class, and always add the `constructor()` method.

The constructor method is called each time the class object is initialized.
```
class Car {
  constructor(brand) {
    this.carname = brand;
  }
}

mycar = new Car("Ford");
```
> The constructor method is called automatically when the object is initialized.

### Methods
Create a method named "present"
```
class Car {
  constructor(brand) {
    this.carname = brand;
  }
  present() {
    return "I have a " + this.carname;
  }

  present2(x) {
    return x + ", I have a " + this.carname;
  }
}

mycar = new Car("Ford");
document.getElementById("demo").innerHTML = mycar.present();
//document.getElementById("demo").innerHTML = mycar.present2("Hello");
```

### Static Methods
Static methods are defined on the class itself, and not on the prototype.

```
class Car {
  constructor(brand) {
    this.carname = brand;
  }
  static hello() {
    return "Hello!!";
  }
}

//Call 'hello()' on the class Car:
document.getElementById("demo").innerHTML = Car.hello();
```

If you want to **use the mycar object inside the static method**, you can send it as a parameter:
```
class Car {
  constructor(brand) {
    this.carname = brand;
  }
  static hello(anotherCar) {
    return "Hello " + anotherCar.carname;
  }
}

mycar = new Car("Ford");

document.getElementById("demo").innerHTML = Car.hello(mycar);
```
> 这就有点类似于将对象当作参数的意思。

### Inheritance
To create a class inheritance, use the `extends` keyword.
继承父类的所有方法
```
class Car {
  constructor(brand) {
    this.carname = brand;
  }
  present() {
    return 'I have a ' + this.carname;
  }
}

class Model extends Car {
  constructor(brand, mod) {
    super(brand); // refers to the parent class
    this.model = mod;
  }
  show() {
    return this.present() + ', it is a ' + this.model;
  }
}

mycar = new Model("Ford", "Mustang");
document.getElementById("demo").innerHTML = mycar.show();
```

### Getters and Setters
To add getters and setters in the class, use the `get` and `set` keywords.

```
class Car {
  constructor(brand) {
    this.carname = brand;
  }
  get cnam() {
    return this.carname;
  }
  set cnam(x) {
    this.carname = x;
  }
}

mycar = new Car("Ford");

document.getElementById("demo").innerHTML = mycar.cnam;  //调用get方法cnam的时候没有加上括号
```
> class object调用get方法时需要加括号
> To use a setter, use the same syntax as when you set a property value, without parentheses

```
class Car {
  constructor(brand) {
    this._carname = brand;
  }
  get carname() {
    return this._carname;
  }
  set carname(x) {
    this._carname = x;
  }
}

mycar = new Car("Ford");
mycar.carname = "Volvo";
document.getElementById("demo").innerHTML = mycar.carname;
```

### JavaScript Debugging
The debugger keyword stops the execution of JavaScript, and calls (if available) the debugging function.

This has the same function as setting a breakpoint in the debugger.

If no debugging is available, the debugger statement has no effect.

With the debugger turned on, this code will stop executing before it executes the third line.
F12即可
```
var x = 15 * 5;
debugger;
document.getElementById("demo").innerHTML = x;
```