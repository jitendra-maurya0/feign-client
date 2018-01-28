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
        "name",
        "founder",
        "founded",
        "employees",
        "vehicles",
        "launch_sites",
        "test_sites",
        "ceo",
        "cto",
        "coo",
        "cto_propulsion",
        "valuation",
        "headquarters",
        "summary"
})
public class Company {

    @JsonProperty("name")
    private String name;
    @JsonProperty("founder")
    private String founder;
    @JsonProperty("founded")
    private Long founded;
    @JsonProperty("employees")
    private Long employees;
    @JsonProperty("vehicles")
    private Long vehicles;
    @JsonProperty("launch_sites")
    private Long launchSites;
    @JsonProperty("test_sites")
    private Long testSites;
    @JsonProperty("ceo")
    private String ceo;
    @JsonProperty("cto")
    private String cto;
    @JsonProperty("coo")
    private String coo;
    @JsonProperty("cto_propulsion")
    private String ctoPropulsion;
    @JsonProperty("valuation")
    private Long valuation;
    @JsonProperty("headquarters")
    private Headquarters headquarters;
    @JsonProperty("summary")
    private String summary;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("founder")
    public String getFounder() {
        return founder;
    }

    @JsonProperty("founder")
    public void setFounder(String founder) {
        this.founder = founder;
    }

    @JsonProperty("founded")
    public Long getFounded() {
        return founded;
    }

    @JsonProperty("founded")
    public void setFounded(Long founded) {
        this.founded = founded;
    }

    @JsonProperty("employees")
    public Long getEmployees() {
        return employees;
    }

    @JsonProperty("employees")
    public void setEmployees(Long employees) {
        this.employees = employees;
    }

    @JsonProperty("vehicles")
    public Long getVehicles() {
        return vehicles;
    }

    @JsonProperty("vehicles")
    public void setVehicles(Long vehicles) {
        this.vehicles = vehicles;
    }

    @JsonProperty("launch_sites")
    public Long getLaunchSites() {
        return launchSites;
    }

    @JsonProperty("launch_sites")
    public void setLaunchSites(Long launchSites) {
        this.launchSites = launchSites;
    }

    @JsonProperty("test_sites")
    public Long getTestSites() {
        return testSites;
    }

    @JsonProperty("test_sites")
    public void setTestSites(Long testSites) {
        this.testSites = testSites;
    }

    @JsonProperty("ceo")
    public String getCeo() {
        return ceo;
    }

    @JsonProperty("ceo")
    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    @JsonProperty("cto")
    public String getCto() {
        return cto;
    }

    @JsonProperty("cto")
    public void setCto(String cto) {
        this.cto = cto;
    }

    @JsonProperty("coo")
    public String getCoo() {
        return coo;
    }

    @JsonProperty("coo")
    public void setCoo(String coo) {
        this.coo = coo;
    }

    @JsonProperty("cto_propulsion")
    public String getCtoPropulsion() {
        return ctoPropulsion;
    }

    @JsonProperty("cto_propulsion")
    public void setCtoPropulsion(String ctoPropulsion) {
        this.ctoPropulsion = ctoPropulsion;
    }

    @JsonProperty("valuation")
    public Long getValuation() {
        return valuation;
    }

    @JsonProperty("valuation")
    public void setValuation(Long valuation) {
        this.valuation = valuation;
    }

    @JsonProperty("headquarters")
    public Headquarters getHeadquarters() {
        return headquarters;
    }

    @JsonProperty("headquarters")
    public void setHeadquarters(Headquarters headquarters) {
        this.headquarters = headquarters;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
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