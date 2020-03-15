# [CSS Layout - float and clear](https://www.w3schools.com/css/css_float.asp)
float定义了元素浮动展示的方式(包含在某个元素内的一个元素，如<p><img /></p>)
- left - The element floats to the left of its container
- right - The element floats to the right of its container
- none - The element does not float (will be displayed just where it occurs in the text). This is default
- inherit - The element inherits the float value of its parent
  
### Clear
clear属性指定了什么元素可以浮动在使用clear属性元素的周围。

> The clear property specifies what elements can float beside the cleared element and on which side.

- none - Allows floating elements on both sides. This is default
- left - No floating elements allowed on the left side
- right- No floating elements allowed on the right side
- both - No floating elements allowed on either the left or the right side
inherit - The element inherits the clear value of its parent

### [The clearfix Hack](https://www.w3schools.com/css/css_float.asp)
当浮动的元素超过它的容器大小(父元素的大小)时，可以使用overflow:auto来解决.

### [box-sizing](https://www.w3schools.com/css/css_float.asp)属性可以解决当内容比box大时导致box break的情况

### Flexbox
创建同样大小的height的box时容易的，但是box中的内容却是大不一样的，有的内容很多很大，一直box容纳不下，这使得超过box的内容展示在box的外面，于是CSS3 Flexbox的引入来解决这个问题，会自动延伸box大小来适配内容,延伸后box的大小为最大的那个(惨开Flexbox.html)

### [Navigation Menu](https://www.w3schools.com/css/css_float.asp)

使用float属性和display: inline-block可以做一个Navigation Menu，参考NavgationMenu.html

