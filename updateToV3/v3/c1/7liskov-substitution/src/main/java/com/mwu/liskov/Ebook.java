package com.mwu.liskov;

public class Ebook extends Book{

    private String downloadLink;

    public Ebook(String title, String author) {
        super(title, author);
    }

    public Ebook(String title, String author, String downloadLink) {
        super(title, author);
        this.downloadLink = downloadLink;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }
}
