## 为了语法提示，导入命名空间
`<html lang="en" xmlns:th="http://www.thymeleaf.org">`

简单的demo
```java
@GetMapping("/")
public String hello(Map<String,Object> map){
    map.put("hello","你好，我是aca");
    return "index";
}
```
页面
```html
<div th:text="${hello}"></div>
```
页面将显示`你好，我是aca`

## th语法规则
1. th:text
    
    改变当前元素里的文本内容，使用utext表示转义。**th:任意html属性**
2. th:each

   遍历