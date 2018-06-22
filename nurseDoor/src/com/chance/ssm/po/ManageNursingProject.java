package com.chance.ssm.po;

import java.util.Date;

public class ManageNursingProject {
    private String manageNursingProjectId;

    private String manageNursingProjectPic;

    private String manageNursingProjectNameId;

    private String manageNursingProjectMajor;

    private String projectImgurl;

    private String manageNursingProjectCreateter;

    private Date manageNursingProjectCreatetime;

    private Date manageNursingProjectUpdatetime;
    
    private Integer projectOrder;
    
    private String undel;
    
    

    public String getUndel() {
		return undel;
	}

	public void setUndel(String undel) {
		this.undel = undel;
	}

	public String getManageNursingProjectId() {
        return manageNursingProjectId;
    }

    public void setManageNursingProjectId(String manageNursingProjectId) {
        this.manageNursingProjectId = manageNursingProjectId == null ? null : manageNursingProjectId.trim();
    }

    public String getManageNursingProjectPic() {
        return manageNursingProjectPic;
    }

    public void setManageNursingProjectPic(String manageNursingProjectPic) {
        this.manageNursingProjectPic = manageNursingProjectPic == null ? null : manageNursingProjectPic.trim();
    }

    public String getManageNursingProjectNameId() {
        return manageNursingProjectNameId;
    }

    public void setManageNursingProjectNameId(String manageNursingProjectNameId) {
        this.manageNursingProjectNameId = manageNursingProjectNameId == null ? null : manageNursingProjectNameId.trim();
    }

    public String getManageNursingProjectMajor() {
        return manageNursingProjectMajor;
    }

    public void setManageNursingProjectMajor(String manageNursingProjectMajor) {
        this.manageNursingProjectMajor = manageNursingProjectMajor == null ? null : manageNursingProjectMajor.trim();
    }

    public String getProjectImgurl() {
        return projectImgurl;
    }

    public void setProjectImgurl(String projectImgurl) {
        this.projectImgurl = projectImgurl == null ? null : projectImgurl.trim();
    }

    public String getManageNursingProjectCreateter() {
        return manageNursingProjectCreateter;
    }

    public void setManageNursingProjectCreateter(String manageNursingProjectCreateter) {
        this.manageNursingProjectCreateter = manageNursingProjectCreateter == null ? null : manageNursingProjectCreateter.trim();
    }

    public Date getManageNursingProjectCreatetime() {
        return manageNursingProjectCreatetime;
    }

    public void setManageNursingProjectCreatetime(Date manageNursingProjectCreatetime) {
        this.manageNursingProjectCreatetime = manageNursingProjectCreatetime;
    }

    public Date getManageNursingProjectUpdatetime() {
        return manageNursingProjectUpdatetime;
    }

    public void setManageNursingProjectUpdatetime(Date manageNursingProjectUpdatetime) {
        this.manageNursingProjectUpdatetime = manageNursingProjectUpdatetime;
    }
    
    public Integer getProjectOrder() {
        return projectOrder;
    }

    public void setProjectOrder(Integer projectOrder) {
        this.projectOrder = projectOrder;
    }
}