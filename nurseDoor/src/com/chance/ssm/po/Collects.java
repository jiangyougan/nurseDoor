package com.chance.ssm.po;

import java.util.Date;

public class Collects {
    private String collectionId;

    private String collectionUserid;

    private String collectionContentid;

    private Date collectionCreatime;

    public String getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId == null ? null : collectionId.trim();
    }

    public String getCollectionUserid() {
        return collectionUserid;
    }

    public void setCollectionUserid(String collectionUserid) {
        this.collectionUserid = collectionUserid == null ? null : collectionUserid.trim();
    }

    public String getCollectionContentid() {
        return collectionContentid;
    }

    public void setCollectionContentid(String collectionContentid) {
        this.collectionContentid = collectionContentid == null ? null : collectionContentid.trim();
    }

    public Date getCollectionCreatime() {
        return collectionCreatime;
    }

    public void setCollectionCreatime(Date collectionCreatime) {
        this.collectionCreatime = collectionCreatime;
    }
}