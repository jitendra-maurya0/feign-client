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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "payload_id",
        "reused",
        "customers",
        "payload_type",
        "payload_mass_kg",
        "payload_mass_lbs",
        "orbit"
})
public class Payload {

    @JsonProperty("payload_id")
    private String payloadId;
    @JsonProperty("reused")
    private Boolean reused;
    @JsonProperty("customers")
    private List<String> customers = null;
    @JsonProperty("payload_type")
    private String payloadType;
    @JsonProperty("payload_mass_kg")
    private Object payloadMassKg;
    @JsonProperty("payload_mass_lbs")
    private Object payloadMassLbs;
    @JsonProperty("orbit")
    private String orbit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("payload_id")
    public String getPayloadId() {
        return payloadId;
    }

    @JsonProperty("payload_id")
    public void setPayloadId(String payloadId) {
        this.payloadId = payloadId;
    }

    @JsonProperty("reused")
    public Boolean getReused() {
        return reused;
    }

    @JsonProperty("reused")
    public void setReused(Boolean reused) {
        this.reused = reused;
    }

    @JsonProperty("customers")
    public List<String> getCustomers() {
        return customers;
    }

    @JsonProperty("customers")
    public void setCustomers(List<String> customers) {
        this.customers = customers;
    }

    @JsonProperty("payload_type")
    public String getPayloadType() {
        return payloadType;
    }

    @JsonProperty("payload_type")
    public void setPayloadType(String payloadType) {
        this.payloadType = payloadType;
    }

    @JsonProperty("payload_mass_kg")
    public Object getPayloadMassKg() {
        return payloadMassKg;
    }

    @JsonProperty("payload_mass_kg")
    public void setPayloadMassKg(Object payloadMassKg) {
        this.payloadMassKg = payloadMassKg;
    }

    @JsonProperty("payload_mass_lbs")
    public Object getPayloadMassLbs() {
        return payloadMassLbs;
    }

    @JsonProperty("payload_mass_lbs")
    public void setPayloadMassLbs(Object payloadMassLbs) {
        this.payloadMassLbs = payloadMassLbs;
    }

    @JsonProperty("orbit")
    public String getOrbit() {
        return orbit;
    }

    @JsonProperty("orbit")
    public void setOrbit(String orbit) {
        this.orbit = orbit;
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