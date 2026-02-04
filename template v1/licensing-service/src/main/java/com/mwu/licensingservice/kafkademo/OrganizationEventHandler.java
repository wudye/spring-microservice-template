package com.mwu.licensingservice.kafkademo;

import com.mwu.licensingservice.kafkademo.OrganizationChangeModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/*
# application.yml
spring:
  kafka:
    bootstrap-servers: kafka:9092  # 或者 localhost:9092
    consumer:
      group-id: licensingGroup      # 消费者组
      auto-offset-reset: earliest    # 从最早的消息开始消费
      key-deserializer: org.apache.kafka.common.serialization.StringDeserializer
      value-deserializer: org.apache.kafka.common.serialization.StringDeserializer

 */
@Slf4j
//@Service
public class OrganizationEventHandler {

    @KafkaListener(topics = "orgChangeTopic")
    public void handleOrganizationChange(OrganizationChangeModel event) {
        log.info("Received organization change event: {}", event);

        String correlationId = event.getCorrelationId();
        String action = event.getAction();
        String orgId = event.getOrganizationId();
        System.out.println("Received event for organization ID: " + orgId + " with action: " + action);
        switch (action) {
            case "CREATE":
                log.info("Organization created: {}, correlationId={}", orgId, correlationId);
                // 初始化许可证数据
                break;

            case "UPDATE":
                log.info("Organization updated: {}, correlationId={}", orgId, correlationId);
                // 更新缓存
                break;

            case "DELETE":
                log.info("Organization deleted: {}, correlationId={}", orgId, correlationId);
                // 删除相关许可证
                break;
        }
    }
}
