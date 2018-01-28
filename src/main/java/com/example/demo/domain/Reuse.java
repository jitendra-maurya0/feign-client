package com.example.demo.domain;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "core",
        "side_core1",
        "side_core2",
        "fairings",
        "capsule"
})
public class Reuse {

    @JsonProperty("core")
    private Boolean core;
    @JsonProperty("side_core1")
    private Boolean sideCore1;
    @JsonProperty("side_core2")
    private Boolean sideCore2;
    @JsonProperty("fairings")
    private Boolean fairings;
    @JsonProperty("capsule")
    private Boolean capsule;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("core")
    public Boolean getCore() {
        return core;
    }

    @JsonProperty("core")
    public void setCore(Boolean core) {
        this.core = core;
    }

    @JsonProperty("side_core1")
    public Boolean getSideCore1() {
        return sideCore1;
    }

    @JsonProperty("side_core1")
    public void setSideCore1(Boolean sideCore1) {
        this.sideCore1 = sideCore1;
    }

    @JsonProperty("side_core2")
    public Boolean getSideCore2() {
        return sideCore2;
    }

    @JsonProperty("side_core2")
    public void setSideCore2(Boolean sideCore2) {
        this.sideCore2 = sideCore2;
    }

    @JsonProperty("fairings")
    public Boolean getFairings() {
        return fairings;
    }

    @JsonProperty("fairings")
    public void setFairings(Boolean fairings) {
        this.fairings = fairings;
    }

    @JsonProperty("capsule")
    public Boolean getCapsule() {
        return capsule;
    }

    @JsonProperty("capsule")
    public void setCapsule(Boolean capsule) {
        this.capsule = capsule;
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