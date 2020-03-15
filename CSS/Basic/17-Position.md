# CSS Layout - The position Property
position 用于设置元素的位置
- static
- relative:根据上一个元素的位置，会影响当前元素的位置和展示，下一个元素不会影响
- fixed:当前元素总是停在某个位置，相对于viewpoint的
- absolute：和fix类似，但是这个是相对于最近的父元素的位置的。
- sticky:当使用scroll时,使用该属性值的元素，一直显示在某处。如表格数据太多时，表头一直固定。

### Overlapping Elements
当时用position属性时难免会存在元素重叠的情况，这时候可以使用z-index的属性进行优先级展示元素z-index:-1优先级最低，展示在最下面。默认情况下同时使用position属性的多个元素，展示方式为最后一个使用position属性的元素展示在最上面。(和栈规则一样)

### 将图片和文本重叠
图片在前面，使用position:relative,文本在后面使用position:absolute即可，参考Position.html