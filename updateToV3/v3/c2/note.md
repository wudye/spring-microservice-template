# thymeleaf config:
spring.thymeleaf.cache=false
开发环境：关闭缓存允许修改模板后无需重启即可看到效果

spring.thymeleaf.mode=HTML
HTML 模式：允许宽松的 HTML 语法，适合模板文件
XML 模式：要求严格的 XML 格式
选择 HTML 模式增强了灵活性，因为 Web 模板通常不需要严格的 XML 验证

spring.thymeleaf.templates_root=src/main/resources/templates/
约定优于配置：Spring Boot 默认就是这个路径，显式声明提高可读性
模板文件统一存放在 templates/ 目录下，便于项目结构管理

# lombok @EqualsAndHashCode(callSuper = false)
继承场景对比：
├─ callSuper = true（默认）
│  └─ equals() 方法会先调用 super.equals()
│  └─ hashCode() 方法会先调用 super.hashCode()
│  └─ 适用于：子类对象需要与父类对象比较的场景
│
└─ callSuper = false（本例）
└─ equals() 方法只比较子类自己的字段
└─ hashCode() 方法只基于子类自己的字段计算
└─ 适用于：异常对象只根据自身业务标识判断相等性
