package com.example.demo.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.Payload;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "payloads"
})
public class SecondStage {

    @JsonProperty("payloads")
    private List<Payload> payloads = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("payloads")
    public List<Payload> getPayloads() {
        return payloads;
    }

    @JsonProperty("payloads")
    public void setPayloads(List<Payload> payloads) {
        this.payloads = payloads;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}