package com.chance.ssm.po;

import java.util.Date;

public class AdminModular {
    private String modularId;

    private String modularName;

    private String modularCreater;

    private Date modularCreatetime;

    public String getModularId() {
        return modularId;
    }

    public void setModularId(String modularId) {
        this.modularId = modularId == null ? null : modularId.trim();
    }

    public String getModularName() {
        return modularName;
    }

    public void setModularName(String modularName) {
        this.modularName = modularName == null ? null : modularName.trim();
    }

    public String getModularCreater() {
        return modularCreater;
    }

    public void setModularCreater(String modularCreater) {
        this.modularCreater = modularCreater == null ? null : modularCreater.trim();
    }

    public Date getModularCreatetime() {
        return modularCreatetime;
    }

    public void setModularCreatetime(Date modularCreatetime) {
        this.modularCreatetime = modularCreatetime;
    }
}