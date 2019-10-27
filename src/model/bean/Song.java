package model.bean;

import java.sql.Date;

public class Song {
    private int id;
    private String name;
    private String previewText;
    private String detailText;
    private Date dateCreate;
    private String picture;
    private int counter;
    private int catId;

    public Song() {
    }

    public Song(int id, String name, String previewText, String detailText, Date dateCreate, String picture, int counter, int catId) {
        this.id = id;
        this.name = name;
        this.previewText = previewText;
        this.detailText = detailText;
        this.dateCreate = dateCreate;
        this.picture = picture;
        this.counter = counter;
        this.catId = catId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPreviewText(String previewText) {
        this.previewText = previewText;
    }

    public void setDetailText(String detailText) {
        this.detailText = detailText;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getName() {
        return name;
    }

    public String getPreviewText() {
        return previewText;
    }

    public String getDetailText() {
        return detailText;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public String getPicture() {
        return picture;
    }

    public int getCounter() {
        return counter;
    }

    public int getCatId() {
        return catId;
    }
}
