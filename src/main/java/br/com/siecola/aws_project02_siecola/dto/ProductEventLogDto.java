package br.com.siecola.aws_project02_siecola.dto;

import br.com.siecola.aws_project02_siecola.config.entity.ProductEventLog;
import br.com.siecola.aws_project02_siecola.enums.EventType;

public class ProductEventLogDto {

    private final String code;
    private final EventType eventType;
    private final long productId;
    private final String username;
    private final long timestamp;

    public ProductEventLogDto(ProductEventLog productEventLog) {
        this.username = productEventLog.getUsername();
        this.timestamp = productEventLog.getTimestamp();
        this.productId = productEventLog.getProductId();
        this.eventType = productEventLog.getEventType();
        this.code = productEventLog.getPk();
    }

    public String getCode() {
        return code;
    }

    public EventType getEventType() {
        return eventType;
    }

    public long getProductId() {
        return productId;
    }

    public String getUsername() {
        return username;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
