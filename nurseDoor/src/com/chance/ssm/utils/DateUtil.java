package com.chance.ssm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtil {

	/**
	 * 得到某年某周的第一天
	 * 
	 * @param year
	 * @param week
	 * @return
	 */
	public static Date getFirstDayOfWeek(int year, int week) {
		week = week - 1;
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, Calendar.JANUARY);
		calendar.set(Calendar.DATE, 1);

		Calendar cal = (Calendar) calendar.clone();
		cal.add(Calendar.DATE, week * 7);
		System.out.println("getFirstDayOfWeek:"+cal.getTime());
		return getFirstDayOfWeek(cal.getTime());
	}

	/**
	 * 得到某年某周的最后一天
	 * 
	 * @param year
	 * @param week
	 * @return
	 */
	public static Date getLastDayOfWeek(int year, int week) {
		week = week - 1;
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, Calendar.JANUARY);
		calendar.set(Calendar.DATE, 1);
		Calendar cal = (Calendar) calendar.clone();
		cal.add(Calendar.DATE, week * 7);
		return getLastDayOfWeek(cal.getTime());
	}
	
	// 获得下周星期日的日期  
	public static String getNextSunday(int count)   
	    {  
	     //   weeks++;  
	        GregorianCalendar currentDate = new GregorianCalendar();  
	        Calendar strDate = Calendar.getInstance();         
	        strDate.add(strDate.DATE,count);  
	        System.out.println("=="+strDate.getTime());  
	        currentDate.set(strDate.get(Calendar.YEAR), strDate.get(Calendar.MONTH),strDate.get(Calendar.DATE));  
	        currentDate.add(GregorianCalendar.DATE, 6);  
	        Date monday = currentDate.getTime();  
	        SimpleDateFormat df = new SimpleDateFormat("MMdd");  
	        String preMonday = df.format(monday);  
	        return preMonday;  
	    }  

	/**
	 * 取得当前日期所在周的第一天
	 * 
	 * @param date
	 * @return
	 */
	public static Date getFirstDayOfWeek(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setFirstDayOfWeek(Calendar.SUNDAY);
		calendar.setTime(date);
		calendar.set(Calendar.DAY_OF_WEEK, calendar.getFirstDayOfWeek()); // Sunday
		return calendar.getTime();
	}
	
	/**
	 * 取得当前日期所在周的前几周的第一天
	 * @param num 前几周
	 * @return
	 */
	public static Date getFirstDayOfWeek(int num) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 0);  
		calendar.set(Calendar.MINUTE, 0);  
		calendar.set(Calendar.SECOND, 0);  
		calendar.set(Calendar.MILLISECOND, 0); 
		
		Calendar cal = (Calendar) calendar.clone();
		cal.add(Calendar.DATE, num * 7);
		cal.set(Calendar.DAY_OF_WEEK, 1);
		return cal.getTime();
	}
	
	/**
	 * 获取当天开始时间
	 * */
	public static Date getTodayStart(){
		Calendar todayStart = Calendar.getInstance();  
		todayStart.set(Calendar.HOUR_OF_DAY, 0);  
		todayStart.set(Calendar.MINUTE, 0);  
		todayStart.set(Calendar.SECOND, 0);  
		todayStart.set(Calendar.MILLISECOND, 0);
        return todayStart.getTime();
	}
	/**
	 * 获取当天结束时间
	 * */
	public static Date getTodayEnd(){
		Calendar todayEnd = Calendar.getInstance();  
		todayEnd.set(Calendar.HOUR_OF_DAY, 23);  
        todayEnd.set(Calendar.MINUTE, 59);  
        todayEnd.set(Calendar.SECOND, 59);  
        todayEnd.set(Calendar.MILLISECOND, 999);
        return todayEnd.getTime();
	}
	
	/**
	 * 取得当前日期所在周的最后一天
	 * 
	 * @param date
	 * @return
	 */
	public static Date getLastDayOfWeek(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setFirstDayOfWeek(Calendar.SUNDAY);
		calendar.setTime(date);
		calendar.set(Calendar.DAY_OF_WEEK, calendar.getFirstDayOfWeek() + 6); // Saturday
		return calendar.getTime();
	}
	
	/**
	 * 取得当前日期所在周的前几周最后一天
	 * @param num 前几周
	 * @return
	 */
	public static Date getLastDayOfWeek(int num) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 23);  
		calendar.set(Calendar.MINUTE, 59);  
		calendar.set(Calendar.SECOND, 59);  
		calendar.set(Calendar.MILLISECOND, 999); 
		
		Calendar cal = (Calendar) calendar.clone();
		cal.add(Calendar.DATE, num * 7);
		cal.set(Calendar.DAY_OF_WEEK, 7);
		return cal.getTime();
	}

	/**
	 * 取得当前日期所在周的前一周最后一天
	 * 
	 * @param date
	 * @return
	 */
	public static Date getLastDayOfLastWeek(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return getLastDayOfWeek(calendar.get(Calendar.YEAR), calendar.get(Calendar.WEEK_OF_YEAR) - 1);
	}
	

	/**
	 * 返回指定日期的月的第一天
	 * 
	 * @param year
	 * @param month
	 * @return
	 */
	public static Date getFirstDayOfMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
				1);
		return calendar.getTime();
	}

	/**
	 * 返回指定年月的月的第一天
	 * 
	 * @param year
	 * @param month
	 * @return
	 */
	public static Date getFirstDayOfMonth(Integer year, Integer month) {
		Calendar calendar = Calendar.getInstance();
		if (year == null) {
			year = calendar.get(Calendar.YEAR);
		}
		if (month == null) {
			month = calendar.get(Calendar.MONTH);
		}
		calendar.set(year, month, 1);
		return calendar.getTime();
	}

	/**
	 * 返回指定日期的月的最后一天
	 * 
	 * @param year
	 * @param month
	 * @return
	 */
	public static Date getLastDayOfMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
				1);
		calendar.roll(Calendar.DATE, -1);
		return calendar.getTime();
	}

	/**
	 * 返回指定年月的月的最后一天
	 * 
	 * @param year
	 * @param month
	 * @return
	 */
	public static Date getLastDayOfMonth(Integer year, Integer month) {
		Calendar calendar = Calendar.getInstance();
		if (year == null) {
			year = calendar.get(Calendar.YEAR);
		}
		if (month == null) {
			month = calendar.get(Calendar.MONTH);
		}
		calendar.set(year, month, 1);
		calendar.roll(Calendar.DATE, -1);
		return calendar.getTime();
	}

	/**
	 * 返回指定日期的上个月的最后一天
	 * 
	 * @param year
	 * @param month
	 * @return
	 */
	public static Date getLastDayOfLastMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(calendar.get(Calendar.YEAR),
				calendar.get(Calendar.MONTH) - 1, 1);
		calendar.roll(Calendar.DATE, -1);
		return calendar.getTime();
	}

	/**
	 * 返回指定日期的季的第一天
	 * 
	 * @param year
	 * @param quarter
	 * @return
	 */
	public static Date getFirstDayOfQuarter(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return getFirstDayOfQuarter(calendar.get(Calendar.YEAR),
				getQuarterOfYear(date));
	}

	/**
	 * 返回指定年季的季的第一天
	 * 
	 * @param year
	 * @param quarter
	 * @return
	 */
	public static Date getFirstDayOfQuarter(Integer year, Integer quarter) {
		Calendar calendar = Calendar.getInstance();
		Integer month = new Integer(0);
		if (quarter == 1) {
			month = 1 - 1;
		} else if (quarter == 2) {
			month = 4 - 1;
		} else if (quarter == 3) {
			month = 7 - 1;
		} else if (quarter == 4) {
			month = 10 - 1;
		} else {
			month = calendar.get(Calendar.MONTH);
		}
		return getFirstDayOfMonth(year, month);
	}

	/**
	 * 返回指定日期的季的最后一天
	 * 
	 * @param year
	 * @param quarter
	 * @return
	 */
	public static Date getLastDayOfQuarter(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return getLastDayOfQuarter(calendar.get(Calendar.YEAR),
				getQuarterOfYear(date));
	}

	/**
	 * 返回指定年季的季的最后一天
	 * 
	 * @param year
	 * @param quarter
	 * @return
	 */
	public static Date getLastDayOfQuarter(Integer year, Integer quarter) {
		Calendar calendar = Calendar.getInstance();
		Integer month = new Integer(0);
		if (quarter == 1) {
			month = 3 - 1;
		} else if (quarter == 2) {
			month = 6 - 1;
		} else if (quarter == 3) {
			month = 9 - 1;
		} else if (quarter == 4) {
			month = 12 - 1;
		} else {
			month = calendar.get(Calendar.MONTH);
		}
		return getLastDayOfMonth(year, month);
	}

	/**
	 * 返回指定日期的上一季的最后一天
	 * 
	 * @param year
	 * @param quarter
	 * @return
	 */
	public static Date getLastDayOfLastQuarter(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return getLastDayOfLastQuarter(calendar.get(Calendar.YEAR),
				getQuarterOfYear(date));
	}

	/**
	 * 返回指定年季的上一季的最后一天
	 * 
	 * @param year
	 * @param quarter
	 * @return
	 */
	public static Date getLastDayOfLastQuarter(Integer year, Integer quarter) {
		Calendar calendar = Calendar.getInstance();
		Integer month = new Integer(0);
		if (quarter == 1) {
			month = 12 - 1;
		} else if (quarter == 2) {
			month = 3 - 1;
		} else if (quarter == 3) {
			month = 6 - 1;
		} else if (quarter == 4) {
			month = 9 - 1;
		} else {
			month = calendar.get(Calendar.MONTH);
		}
		return getLastDayOfMonth(year, month);
	}
	public static String getAfterafewdays(Integer date) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
        System.out.println("当前日期：               "+sf.format(c.getTime()));
        c.add(Calendar.DAY_OF_MONTH, date);
        System.out.println("增加一天后日期 ："+sf.format(c.getTime()));
		return sf.format(c.getTime());
	}
	/**
	 * 比较两个时间的时间差
	 */
	public static String getStandardDate(String timeStr) {

        StringBuffer sb = new StringBuffer();

        long t = Long.parseLong(timeStr);
        long time = System.currentTimeMillis() - (t * 1000);
        long mill = (long) Math.ceil(time / 1000);//秒前

        long minute = (long) Math.ceil(time / 60 / 1000.0f);// 分钟前

        long hour = (long) Math.ceil(time / 60 / 60 / 1000.0f);// 小时

        long day = (long) Math.ceil(time / 24 / 60 / 60 / 1000.0f);// 天前

        if (day - 1 > 0) {
            sb.append(day + "天");
        } else if (hour - 1 > 0) {
            if (hour >= 24) {
                sb.append("1天");
            } else {
                sb.append(hour + "小时");
            }
        } else if (minute - 1 > 0) {
            if (minute == 60) {
                sb.append("1小时");
            } else {
                sb.append(minute + "分钟");
            }
        } else if (mill - 1 > 0) {
            if (mill == 60) {
                sb.append("1分钟");
            } else {
                sb.append(mill + "秒");
            }
        } else {
            sb.append("刚刚");
        }
        if (!sb.toString().equals("刚刚")) {
            sb.append("前");
        }
        return sb.toString();
    }
	public static Integer getDatePoor(Date endDate, Date nowDate) {
		 
		SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");//如2016-08-10 20:40  
		String fromDate = simpleFormat.format(endDate);  
		String toDate = simpleFormat.format(nowDate);  
		long from;
		long to;
		int hours = 0;//小时
		int days = 0;//天数
		int minutes = 0;//分钟
		try {
			from = simpleFormat.parse(fromDate).getTime();
			to = simpleFormat.parse(toDate).getTime();
			
			//days= (int) ((to - from)/(1000 * 60 * 60 * 24));  
			//hours = (int) ((to - from)/(1000 * 60 * 60));  
			minutes = (int) ((to - from)/(1000 * 60));  
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		System.out.println("hours="+hours);		 
		return minutes;
	}
	public static Date getDatePoor() {
		Date date=new Date();//取时间  
		Calendar calendar = new GregorianCalendar();  
		calendar.setTime(date);  
		calendar.add(calendar.DATE,-15);//把日期往后增加一天.整数往后推,负数往前移动  
		date=calendar.getTime(); //这个时间就是日期往后推一天的结果   
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
		String dateString = formatter.format(date);  
		Date datetime = null;
		try {
			datetime = formatter.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(datetime);
		return datetime;
	}
	/**
	 * 返回指定日期的季度
	 * 
	 * @param date
	 * @return
	 */
	public static int getQuarterOfYear(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MONTH) / 3 + 1;
	}
	 /** 
     * 获取当月的 天数 
     * */  
    public static int getCurrentMonthDay() {  
          
        Calendar a = Calendar.getInstance();  
        a.set(Calendar.DATE, 1);  
        a.roll(Calendar.DATE, -1);  
        int maxDate = a.get(Calendar.DATE);  
        return maxDate;  
    }  
    public String getCurrentTime(){
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	   Calendar beforeTime = Calendar.getInstance();
    	   beforeTime.add(Calendar.MINUTE, -3);// 3分钟之前的时间
    	   Date beforeD = beforeTime.getTime();
    	   String time = sdf.format(beforeD);
    	return time;  
    	}
	public static void main(String[] args) {
		/*System.out.println(getFirstDayOfWeek(3));
			Date date=new Date();//取时间 
	     Calendar   calendar   =   new   GregorianCalendar(); 
	     calendar.setTime(date); 
	     calendar.add(calendar.DATE,1);//把日期往后增加一天.整数往后推,负数往前移动 
	     date=calendar.getTime(); 
		System.out.println(getDatePoor(new Date(),date));*/
			//System.out.println(getDatePoor(new Date(), new Date()));
		/*Date date=new Date();//取时间  
		Calendar calendar = new GregorianCalendar();  
		calendar.setTime(date);  
		calendar.add(calendar.DATE,-15);//把日期往后增加一天.整数往后推,负数往前移动  
		date=calendar.getTime(); //这个时间就是日期往后推一天的结果   
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
		String dateString = formatter.format(date);  
		System.out.println(dateString);  */
		/*Date date=new Date();//取时间  
		Calendar calendar = new GregorianCalendar();  
		calendar.setTime(date);  
		calendar.add(calendar.DATE,1);//把日期往后增加一天.整数往后推,负数往前移动  
		date=calendar.getTime(); //这个时间就是日期往后推一天的结果   
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
		String dateString = formatter.format(date);  
		System.out.println(dateString); */
		System.out.println(DateUtil.getDatePoor());
	}
}