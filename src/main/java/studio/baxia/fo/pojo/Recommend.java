package studio.baxia.fo.pojo;

import java.util.Date;

/**
 * Created by Pan on 2016/12/20.
 */
public class Recommend {
    private long id;
    private String title;
    private boolean hasContent;
    private int contentId;
    private String articleUrl;
    private String summary;
    private Date pubTime;;
    private int hits;

    @Override
    public String toString() {
        return "RecommendVo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", hasContent=" + hasContent +
                ", contentId=" + contentId +
                ", articleUrl='" + articleUrl + '\'' +
                ", summary='" + summary + '\'' +
                ", pubTime=" + pubTime +
                ", hits=" + hits +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isHasContent() {
        return hasContent;
    }

    public void setHasContent(boolean hasContent) {
        this.hasContent = hasContent;
    }

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Date getPubTime() {
        return pubTime;
    }

    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }
}