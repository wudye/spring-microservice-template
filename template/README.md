# i18n
# RMM 3rd Party Module
# dockerfile for packaging the  service
# @RefreshScope
# UserContext in ThreadLocal
# feign only keep OrganizationFeignClient

resilience4j
├── circuitbreaker  (熔断器) - 防止级联故障
├── ratelimiter     (限流器) - 保护服务过载
├── retry           (重试机制) - 临时故障恢复
└── bulkhead        (隔离舱) - 资源隔离

# keycloak set in chapter 9

# kafka two ways:
1. spring cloud stream
2. spring kafka