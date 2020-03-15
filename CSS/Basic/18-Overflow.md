# CSS Layout - Overflow(content that is too big to fit into an area)
overflow 属性定义当内容太大太多时而元素容纳不了时，内容如何展示。
- visible - Default. The overflow is not clipped. The content renders outside the element's box
- hidden - The overflow is clipped, and the rest of the content will be invisible
- scroll - The overflow is clipped, and a scrollbar is added to see the rest of the content
- auto - Similar to scroll, but it adds scrollbars only when necessary

### overflow-x and overflow-y
定了展示scroll的方式
```
div {
  overflow-x: hidden; /* Hide horizontal scrollbar */
  overflow-y: scroll; /* Add vertical scrollbar */
}
```
