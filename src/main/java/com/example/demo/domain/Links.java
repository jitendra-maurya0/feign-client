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
        "mission_patch",
        "reddit_campaign",
        "reddit_launch",
        "reddit_recovery",
        "reddit_media",
        "presskit",
        "article_link",
        "video_link"
})
public class Links {

    @JsonProperty("mission_patch")
    private String missionPatch;
    @JsonProperty("reddit_campaign")
    private String redditCampaign;
    @JsonProperty("reddit_launch")
    private String redditLaunch;
    @JsonProperty("reddit_recovery")
    private Object redditRecovery;
    @JsonProperty("reddit_media")
    private String redditMedia;
    @JsonProperty("presskit")
    private String presskit;
    @JsonProperty("article_link")
    private String articleLink;
    @JsonProperty("video_link")
    private String videoLink;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("mission_patch")
    public String getMissionPatch() {
        return missionPatch;
    }

    @JsonProperty("mission_patch")
    public void setMissionPatch(String missionPatch) {
        this.missionPatch = missionPatch;
    }

    @JsonProperty("reddit_campaign")
    public String getRedditCampaign() {
        return redditCampaign;
    }

    @JsonProperty("reddit_campaign")
    public void setRedditCampaign(String redditCampaign) {
        this.redditCampaign = redditCampaign;
    }

    @JsonProperty("reddit_launch")
    public String getRedditLaunch() {
        return redditLaunch;
    }

    @JsonProperty("reddit_launch")
    public void setRedditLaunch(String redditLaunch) {
        this.redditLaunch = redditLaunch;
    }

    @JsonProperty("reddit_recovery")
    public Object getRedditRecovery() {
        return redditRecovery;
    }

    @JsonProperty("reddit_recovery")
    public void setRedditRecovery(Object redditRecovery) {
        this.redditRecovery = redditRecovery;
    }

    @JsonProperty("reddit_media")
    public String getRedditMedia() {
        return redditMedia;
    }

    @JsonProperty("reddit_media")
    public void setRedditMedia(String redditMedia) {
        this.redditMedia = redditMedia;
    }

    @JsonProperty("presskit")
    public String getPresskit() {
        return presskit;
    }

    @JsonProperty("presskit")
    public void setPresskit(String presskit) {
        this.presskit = presskit;
    }

    @JsonProperty("article_link")
    public String getArticleLink() {
        return articleLink;
    }

    @JsonProperty("article_link")
    public void setArticleLink(String articleLink) {
        this.articleLink = articleLink;
    }

    @JsonProperty("video_link")
    public String getVideoLink() {
        return videoLink;
    }

    @JsonProperty("video_link")
    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
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