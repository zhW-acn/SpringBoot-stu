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
3. href、action等url地址内容，参数使用括号即可
   ```html
   <a th:href="@{/index.html(l='zh_CN')}">中文</a>
   <a th:href="@{/index.html(l='en')}">English</a>
   ```
4. if判断，成立则显示。
   
   这里的#strings是工具类。如果msg不为空，则渲染p标签
   ```html
   <p th:if="${not #strings.isEmpty(msg)}" th:text="${msg}"></p>
   ```
5. 从attribute取值

   `[[${session.loginUser}]]`