package com.chance.ssm.po;

import java.util.Date;

public class Follow {
    private String followId;

    private String followFollowid;

    private Integer followFollowidIden;

    private String followBefollowid;

    private Integer followBefollowidIden;

    private Date followCreatetime;

    public String getFollowId() {
        return followId;
    }

    public void setFollowId(String followId) {
        this.followId = followId == null ? null : followId.trim();
    }

    public String getFollowFollowid() {
        return followFollowid;
    }

    public void setFollowFollowid(String followFollowid) {
        this.followFollowid = followFollowid == null ? null : followFollowid.trim();
    }

    public Integer getFollowFollowidIden() {
        return followFollowidIden;
    }

    public void setFollowFollowidIden(Integer followFollowidIden) {
        this.followFollowidIden = followFollowidIden;
    }

    public String getFollowBefollowid() {
        return followBefollowid;
    }

    public void setFollowBefollowid(String followBefollowid) {
        this.followBefollowid = followBefollowid == null ? null : followBefollowid.trim();
    }

    public Integer getFollowBefollowidIden() {
        return followBefollowidIden;
    }

    public void setFollowBefollowidIden(Integer followBefollowidIden) {
        this.followBefollowidIden = followBefollowidIden;
    }

    public Date getFollowCreatetime() {
        return followCreatetime;
    }

    public void setFollowCreatetime(Date followCreatetime) {
        this.followCreatetime = followCreatetime;
    }
}