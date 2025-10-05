package com.example.shardedsagawallet.service.saga;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@Builder
public class SagaContext {

    private Map<String, Object> data;

    public SagaContext(Map<String, Object> data) {
        this.data = data != null ? data : new HashMap<>();
    }

    public void put(String key, Object value) {
        data.put(key, value);
    }

    public Object get(String key) {
        return data.get(key);
    }
}
