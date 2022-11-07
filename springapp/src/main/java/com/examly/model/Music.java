package com.examly.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Music {
    @Id
    private int musicid;
	private String musicname;
	private String musicurl;
	private String musicposterurl;
    private String musicalbum;
	private String musicartist;
    private String likes;
    public int getMusicid() {
        return musicid;
    }
    public void setMusicid(int musicid) {
        this.musicid = musicid;
    }
    public String getMusicname() {
        return musicname;
    }
    public void setMusicname(String musicname) {
        this.musicname = musicname;
    }
    public String getMusicurl() {
        return musicurl;
    }
    public void setMusicurl(String musicurl) {
        this.musicurl = musicurl;
    }
    public String getMusicposterurl() {
        return musicposterurl;
    }
    public void setMusicposterurl(String musicposterurl) {
        this.musicposterurl = musicposterurl;
    }
    public String getMusicalbum() {
        return musicalbum;
    }
    public void setMusicalbum(String musicalbum) {
        this.musicalbum = musicalbum;
    }
    public String getMusicartist() {
        return musicartist;
    }
    public void setMusicartist(String musicartist) {
        this.musicartist = musicartist;
    }
    public String getLikes() {
        return likes;
    }
    public void setLikes(String likes) {
        this.likes = likes;
    }
    
    
}
