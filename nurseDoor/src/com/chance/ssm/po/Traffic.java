package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.Date;

public class Traffic {
    private String trafficId;

    private BigDecimal trafficCost;

    private String trafficCreater;

    private Date trafficUpdatetime;

    public String getTrafficId() {
        return trafficId;
    }

    public void setTrafficId(String trafficId) {
        this.trafficId = trafficId == null ? null : trafficId.trim();
    }

    public BigDecimal getTrafficCost() {
        return trafficCost;
    }

    public void setTrafficCost(BigDecimal trafficCost) {
        this.trafficCost = trafficCost;
    }

    public String getTrafficCreater() {
        return trafficCreater;
    }

    public void setTrafficCreater(String trafficCreater) {
        this.trafficCreater = trafficCreater == null ? null : trafficCreater.trim();
    }

    public Date getTrafficUpdatetime() {
        return trafficUpdatetime;
    }

    public void setTrafficUpdatetime(Date trafficUpdatetime) {
        this.trafficUpdatetime = trafficUpdatetime;
    }
}