package com.mwu.organization.controller;

import com.mwu.organization.events.model.OrganizationChangeModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
@Slf4j
public class OrganizationEventHandlerStream {


    /**
     * 函数式消费者
     * Bean 名称：inboundOrgChanges（与 spring.cloud.function.definition 一致）
     */
    @Bean
    public Consumer<OrganizationChangeModel> inboundOrgChanges() {
        return event -> {
            log.info("Received organization change event: {}", event);

            String correlationId = event.getCorrelationId();
            String action = event.getAction();
            String orgId = event.getOrganizationId();

            log.info("Processing event for organization ID: {} with action: {}, correlationId: {}",
                    orgId, action, correlationId);

            switch (action) {
                case "CREATE":
                    log.info("Organization created: {}, correlationId={}", orgId, correlationId);
                    // 初始化许可证数据
                    handleOrganizationCreate(orgId);
                    break;

                case "UPDATE":
                    log.info("Organization updated: {}, correlationId={}", orgId, correlationId);
                    // 更新缓存
                    handleOrganizationUpdate(orgId);
                    break;

                case "DELETE":
                    log.info("Organization deleted: {}, correlationId={}", orgId, correlationId);
                    // 删除相关许可证
                    handleOrganizationDelete(orgId);
                    break;

                default:
                    log.warn("Unknown action: {}", action);
            }
        };
    }

    private void handleOrganizationCreate(String orgId) {
        // TODO: 实现组织创建后的许可证初始化逻辑
        log.info("Initializing licenses for new organization: {}", orgId);
    }

    private void handleOrganizationUpdate(String orgId) {
        // TODO: 实现组织更新后的缓存更新逻辑
        log.info("Updating cache for organization: {}", orgId);
    }

    private void handleOrganizationDelete(String orgId) {
        // TODO: 实现组织删除后的许可证清理逻辑
        log.info("Cleaning up licenses for deleted organization: {}", orgId);
    }
}
