# 基本数据类型和方法

## JavaScript Strings
`var txt = "ABCDEF";`

### String Length
可以通过built-in length property来获取strings的长度
`var sln = txt.length;`

### Escape Character
转移字符`\`,需要转移的字符有，`'`,`"`,`\`

### Strings Can be Objects
```
var x = "John";
var y = new String("John");

// typeof x will return string
// typeof y will return object
```
> object是不可以使用`==,===`来比较的

## JavaScript String Methods

### Finding a String in a String
- indexOf
- lastIndexOf

### Searching for a String in a String
- search

### Extracting String Parts
- slice(start, end)
- substring(start, end)
- substr(start, length)

### Replacing String Content
- replace

### Converting to Upper and Lower Case
- toUpperCase()
- toLowerCase()

### Extracting String Characters
- charAt(position)
- charCodeAt(position)
- Property access [ ]
  
### Converting a String to an Array
- split()

[String Reference API](https://www.w3schools.com/jsref/jsref_obj_string.asp)

## JavaScript Numbers
**JavaScript Numbers are Always 64-bit Floating Point**

**NaN - Not a Number**

### Infinity
`Infinity` (or `-Infinity`) is the value JavaScript will return if you calculate a number outside the largest possible number.

### Hexadecimal
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

## JavaScript Number Methods
- toString
- toExponential
- toFixed
- toPrecision
- valueOf

### Converting Variables to Numbers
- Number()
- parseInt()
- parseFloat()

### Number Properties
- MAX_VALUE
- MIN_VALUE
- POSITIVE_INFINITY
- NEGATIVE_INFINITY
- NaN

[Number API](https://www.w3schools.com/jsref/jsref_obj_number.asp)

## JavaScript Array
数组的正常用法和其他语言类似
### Array Elements Can Be Objects
数组是特殊类型的对象。可以在数组中存放不同类型的对象，甚至可以在数组元素中存储数组。

### Array Properties and Methods
- length
- sort
- forEach
- push
  
### Associative Arrays
JavaScript中不支持这种命名索引(即HashMap)的数据类型---可以使用object代替
JavaScript array总是使用numbered indexe数字索引

### The Difference Between Arrays and Objects
arrays use **numbered indexes**.

objects use **named indexes**.

> Arrays are a special kind of objects, with numbered indexes

> Avoid new Array(), use `[]` instead

## JavaScript Array Methods
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

### JavaScript Sorting Arrays
- sort(cmp)
- reverse

### Sorting Object Arrays
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

## JavaScript Array Iteration Methods
Array iteration methods operate on every array item.

### Array.forEach()
```
var txt = "";
var numbers = [45, 4, 9, 16, 25];
numbers.forEach(myFunction);

function myFunction(value, index, array) {
  txt = txt + value + "<br>";
}
```

### Array.map()
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

### Array.filter()
The filter() method **creates a new array** with array elements that passes a test.
过滤出符合条件的元素
```
var numbers = [45, 4, 9, 16, 25];
var over18 = numbers.filter(myFunction);

function myFunction(value, index, array) {
  return value > 18;
}
```

### Array.reduce()
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

### Array.every()
和filter类似,只是不创建新的数组.
返回一个bool值
```
var allOver18 = numbers.every(myFunction);

function myFunction(value, index, array) {
  return value > 18;
}
```
### Array.some()
返回bool值

### Array.indexOf()
- indexOf(item, index)
- lastIndexOf(item, start)
- find()
- findIndexOf()

## JavaScript Date Objects
create Date
- new Date()
- new Date(dateString)
- new Date(milliseconds)

### Date Methods
- toUTCString
- toDateString

### JavaScript Date Format
- ISO Date
- Short Date
- Long Date

### Date Input - Parsing Dates
If you have a valid date string, you can use the Date.parse() method to convert it to milliseconds.
`Date.parse()` returns the number of milliseconds between the date and January 1, 1970.

You can then use the number of milliseconds to convert it to a date object.

### Date Get Method
[Date Get Methods](https://www.w3schools.com/jsref/jsref_obj_date.asp)
### Date Set Methods
[Date Set Method](https://www.w3schools.com/jsref/jsref_obj_date.asp)

## Math
[Math API](https://www.w3schools.com/jsref/jsref_obj_math.asp)

## Random and Booleans
[Booleans API](https://www.w3schools.com/jsref/jsref_obj_boolean.asp)