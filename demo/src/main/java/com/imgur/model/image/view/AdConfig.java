
package com.imgur.model.image.view;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "safeFlags",
    "highRiskFlags",
    "unsafeFlags",
    "showsAds"
})
public class AdConfig {

    @JsonProperty("safeFlags")
    private List<String> safeFlags = new ArrayList<String>();
    @JsonProperty("highRiskFlags")
    private List<String> highRiskFlags = new ArrayList<String>();
    @JsonProperty("unsafeFlags")
    private List<Object> unsafeFlags = new ArrayList<Object>();
    @JsonProperty("showsAds")
    private Boolean showsAds;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AdConfig() {
    }

    /**
     * 
     * @param showsAds
     * @param unsafeFlags
     * @param safeFlags
     * @param highRiskFlags
     */
    public AdConfig(List<String> safeFlags, List<String> highRiskFlags, List<Object> unsafeFlags, Boolean showsAds) {
        super();
        this.safeFlags = safeFlags;
        this.highRiskFlags = highRiskFlags;
        this.unsafeFlags = unsafeFlags;
        this.showsAds = showsAds;
    }

    @JsonProperty("safeFlags")
    public List<String> getSafeFlags() {
        return safeFlags;
    }

    @JsonProperty("safeFlags")
    public void setSafeFlags(List<String> safeFlags) {
        this.safeFlags = safeFlags;
    }

    @JsonProperty("highRiskFlags")
    public List<String> getHighRiskFlags() {
        return highRiskFlags;
    }

    @JsonProperty("highRiskFlags")
    public void setHighRiskFlags(List<String> highRiskFlags) {
        this.highRiskFlags = highRiskFlags;
    }

    @JsonProperty("unsafeFlags")
    public List<Object> getUnsafeFlags() {
        return unsafeFlags;
    }

    @JsonProperty("unsafeFlags")
    public void setUnsafeFlags(List<Object> unsafeFlags) {
        this.unsafeFlags = unsafeFlags;
    }

    @JsonProperty("showsAds")
    public Boolean getShowsAds() {
        return showsAds;
    }

    @JsonProperty("showsAds")
    public void setShowsAds(Boolean showsAds) {
        this.showsAds = showsAds;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("safeFlags");
        sb.append('=');
        sb.append(((this.safeFlags == null)?"<null>":this.safeFlags));
        sb.append(',');
        sb.append("highRiskFlags");
        sb.append('=');
        sb.append(((this.highRiskFlags == null)?"<null>":this.highRiskFlags));
        sb.append(',');
        sb.append("unsafeFlags");
        sb.append('=');
        sb.append(((this.unsafeFlags == null)?"<null>":this.unsafeFlags));
        sb.append(',');
        sb.append("showsAds");
        sb.append('=');
        sb.append(((this.showsAds == null)?"<null>":this.showsAds));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.showsAds == null)? 0 :this.showsAds.hashCode()));
        result = ((result* 31)+((this.safeFlags == null)? 0 :this.safeFlags.hashCode()));
        result = ((result* 31)+((this.highRiskFlags == null)? 0 :this.highRiskFlags.hashCode()));
        result = ((result* 31)+((this.unsafeFlags == null)? 0 :this.unsafeFlags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdConfig) == false) {
            return false;
        }
        AdConfig rhs = ((AdConfig) other);
        return (((((this.showsAds == rhs.showsAds)||((this.showsAds!= null)&&this.showsAds.equals(rhs.showsAds)))&&((this.safeFlags == rhs.safeFlags)||((this.safeFlags!= null)&&this.safeFlags.equals(rhs.safeFlags))))&&((this.highRiskFlags == rhs.highRiskFlags)||((this.highRiskFlags!= null)&&this.highRiskFlags.equals(rhs.highRiskFlags))))&&((this.unsafeFlags == rhs.unsafeFlags)||((this.unsafeFlags!= null)&&this.unsafeFlags.equals(rhs.unsafeFlags))));
    }

}
