# CSS Attribute Selectors
### Style HTML Elements With Specific Attributes
对具有特定属性或者属性值的元素进行定制化样式。

### CSS [attribute] Selector

将所有a 元素且有属性target的背景色设置为黄色
```
a[target] {
  background-color: yellow;
}
```

由此可见，Bootstrap中具有特定属性的元素应该时通过这种方式实现的吧。

### CSS [attribute="value"] Selector
选择具有特定属性且值为value的元素
```
a[target="_blank"] {
  background-color: yellow;
}
```

### CSS [attribute~="value"] Selector
用于选择属性值包含value的元素

### CSS [attribute|="value"] Selector
选择以top开始的属性值的元素
```
[class|="top"] {
  background: yellow;
}
```
> 上面只能选择class="top"或者class="top-header"这样的元素

### CSS [attribute^="value"] Selector
选择属性值以value开始的元素
```
[class^="top"] {
  background: yellow;
}
```
> 不包含class="top"这样的元素，只包含class="top-header"或者class="topheader"

### CSS [attribute$="value"] Selector
选择属性值以value结束的元素

### CSS [attribute*="value"] Selector
选择属性值包含value的元素
```
[class*="te"] {
  background: yellow;
}
```
> class="te"的元素不包含

# Styling Forms
The attribute selectors can be useful for styling forms without class or ID:


