# [CSS Pseudo-classes](https://www.w3schools.com/css/css_pseudo_classes.asp)
伪类
### definition:
A pseudo-class is used to define a special state of an element.
### syntax
```
selector:pseudo-class {
  property:value;
}
```
**Anchor Pseudo-classes**
```
/* unvisited link */
a:link {
  color: #FF0000;
}

/* visited link */
a:visited {
  color: #00FF00;
}

/* mouse over link */
a:hover {
  color: #FF00FF;
}

/* selected link */
a:active {
  color: #0000FF;
}
```

### CSS - The :first-child Pseudo-class
```
p:first-child {
  color: blue;
}
```

### Match the first <i> element in all <p> elements
```
p i:first-child {
  color: blue;
}
```
### [CSS - The :lang Pseudo-class](https://www.w3schools.com/css/tryit.asp?filename=trycss_lang)
可以自定义规则rule

### [All CSS Pseudo Classes](https://www.w3schools.com/css/css_pseudo_classes.asp)
### All CSS Pseudo Elements--见23-PseduoElement.md
::after
::before
::first-letter
::first-line
::selection