# xml优先级大于yml

## 使用yml配置

### 1.指定输出级别

输出级别：`trace<debug<info<warn<error`

`logging.level`下指定包名`com.aca`，这样`com.aca`下所有输出日志级别都为指定级别

### 2.指定输出位置

- logging.file：指定文件名
- logging.path：指定文件位置，默认文件名为`spring.log`

### 3.指定输出格式
- logging.pattern.console：指定控制台输出格式
- logging.pattern.file：指定文件输出格式

见[这里](src/main/resources/application.yml)

## 使用xml配置
和以前一样，见[这里](src/main/resources/logback.xml)