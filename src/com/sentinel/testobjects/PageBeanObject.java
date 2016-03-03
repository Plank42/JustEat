package com.sentinel.testobjects;

public class PageBeanObject {

    private String title;
    private String url;
    private String siteName;

    public PageBeanObject(String title, String url, String siteName) {
        this.title = title;
        this.url = url;
        this.siteName = siteName;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getSiteName() {
        return siteName;
    }
}
