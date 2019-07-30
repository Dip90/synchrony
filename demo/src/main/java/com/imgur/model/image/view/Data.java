
package com.imgur.model.image.view;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "title",
    "description",
    "datetime",
    "type",
    "animated",
    "width",
    "height",
    "size",
    "views",
    "bandwidth",
    "vote",
    "favorite",
    "nsfw",
    "section",
    "account_url",
    "account_id",
    "is_ad",
    "in_most_viral",
    "has_sound",
    "tags",
    "ad_type",
    "ad_url",
    "edited",
    "in_gallery",
    "link",
    "ad_config"
})
public class Data {

    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("datetime")
    private Integer datetime;
    @JsonProperty("type")
    private String type;
    @JsonProperty("animated")
    private Boolean animated;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("views")
    private Integer views;
    @JsonProperty("bandwidth")
    private Integer bandwidth;
    @JsonProperty("vote")
    private Object vote;
    @JsonProperty("favorite")
    private Boolean favorite;
    @JsonProperty("nsfw")
    private Boolean nsfw;
    @JsonProperty("section")
    private Object section;
    @JsonProperty("account_url")
    private Object accountUrl;
    @JsonProperty("account_id")
    private Object accountId;
    @JsonProperty("is_ad")
    private Boolean isAd;
    @JsonProperty("in_most_viral")
    private Boolean inMostViral;
    @JsonProperty("has_sound")
    private Boolean hasSound;
    @JsonProperty("tags")
    private List<Object> tags = new ArrayList<Object>();
    @JsonProperty("ad_type")
    private Integer adType;
    @JsonProperty("ad_url")
    private String adUrl;
    @JsonProperty("edited")
    private String edited;
    @JsonProperty("in_gallery")
    private Boolean inGallery;
    @JsonProperty("link")
    private String link;
    @JsonProperty("ad_config")
    private AdConfig adConfig;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Data() {
    }

    /**
     * 
     * @param link
     * @param description
     * @param adUrl
     * @param section
     * @param title
     * @param type
     * @param datetime
     * @param adType
     * @param id
     * @param isAd
     * @param vote
     * @param views
     * @param height
     * @param accountUrl
     * @param adConfig
     * @param bandwidth
     * @param nsfw
     * @param edited
     * @param hasSound
     * @param tags
     * @param accountId
     * @param size
     * @param width
     * @param animated
     * @param inGallery
     * @param favorite
     * @param inMostViral
     */
    public Data(String id, String title, Object description, Integer datetime, String type, Boolean animated, Integer width, Integer height, Integer size, Integer views, Integer bandwidth, Object vote, Boolean favorite, Boolean nsfw, Object section, Object accountUrl, Object accountId, Boolean isAd, Boolean inMostViral, Boolean hasSound, List<Object> tags, Integer adType, String adUrl, String edited, Boolean inGallery, String link, AdConfig adConfig) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
        this.datetime = datetime;
        this.type = type;
        this.animated = animated;
        this.width = width;
        this.height = height;
        this.size = size;
        this.views = views;
        this.bandwidth = bandwidth;
        this.vote = vote;
        this.favorite = favorite;
        this.nsfw = nsfw;
        this.section = section;
        this.accountUrl = accountUrl;
        this.accountId = accountId;
        this.isAd = isAd;
        this.inMostViral = inMostViral;
        this.hasSound = hasSound;
        this.tags = tags;
        this.adType = adType;
        this.adUrl = adUrl;
        this.edited = edited;
        this.inGallery = inGallery;
        this.link = link;
        this.adConfig = adConfig;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("datetime")
    public Integer getDatetime() {
        return datetime;
    }

    @JsonProperty("datetime")
    public void setDatetime(Integer datetime) {
        this.datetime = datetime;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("animated")
    public Boolean getAnimated() {
        return animated;
    }

    @JsonProperty("animated")
    public void setAnimated(Boolean animated) {
        this.animated = animated;
    }

    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @JsonProperty("views")
    public Integer getViews() {
        return views;
    }

    @JsonProperty("views")
    public void setViews(Integer views) {
        this.views = views;
    }

    @JsonProperty("bandwidth")
    public Integer getBandwidth() {
        return bandwidth;
    }

    @JsonProperty("bandwidth")
    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    @JsonProperty("vote")
    public Object getVote() {
        return vote;
    }

    @JsonProperty("vote")
    public void setVote(Object vote) {
        this.vote = vote;
    }

    @JsonProperty("favorite")
    public Boolean getFavorite() {
        return favorite;
    }

    @JsonProperty("favorite")
    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    @JsonProperty("nsfw")
    public Boolean getNsfw() {
        return nsfw;
    }

    @JsonProperty("nsfw")
    public void setNsfw(Boolean nsfw) {
        this.nsfw = nsfw;
    }

    @JsonProperty("section")
    public Object getSection() {
        return section;
    }

    @JsonProperty("section")
    public void setSection(Object section) {
        this.section = section;
    }

    @JsonProperty("account_url")
    public Object getAccountUrl() {
        return accountUrl;
    }

    @JsonProperty("account_url")
    public void setAccountUrl(Object accountUrl) {
        this.accountUrl = accountUrl;
    }

    @JsonProperty("account_id")
    public Object getAccountId() {
        return accountId;
    }

    @JsonProperty("account_id")
    public void setAccountId(Object accountId) {
        this.accountId = accountId;
    }

    @JsonProperty("is_ad")
    public Boolean getIsAd() {
        return isAd;
    }

    @JsonProperty("is_ad")
    public void setIsAd(Boolean isAd) {
        this.isAd = isAd;
    }

    @JsonProperty("in_most_viral")
    public Boolean getInMostViral() {
        return inMostViral;
    }

    @JsonProperty("in_most_viral")
    public void setInMostViral(Boolean inMostViral) {
        this.inMostViral = inMostViral;
    }

    @JsonProperty("has_sound")
    public Boolean getHasSound() {
        return hasSound;
    }

    @JsonProperty("has_sound")
    public void setHasSound(Boolean hasSound) {
        this.hasSound = hasSound;
    }

    @JsonProperty("tags")
    public List<Object> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    @JsonProperty("ad_type")
    public Integer getAdType() {
        return adType;
    }

    @JsonProperty("ad_type")
    public void setAdType(Integer adType) {
        this.adType = adType;
    }

    @JsonProperty("ad_url")
    public String getAdUrl() {
        return adUrl;
    }

    @JsonProperty("ad_url")
    public void setAdUrl(String adUrl) {
        this.adUrl = adUrl;
    }

    @JsonProperty("edited")
    public String getEdited() {
        return edited;
    }

    @JsonProperty("edited")
    public void setEdited(String edited) {
        this.edited = edited;
    }

    @JsonProperty("in_gallery")
    public Boolean getInGallery() {
        return inGallery;
    }

    @JsonProperty("in_gallery")
    public void setInGallery(Boolean inGallery) {
        this.inGallery = inGallery;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonProperty("ad_config")
    public AdConfig getAdConfig() {
        return adConfig;
    }

    @JsonProperty("ad_config")
    public void setAdConfig(AdConfig adConfig) {
        this.adConfig = adConfig;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Data.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("datetime");
        sb.append('=');
        sb.append(((this.datetime == null)?"<null>":this.datetime));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("animated");
        sb.append('=');
        sb.append(((this.animated == null)?"<null>":this.animated));
        sb.append(',');
        sb.append("width");
        sb.append('=');
        sb.append(((this.width == null)?"<null>":this.width));
        sb.append(',');
        sb.append("height");
        sb.append('=');
        sb.append(((this.height == null)?"<null>":this.height));
        sb.append(',');
        sb.append("size");
        sb.append('=');
        sb.append(((this.size == null)?"<null>":this.size));
        sb.append(',');
        sb.append("views");
        sb.append('=');
        sb.append(((this.views == null)?"<null>":this.views));
        sb.append(',');
        sb.append("bandwidth");
        sb.append('=');
        sb.append(((this.bandwidth == null)?"<null>":this.bandwidth));
        sb.append(',');
        sb.append("vote");
        sb.append('=');
        sb.append(((this.vote == null)?"<null>":this.vote));
        sb.append(',');
        sb.append("favorite");
        sb.append('=');
        sb.append(((this.favorite == null)?"<null>":this.favorite));
        sb.append(',');
        sb.append("nsfw");
        sb.append('=');
        sb.append(((this.nsfw == null)?"<null>":this.nsfw));
        sb.append(',');
        sb.append("section");
        sb.append('=');
        sb.append(((this.section == null)?"<null>":this.section));
        sb.append(',');
        sb.append("accountUrl");
        sb.append('=');
        sb.append(((this.accountUrl == null)?"<null>":this.accountUrl));
        sb.append(',');
        sb.append("accountId");
        sb.append('=');
        sb.append(((this.accountId == null)?"<null>":this.accountId));
        sb.append(',');
        sb.append("isAd");
        sb.append('=');
        sb.append(((this.isAd == null)?"<null>":this.isAd));
        sb.append(',');
        sb.append("inMostViral");
        sb.append('=');
        sb.append(((this.inMostViral == null)?"<null>":this.inMostViral));
        sb.append(',');
        sb.append("hasSound");
        sb.append('=');
        sb.append(((this.hasSound == null)?"<null>":this.hasSound));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("adType");
        sb.append('=');
        sb.append(((this.adType == null)?"<null>":this.adType));
        sb.append(',');
        sb.append("adUrl");
        sb.append('=');
        sb.append(((this.adUrl == null)?"<null>":this.adUrl));
        sb.append(',');
        sb.append("edited");
        sb.append('=');
        sb.append(((this.edited == null)?"<null>":this.edited));
        sb.append(',');
        sb.append("inGallery");
        sb.append('=');
        sb.append(((this.inGallery == null)?"<null>":this.inGallery));
        sb.append(',');
        sb.append("link");
        sb.append('=');
        sb.append(((this.link == null)?"<null>":this.link));
        sb.append(',');
        sb.append("adConfig");
        sb.append('=');
        sb.append(((this.adConfig == null)?"<null>":this.adConfig));
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
        result = ((result* 31)+((this.link == null)? 0 :this.link.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.adUrl == null)? 0 :this.adUrl.hashCode()));
        result = ((result* 31)+((this.section == null)? 0 :this.section.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.datetime == null)? 0 :this.datetime.hashCode()));
        result = ((result* 31)+((this.adType == null)? 0 :this.adType.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.isAd == null)? 0 :this.isAd.hashCode()));
        result = ((result* 31)+((this.vote == null)? 0 :this.vote.hashCode()));
        result = ((result* 31)+((this.views == null)? 0 :this.views.hashCode()));
        result = ((result* 31)+((this.height == null)? 0 :this.height.hashCode()));
        result = ((result* 31)+((this.accountUrl == null)? 0 :this.accountUrl.hashCode()));
        result = ((result* 31)+((this.adConfig == null)? 0 :this.adConfig.hashCode()));
        result = ((result* 31)+((this.bandwidth == null)? 0 :this.bandwidth.hashCode()));
        result = ((result* 31)+((this.nsfw == null)? 0 :this.nsfw.hashCode()));
        result = ((result* 31)+((this.edited == null)? 0 :this.edited.hashCode()));
        result = ((result* 31)+((this.hasSound == null)? 0 :this.hasSound.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.accountId == null)? 0 :this.accountId.hashCode()));
        result = ((result* 31)+((this.size == null)? 0 :this.size.hashCode()));
        result = ((result* 31)+((this.width == null)? 0 :this.width.hashCode()));
        result = ((result* 31)+((this.animated == null)? 0 :this.animated.hashCode()));
        result = ((result* 31)+((this.inGallery == null)? 0 :this.inGallery.hashCode()));
        result = ((result* 31)+((this.favorite == null)? 0 :this.favorite.hashCode()));
        result = ((result* 31)+((this.inMostViral == null)? 0 :this.inMostViral.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Data) == false) {
            return false;
        }
        Data rhs = ((Data) other);
        return ((((((((((((((((((((((((((((this.link == rhs.link)||((this.link!= null)&&this.link.equals(rhs.link)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.adUrl == rhs.adUrl)||((this.adUrl!= null)&&this.adUrl.equals(rhs.adUrl))))&&((this.section == rhs.section)||((this.section!= null)&&this.section.equals(rhs.section))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.datetime == rhs.datetime)||((this.datetime!= null)&&this.datetime.equals(rhs.datetime))))&&((this.adType == rhs.adType)||((this.adType!= null)&&this.adType.equals(rhs.adType))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.isAd == rhs.isAd)||((this.isAd!= null)&&this.isAd.equals(rhs.isAd))))&&((this.vote == rhs.vote)||((this.vote!= null)&&this.vote.equals(rhs.vote))))&&((this.views == rhs.views)||((this.views!= null)&&this.views.equals(rhs.views))))&&((this.height == rhs.height)||((this.height!= null)&&this.height.equals(rhs.height))))&&((this.accountUrl == rhs.accountUrl)||((this.accountUrl!= null)&&this.accountUrl.equals(rhs.accountUrl))))&&((this.adConfig == rhs.adConfig)||((this.adConfig!= null)&&this.adConfig.equals(rhs.adConfig))))&&((this.bandwidth == rhs.bandwidth)||((this.bandwidth!= null)&&this.bandwidth.equals(rhs.bandwidth))))&&((this.nsfw == rhs.nsfw)||((this.nsfw!= null)&&this.nsfw.equals(rhs.nsfw))))&&((this.edited == rhs.edited)||((this.edited!= null)&&this.edited.equals(rhs.edited))))&&((this.hasSound == rhs.hasSound)||((this.hasSound!= null)&&this.hasSound.equals(rhs.hasSound))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.accountId == rhs.accountId)||((this.accountId!= null)&&this.accountId.equals(rhs.accountId))))&&((this.size == rhs.size)||((this.size!= null)&&this.size.equals(rhs.size))))&&((this.width == rhs.width)||((this.width!= null)&&this.width.equals(rhs.width))))&&((this.animated == rhs.animated)||((this.animated!= null)&&this.animated.equals(rhs.animated))))&&((this.inGallery == rhs.inGallery)||((this.inGallery!= null)&&this.inGallery.equals(rhs.inGallery))))&&((this.favorite == rhs.favorite)||((this.favorite!= null)&&this.favorite.equals(rhs.favorite))))&&((this.inMostViral == rhs.inMostViral)||((this.inMostViral!= null)&&this.inMostViral.equals(rhs.inMostViral))));
    }

}
