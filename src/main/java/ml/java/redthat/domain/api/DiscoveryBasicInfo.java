package ml.java.redthat.domain.api;

import java.time.LocalDateTime;

public class DiscoveryBasicInfo {
    private String title;
    private String url;
    private String description;
    private LocalDateTime dateAdded;

    public DiscoveryBasicInfo(String title, String url, String description, LocalDateTime dateAdded) {
        this.title = title;
        this.url = url;
        this.description = description;
        this.dateAdded = dateAdded;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDateTime dateAdded) {
        this.dateAdded = dateAdded;
    }
}
