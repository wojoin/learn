# CSS Links
其实Link是一个复杂元素，是由font+color+color-decoration:underline组成的。

### Link State
- a:link - a normal, unvisited link
- a:visited - a link the user has visited
- a:hover - a link when the user mouses over it
- a:active - a link the moment it is clicked

设置Link的样式是需要注意,hover需要定义在link和vistied后面，active需要定义在hover后面，顺序为link,visited,hover,active