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

# spring security ignoring vs permitAll
1. ignoring：完全绕过 Spring Security 的过滤链，适用于静态资源等不需要安全控制的路径
2. permitAll：仍然经过过滤链，但允许所有用户访问，适用于需要安全上下文但不限制访问的路径
选择 ignoring 可以提升性能，因为不需要经过安全过滤器，但要确保这些路径确实不需要安全控制；
3. 选择 permitAll 则适合需要安全上下文（如日志记录、审计等）的路径，但要注意可能的安全风险，确保不暴露敏感资源。
4. // 方式1: ignoring() - 当前代码使用的
   web.ignoring().requestMatchers("/js/**");

    // 方式2: permitAll() - 替代方案
    .authorizeHttpRequests(authorize ->
    authorize.requestMatchers("/js/**").permitAll()
    )

# spring security get login info 
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    Object principal = auth.getPrincipal();
    UserDetails userDetails = (UserDetails) principal;
