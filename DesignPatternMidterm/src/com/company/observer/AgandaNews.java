package com.company.observer;

/**
 * Created by Alper on 12.11.2016.
 */
public class AgandaNews {
    private String newsHeader;
    private String newsText;
    private String newsDate;

    public AgandaNews(String newsHeader, String newsText, String newsDate) {
        this.newsHeader = newsHeader;
        this.newsText = newsText;
        this.newsDate = newsDate;
    }

    public String getNewsHeader() {
        return newsHeader;
    }

    public void setNewsHeader(String newsHeader) {
        this.newsHeader = newsHeader;
    }

    public String getNewsText() {
        return newsText;
    }

    public void setNewsText(String newsText) {
        this.newsText = newsText;
    }

    public String getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(String newsDate) {
        this.newsDate = newsDate;
    }
}