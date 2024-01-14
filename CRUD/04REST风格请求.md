# RESTFul请求风格
|   | 使用uri区分 | RESTFul       |
|---|---------|---------------|
| C | addUser | user---POST   |
| R | getUser | user---GET    |
| U | updUser | user---PUT    |
| D | delUser | user---DELETE |

# 请求架构

|              | URI       | 方式     |
|--------------|-----------|--------|
| 查询所有user     | users     | GET    |
| (跳转)查询一个user | user/{id} | GET    |
| 添加user       | user      | POST   |
| 跳转到添加页面      | user      | GET    |
| 修改user       | user      | PUT    |
| 删除user       | user/{id} | DELETE |

