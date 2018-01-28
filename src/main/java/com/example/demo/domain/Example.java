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
        "flight_number",
        "launch_year",
        "launch_date_unix",
        "launch_date_utc",
        "launch_date_local",
        "rocket",
        "telemetry",
        "reuse",
        "launch_site",
        "launch_success",
        "links",
        "details"
})
public class Example {

    @JsonProperty("flight_number")
    private Integer flightNumber;
    @JsonProperty("launch_year")
    private String launchYear;
    @JsonProperty("launch_date_unix")
    private Integer launchDateUnix;
    @JsonProperty("launch_date_utc")
    private String launchDateUtc;
    @JsonProperty("launch_date_local")
    private String launchDateLocal;
    @JsonProperty("rocket")
    private Rocket rocket;
    @JsonProperty("telemetry")
    private Telemetry telemetry;
    @JsonProperty("reuse")
    private Reuse reuse;
    @JsonProperty("launch_site")
    private LaunchSite launchSite;
    @JsonProperty("launch_success")
    private Boolean launchSuccess;
    @JsonProperty("links")
    private Links links;
    @JsonProperty("details")
    private String details;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("flight_number")
    public Integer getFlightNumber() {
        return flightNumber;
    }

    @JsonProperty("flight_number")
    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

    @JsonProperty("launch_year")
    public String getLaunchYear() {
        return launchYear;
    }

    @JsonProperty("launch_year")
    public void setLaunchYear(String launchYear) {
        this.launchYear = launchYear;
    }

    @JsonProperty("launch_date_unix")
    public Integer getLaunchDateUnix() {
        return launchDateUnix;
    }

    @JsonProperty("launch_date_unix")
    public void setLaunchDateUnix(Integer launchDateUnix) {
        this.launchDateUnix = launchDateUnix;
    }

    @JsonProperty("launch_date_utc")
    public String getLaunchDateUtc() {
        return launchDateUtc;
    }

    @JsonProperty("launch_date_utc")
    public void setLaunchDateUtc(String launchDateUtc) {
        this.launchDateUtc = launchDateUtc;
    }

    @JsonProperty("launch_date_local")
    public String getLaunchDateLocal() {
        return launchDateLocal;
    }

    @JsonProperty("launch_date_local")
    public void setLaunchDateLocal(String launchDateLocal) {
        this.launchDateLocal = launchDateLocal;
    }

    @JsonProperty("rocket")
    public Rocket getRocket() {
        return rocket;
    }

    @JsonProperty("rocket")
    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    @JsonProperty("telemetry")
    public Telemetry getTelemetry() {
        return telemetry;
    }

    @JsonProperty("telemetry")
    public void setTelemetry(Telemetry telemetry) {
        this.telemetry = telemetry;
    }

    @JsonProperty("reuse")
    public Reuse getReuse() {
        return reuse;
    }

    @JsonProperty("reuse")
    public void setReuse(Reuse reuse) {
        this.reuse = reuse;
    }

    @JsonProperty("launch_site")
    public LaunchSite getLaunchSite() {
        return launchSite;
    }

    @JsonProperty("launch_site")
    public void setLaunchSite(LaunchSite launchSite) {
        this.launchSite = launchSite;
    }

    @JsonProperty("launch_success")
    public Boolean getLaunchSuccess() {
        return launchSuccess;
    }

    @JsonProperty("launch_success")
    public void setLaunchSuccess(Boolean launchSuccess) {
        this.launchSuccess = launchSuccess;
    }

    @JsonProperty("links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonProperty("details")
    public String getDetails() {
        return details;
    }

    @JsonProperty("details")
    public void setDetails(String details) {
        this.details = details;
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