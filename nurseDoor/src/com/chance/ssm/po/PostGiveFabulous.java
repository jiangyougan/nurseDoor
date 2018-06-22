package com.chance.ssm.po;

import java.util.Date;

public class PostGiveFabulous {
    private Integer postGiveFabulousId;

    private String postGiveFabulousNurseId;

    private String postGiveFabulousPostThreeId;

    private Date postGiveFabulousCreatetime;

    public Integer getPostGiveFabulousId() {
        return postGiveFabulousId;
    }

    public void setPostGiveFabulousId(Integer postGiveFabulousId) {
        this.postGiveFabulousId = postGiveFabulousId;
    }

    public String getPostGiveFabulousNurseId() {
        return postGiveFabulousNurseId;
    }

    public void setPostGiveFabulousNurseId(String postGiveFabulousNurseId) {
        this.postGiveFabulousNurseId = postGiveFabulousNurseId == null ? null : postGiveFabulousNurseId.trim();
    }

    public String getPostGiveFabulousPostThreeId() {
        return postGiveFabulousPostThreeId;
    }

    public void setPostGiveFabulousPostThreeId(String postGiveFabulousPostThreeId) {
        this.postGiveFabulousPostThreeId = postGiveFabulousPostThreeId == null ? null : postGiveFabulousPostThreeId.trim();
    }

    public Date getPostGiveFabulousCreatetime() {
        return postGiveFabulousCreatetime;
    }

    public void setPostGiveFabulousCreatetime(Date postGiveFabulousCreatetime) {
        this.postGiveFabulousCreatetime = postGiveFabulousCreatetime;
    }
}