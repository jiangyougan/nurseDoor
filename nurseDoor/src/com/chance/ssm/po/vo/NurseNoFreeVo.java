package com.chance.ssm.po.vo;

import java.util.Date;

public class NurseNoFreeVo {

		private String nurseNofreeShiftId;//班次ID

	    private String nurseNofreeShiftNurseId;//护士ID

	    private String nurseNofreeShiftName;//班次名称

	    private String nurseNofreeShiftColor;//颜色

	    private String nurseNofreeShiftBegintime;//开始时间

	    private String nurseNofreeShiftStoptime;//结束时间
	    
	    private String nurseNofreeName;//排班表备注
	    
	    private String nurseNofreeNote;//日历备注
	    
	    private Date   nurseNofreeDate;//选择的日期
	    
	    private String nurseNofreeId;//排班表ID
	    
	    private String dates;//日期
	    
	    

		public String getNurseNofreeName() {
			return nurseNofreeName;
		}

		public void setNurseNofreeName(String nurseNofreeName) {
			this.nurseNofreeName = nurseNofreeName;
		}

		public Date getNurseNofreeDate() {
			return nurseNofreeDate;
		}

		public void setNurseNofreeDate(Date nurseNofreeDate) {
			this.nurseNofreeDate = nurseNofreeDate;
		}

		public String getNurseNofreeShiftId() {
			return nurseNofreeShiftId;
		}

		public void setNurseNofreeShiftId(String nurseNofreeShiftId) {
			this.nurseNofreeShiftId = nurseNofreeShiftId;
		}

		public String getNurseNofreeShiftNurseId() {
			return nurseNofreeShiftNurseId;
		}

		public void setNurseNofreeShiftNurseId(String nurseNofreeShiftNurseId) {
			this.nurseNofreeShiftNurseId = nurseNofreeShiftNurseId;
		}

		public String getNurseNofreeShiftName() {
			return nurseNofreeShiftName;
		}

		public void setNurseNofreeShiftName(String nurseNofreeShiftName) {
			this.nurseNofreeShiftName = nurseNofreeShiftName;
		}

		public String getNurseNofreeShiftColor() {
			return nurseNofreeShiftColor;
		}

		public void setNurseNofreeShiftColor(String nurseNofreeShiftColor) {
			this.nurseNofreeShiftColor = nurseNofreeShiftColor;
		}

		public String getNurseNofreeShiftBegintime() {
			return nurseNofreeShiftBegintime;
		}

		public void setNurseNofreeShiftBegintime(String nurseNofreeShiftBegintime) {
			this.nurseNofreeShiftBegintime = nurseNofreeShiftBegintime;
		}

		public String getNurseNofreeShiftStoptime() {
			return nurseNofreeShiftStoptime;
		}

		public void setNurseNofreeShiftStoptime(String nurseNofreeShiftStoptime) {
			this.nurseNofreeShiftStoptime = nurseNofreeShiftStoptime;
		}

		public String getNurseNofreeNote() {
			return nurseNofreeNote;
		}

		public void setNurseNofreeNote(String nurseNofreeNote) {
			this.nurseNofreeNote = nurseNofreeNote;
		}

		public String getNurseNofreeId() {
			return nurseNofreeId;
		}

		public void setNurseNofreeId(String nurseNofreeId) {
			this.nurseNofreeId = nurseNofreeId;
		}

		public String getDates() {
			return dates;
		}

		public void setDates(String dates) {
			this.dates = dates;
		}
	    
	    
}
