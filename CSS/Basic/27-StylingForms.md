# CSS Forms
这其实是使用上一届的CSS Attr Selector来实现的。

### Padded Inputs
使用padding来文本内容和border之间增加space

box-sizing: border-box;这使得padding和border被包含在width，height之类。页面上的表现为如果用户输入的数据超过了width的宽度，这鼠标会自动往后移动，而不是将文本框的右边后移。参考例子https://www.w3schools.com/css/tryit.asp?filename=trycss_form_padding,输入超过文本框宽度的字符，之后再把属性box-sizing: border-box去掉看下效果。

### Bordered Inputs
给文本框增加一个圆角
```
input[type=text] {
  border: 2px solid red;
  border-radius: 4px;
}
```

### Colored Inputs
使用background-color给文本框添加背景色
```
input[type=text] {
  background-color: #3CBC8D;
  color: white;
}
```

### Focused Inputs
使用伪类:focus来设置元素获取鼠标焦点时的样式

文本框获取焦点时背景色为lightblue
```
input[type=text]:focus {
  background-color: lightblue;
}
```

### Input with icon/image
可以使用Icon/Image来填充在Input内部

```
input[type=text] {
  width: 100%;
  box-sizing: border-box;
  border: 2px solid #ccc;
  border-radius: 4px;
  font-size: 16px;
  background-color: white;
  background-image: url('searchicon.png');
  background-position: 10px 10px; 
  background-repeat: no-repeat;
  padding: 12px 20px 12px 40px;
}
```

### Animated Search Input
添加animation的效果
https://www.w3schools.com/css/tryit.asp?filename=trycss_form_search_anim
```
input[type=text] {
  transition: width 0.4s ease-in-out;
}

input[type=text]:focus {
  width: 100%;
}
```


同样地利用这些Attr Selector，可以将样式用在任何一种元素上，而不单单是Input上。
如Styling Textareas/Select Menus/Input Buttons等
