package com.mwu.organization.events.source;

import com.mwu.organization.events.model.OrganizationChangeModel;
import com.mwu.organization.utils.UserContext;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;



@Component
@RequiredArgsConstructor
public class SimpleSourceBean {

    private final StreamBridge streamBridge;

    private static final Logger logger = LoggerFactory.getLogger(SimpleSourceBean.class);


    public void publishOrganizationChange(String action, String organizationId){
       logger.debug("Sending Kafka message {} for Organization Id: {}", action, organizationId);
        OrganizationChangeModel change =  new OrganizationChangeModel(
                OrganizationChangeModel.class.getTypeName(),
                action,
                organizationId,
                UserContext.getCorrelationId());

        streamBridge.send("orgChangeTopic", change);
    }
}
