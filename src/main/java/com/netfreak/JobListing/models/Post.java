package com.netfreak.JobListing.models;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "joblistings")
public class Post {
    private String profile;
    private String desc;
    private int exp;
    private String techs[];

    public Post() {}

    public Post(String profile, String desc, int exp, String[] techs) {
        this.profile = profile;
        this.desc = desc;
        this.exp = exp;
        this.techs = techs;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setTechs(String[] techs) {
        this.techs = techs;
    }

    public String getProfile() {
        return profile;
    }

    public String getDesc() {
        return desc;
    }

    public int getExp() {
        return exp;
    }

    public String[] getTechs() {
        return techs;
    }
}
