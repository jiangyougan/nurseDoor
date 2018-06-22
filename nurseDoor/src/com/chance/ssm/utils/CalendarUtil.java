package com.chance.ssm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CalendarUtil {
	
	
	public static Logger logger = LoggerFactory.getLogger(CalendarUtil.class);
	
    private static final Calendar CALENDAR = Calendar.getInstance();

    public static final ThreadLocal<SimpleDateFormat> sf   = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }
    };
    public static final ThreadLocal<SimpleDateFormat> sf2  = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("MM-dd");
        }
    };
    public static final ThreadLocal<SimpleDateFormat> sdf  = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };
    public static final ThreadLocal<SimpleDateFormat> sdf1 = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyyMMddHHmmssS");
        }
    };
    public static final ThreadLocal<SimpleDateFormat> sdf2 = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyyMMddHHmmss");
        }
    };
    public static final ThreadLocal<SimpleDateFormat> time = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HHmmss");
        }
    };

    public static int getYear() {
        return CALENDAR.get(Calendar.YEAR);
    }

    public static int getMonth() {
        return CALENDAR.get(Calendar.MONTH);
    }

    public static int getDay() {
        return CALENDAR.get(Calendar.DAY_OF_MONTH);
    }

    public static int getHour() {
        return CALENDAR.get(Calendar.HOUR_OF_DAY);
    }

    /**
     * 把yyyy-MM-dd转化为yyyy-MM-dd 23:59:59
     *
     * @param date 日期
     * @return 转换后的日期
     */
    public static Date constructDate(String date) {

        Date newDate = null;
        try {
            date = date + " 23:59:59";
            newDate = sdf.get().parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return newDate;
    }

    /**
     * 根据MM-dd格式化
     *
     * @param date
     * @return
     */
    public static String formatBymmdd(Date date) {

        return sf2.get().format(date);
    }

    /**
     * 根据yyyy-MM-dd格式化
     *
     * @param date
     * @return
     */
    public static Date formatByDate(Date date) {

        Date newDate = null;
        try {
            newDate = sf.get().parse(sf.get().format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return newDate;
    }

    /**
     * 根据yyyy-MM-dd格式化
     *
     * @param date
     * @return yyyy-MM-dd
     */
    public static String formatDateByString(Date date) {
        return sf.get().format(date);
    }

    /**
     * 把字符串类型的日期转换为日期类型
     *
     * @param date
     * @return Date
     */
    public static Date formatDateByString(String date) {
        try {
            return sf.get().parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 根据yyyy-MM-dd HH:mm:ss格式化
     *
     * @param date
     * @return yyyy-MM-dd HH:mm:ss
     */
    public static String formatDateByTime(Date date) {
        return sf.get().format(date);
    }

    /**
     * 根据yyyy-MM-dd HH:mm:ss格式化
     *
     * @param date
     * @return yyyy-MM-dd HH:mm:ss
     */
    public static Date formatByTime(Date date) {
        Date newDate = null;
        try {
            newDate = sdf.get().parse(sdf.get().format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return newDate;
    }

    /**
     * yyyyMMddHHmmssS
     *
     * @param date
     * @return String yyyyMMddHHmmssS
     */
    public static String formatByMillisecond(Date date) {
        return sdf1.get().format(date);
    }

    /**
     * @param date
     * @return
     */
    public static String format2yyyyMMddHHmmss(Date date) {
        return sdf2.get().format(date);
    }

    /**
     * 根据MMddHHmmss格式化
     *
     * @param date
     * @return MMddHHmmss
     */
    public static String formatByMonth(Date date) {
        SimpleDateFormat sf = new SimpleDateFormat("MMddHHmmss");
        return sf.format(date);
    }

    /**
     * 根据间隔计算前N天
     *
     * @param date
     * @param space
     * @return Date
     */
    public static Date findDatesBySpace(Date date, int space) {
        try {
            return sf.get().parse(sf.get().format((date).getTime() - 60 * 60 * 1000 * 24L * space));   //间隔的日期
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获取两个日期之间的日期
     *
     * @param  date1
     * @param  date2
     * @return List<Date>
     */
    public static List<Date> getDates(String date1, String date2) {
        List<Date> dates = new ArrayList<Date>();
        try {
            if (date1.equals(date2)) {
                dates.add(sf.get().parse(date1));
                return dates;
            }

            String tmp;
            if (date1.compareTo(date2) > 0) {  //确保 date1的日期不晚于date2
                tmp = date1;
                date1 = date2;
                date2 = tmp;
            }
            dates.add(sf.get().parse(date1));
            tmp = sf.get().format(str2Date(date1).getTime() + 3600 * 24 * 1000);

            while (tmp.compareTo(date2) < 0) {
                dates.add(sf.get().parse(tmp));
                tmp = sf.get().format(str2Date(tmp).getTime() + 3600 * 24 * 1000);
            }

            dates.add(sf.get().parse(date2));
        } catch (ParseException e) {

            e.printStackTrace();
        }
        return dates;
    }

    /**
     * 获取两个日期之间的日期
     *
     * @param  date1
     * @param  date2
     * @return List<Date>
     */
    public static List<Date> getDates(Date date1, Date date2) {
        List<Date> dates = new ArrayList<Date>();
        try {
            if (date1.equals(date2)) {
                dates.add(date1);
                return dates;
            }

            Date tmp;
            if (date1.compareTo(date2) > 0) {  //确保 date1的日期不晚于date2
                tmp = date1;
                date1 = date2;
                date2 = tmp;
            }
            dates.add(date1);
            tmp = new Date(date1.getTime() + 3600 * 24 * 1000);

            while (tmp.compareTo(date2) < 0) {
                dates.add(tmp);
                tmp = new Date(tmp.getTime() + 3600 * 24 * 1000);
            }

            //dates.add(date2);
        } catch (Exception e) {

            e.printStackTrace();
        }
        return dates;
    }

    public static Date str2Date(String str) {
        String dateFormat = "yyyy-MM-dd";
        SimpleDateFormat sf = new SimpleDateFormat(dateFormat);

        if (str == null) return null;

        try {
            return sf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据日期计算前一天或者后一天
     *
     * @param date   目标日期
     * @param method 表示加一天或者减一天
     * @return Date 计算后的日期
     */
    public static Date getDateByMethod(String date, String method) {
        Date newdate = null;
        try {
            if (date == null) return null;

            if ("subtract".equals(method)) {
                newdate = sf.get().parse(sf.get().format(str2Date(date).getTime() - 3600 * 24 * 1000));
            }
            if ("add".equals(method)) {
                newdate = sf.get().parse(sf.get().format(str2Date(date).getTime() + 3600 * 24 * 1000));
            }
        } catch (ParseException e) {

            e.printStackTrace();
            return null;
        }
        return newdate;
    }

    /**
     * 计算当前日期的前space天的日期
     *
     * @param date
     * @param space
     * @return List<Date>
     */
    public static List<Date> getDatesBySpace(Date date, int space) {
        List<Date> dates = new ArrayList<Date>();
        try {
            Date date1 = sf.get().parse(sf.get().format((date).getTime() - 60 * 60 * 1000 * 24L * space));       //间隔的日期
            dates.add(date1);
            Date temp = sf.get().parse(sf.get().format((date1).getTime() + 3600 * 24 * 1000));
            while (temp.compareTo(date) <= 0) {
                dates.add(temp);
                temp = sf.get().parse(sf.get().format((temp).getTime() + 3600 * 24 * 1000));
            }
        } catch (ParseException e) {

            e.printStackTrace();
        }
        return dates;
    }

    /**
     * 计算当前日期的前space天的日期
     *
     * @param date
     * @param space
     * @return List<Date> mm-dd格式
     */
    public static List<Date> getDatesByInterval(Date date, int space) {
        List<Date> dates = new ArrayList<Date>();
        try {
            Date date1 = sf.get().parse(sf.get().format((date).getTime() - 60 * 60 * 1000 * 24L * space));       //间隔的日期
            dates.add(sf2.get().parse(sf.get().format((date1).getTime())));
            Date temp = sf.get().parse(sf.get().format((date1).getTime() + 3600 * 24 * 1000));
            while (temp.compareTo(date) <= 0) {
                dates.add(sf2.get().parse(sf.get().format((temp).getTime())));
                temp = sf.get().parse(sf.get().format((temp).getTime() + 3600 * 24 * 1000));
            }
        } catch (ParseException e) {

            e.printStackTrace();
        }
        return dates;
    }

    /**
     * 计算当前日期的前space天的日期
     *
     * @param date
     * @param space
     * @return List<Date> mm-dd格式
     */
    public static List<String> formatByInterval(Date date, int space) {
        List<String> dates = new ArrayList<String>();
        try {
            Date date1 = sf.get().parse(sf.get().format((date).getTime() - 60 * 60 * 1000 * 24L * space));       //间隔的日期
            dates.add(sf2.get().format(date1));
            Date temp = sf.get().parse(sf.get().format((date1).getTime() + 3600 * 24 * 1000));
            while (temp.compareTo(date) <= 0) {
                dates.add(sf2.get().format(temp));
                temp = sf.get().parse(sf.get().format((temp).getTime() + 3600 * 24 * 1000));
            }
        } catch (ParseException e) {

            e.printStackTrace();
        }
        return dates;
    }

    /**
     * 计算两个日期之间相差的天数 ,日期极端
     *
     * @param smdate 较小的时间
     * @param bdate  较大的时间
     * @return int 相差天数
     */
    public static int daysBetween(Date smdate, Date bdate) throws ParseException {
        smdate = sf.get().parse(sf.get().format(smdate));
        bdate = sf.get().parse(sf.get().format(bdate));
        Calendar cal = Calendar.getInstance();
        cal.setTime(smdate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(bdate);
        long time2 = cal.getTimeInMillis();
        long between_days = (time2 - time1) / (1000 * 3600 * 24);

        return Integer.parseInt(String.valueOf(between_days));
    }

    /**
     * 计算两个日期之间相差的天数, 字符串的日期格式的计算
     *
     * @param smdate 较小的时间
     * @param bdate  较大的时间
     * @return int 相差天数
     */
    public static int daysBetween(String smdate, String bdate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse(smdate));
        long time1 = cal.getTimeInMillis();
        cal.setTime(sdf.parse(bdate));
        long time2 = cal.getTimeInMillis();
        long between_days = (time2 - time1) / (1000 * 3600 * 24);

        return Integer.parseInt(String.valueOf(between_days));
    }

    public static List<Date> getDateByMonth(Date date) {
        List<Date> dates = new ArrayList<Date>(0);
        try {
            Date temp = new Date(date.getTime() - 60 * 60 * 24 * 1000L * 30);
            while (temp.compareTo(date) <= 0) {
                dates.add(sf.get().parse(sf.get().format(temp)));
                temp = sf.get().parse(sf.get().format((temp).getTime() + 3600 * 24 * 1000));
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dates;
    }

    /**
     * Unix时间戳转换成指定格式日期
     *
     * @param timestampString
     * @return String
     */
    public static String TimeStamp2DateString(String timestampString) {
        Long timestamp = timestampString.length() == 10 ? (Long.parseLong(timestampString) * 1000) : Long.parseLong(timestampString);
        String date = sdf.get().format(new java.util.Date(timestamp));
        return date;
    }

    /**
     * Unix时间戳转换成指定格式日期
     *
     * @param timestampString
     * @return Date
     */
    public static Date TimeStamp2Date(String timestampString) {
        Date date = null;
        Long timestamp = timestampString.length() == 10 ? (Long.parseLong(timestampString) * 1000) : Long.parseLong(timestampString);
        try {
            date = sdf.get().parse(sdf.get().format(new java.util.Date(timestamp)));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 根据yyyy-MM-dd HH:mm:ss格式化
     *
     * @param date
     * @return yyyy-MM-dd HH:mm:ss
     */
    public static Date formatByTime(String date) {
        Date newDate = null;
        try {
            newDate = sdf.get().parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            newDate = null;
        }
        return newDate;
    }

    /**
     * 根据yyyy-MM-dd HH:mm:ss格式化
     *
     * @param date
     * @return yyyy-MM-dd HH:mm:ss
     * @throws ParseException
     */
    public static Date formatToTime(String date) throws ParseException {
        Date newDate = null;
        newDate = sdf.get().parse(date);
        return newDate;
    }

    /**
     * 根据yyyy-MM-dd HH:mm:ss格式化
     *
     * @param date
     * @return yyyy-MM-dd HH:mm:ss
     */
    public static String format2String(Date date) {
        return sdf.get().format(date);
    }

    /**
     * 获取当前时间的时分秒 HHmmss（24小时格式）
     *
     * @return Integer
     */
    public static Integer date2HHmmss() {
        return Integer.valueOf(time.get().format(new Date()));
    }

    /**
     * 获取当前月第一天
     *
     * @return String
     */
    public static String currentMonthFirstDay() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, 0);
        c.set(Calendar.DAY_OF_MONTH, 1);//设置为1号,当前日期既为本月第一天
        return sf.get().format(c.getTime());
    }

    /**
     * 获取两个日期相差的天数
     *
     * @param endDate
     * @param startDate
     * @return
     */
    public static int getDateDifference4Day(Date endDate, Date startDate) {
        return new Long((endDate.getTime() - startDate.getTime()) / (1000 * 60 * 60 * 24)).intValue();
    }

    public static String setStartDate() {
        String startDate = null;
        try {
            startDate = sf.get().format(new Date()) + " 00:00:00";     //默认当天
        } catch (Exception e) {
            e.printStackTrace();
            startDate = null;
        }
        return startDate;
    }

    public static String setEndDate() {
        String endDate = null;
        try {
            endDate = sf.get().format(new Date());     //默认当天
            Date date = new Date(sf.get().parse(endDate).getTime() + (24 * 60 * 60) * 1000);
            endDate = sf.get().format(date) + " 00:00:00";
        } catch (Exception e) {
            e.printStackTrace();
            endDate = null;
        }
        return endDate;
    }

    public static void main(String[] args) {
        System.err.println(setEndDate());
    }
    
    public static void writLog(String msg ,Date date1,Date date2){
    	logger.info("waimai/dataUpload.htm"+msg+"耗时"+(date2.getTime()-date1.getTime())+"ms");
    }
}
