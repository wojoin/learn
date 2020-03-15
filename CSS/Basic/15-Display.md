### CSS Layout - The display Property
display属性时CSS布局中最重要的一个属性了。
display属性指定了元素如何显示。
每个元素都有一个display属性，对于大多数元素它的默认值是block或者inline

### Block-level Elements
display:block的展示方式为原始独占新的一行，一直延伸到最右边。
常用block属性值的元素有
div,h1-h6,p,form,header,footer,section

### Inline Elements
display:inline属性值不独占一行，只占元素需要的大小。
常用inline属性值的元素有
span,a,img

### Display: none;
这是JS中常用的，用于隐藏元素。
visibility:hidden;也可以隐藏一个元素(但是这个元素所占用的空间还在)，而display:none则不占原来的空间。

### [Override The Default Display Value](https://www.w3schools.com/css/css_display_visibility.asp)
即使所有元素都有默认的display的值，你也可以重写该属性值。
比如对li元素，修改display为inline，常用于面包屑菜单。
