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
        "site_id",
        "site_name",
        "site_name_long"
})
public class LaunchSite {

    @JsonProperty("site_id")
    private String siteId;
    @JsonProperty("site_name")
    private String siteName;
    @JsonProperty("site_name_long")
    private String siteNameLong;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("site_id")
    public String getSiteId() {
        return siteId;
    }

    @JsonProperty("site_id")
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    @JsonProperty("site_name")
    public String getSiteName() {
        return siteName;
    }

    @JsonProperty("site_name")
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    @JsonProperty("site_name_long")
    public String getSiteNameLong() {
        return siteNameLong;
    }

    @JsonProperty("site_name_long")
    public void setSiteNameLong(String siteNameLong) {
        this.siteNameLong = siteNameLong;
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