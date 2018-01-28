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
        "core_serial",
        "reused",
        "land_success",
        "landing_type",
        "landing_vehicle"
})
public class Core {

    @JsonProperty("core_serial")
    private String coreSerial;
    @JsonProperty("reused")
    private Boolean reused;
    @JsonProperty("land_success")
    private Boolean landSuccess;
    @JsonProperty("landing_type")
    private String landingType;
    @JsonProperty("landing_vehicle")
    private String landingVehicle;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("core_serial")
    public String getCoreSerial() {
        return coreSerial;
    }

    @JsonProperty("core_serial")
    public void setCoreSerial(String coreSerial) {
        this.coreSerial = coreSerial;
    }

    @JsonProperty("reused")
    public Boolean getReused() {
        return reused;
    }

    @JsonProperty("reused")
    public void setReused(Boolean reused) {
        this.reused = reused;
    }

    @JsonProperty("land_success")
    public Boolean getLandSuccess() {
        return landSuccess;
    }

    @JsonProperty("land_success")
    public void setLandSuccess(Boolean landSuccess) {
        this.landSuccess = landSuccess;
    }

    @JsonProperty("landing_type")
    public String getLandingType() {
        return landingType;
    }

    @JsonProperty("landing_type")
    public void setLandingType(String landingType) {
        this.landingType = landingType;
    }

    @JsonProperty("landing_vehicle")
    public String getLandingVehicle() {
        return landingVehicle;
    }

    @JsonProperty("landing_vehicle")
    public void setLandingVehicle(String landingVehicle) {
        this.landingVehicle = landingVehicle;
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