package bhxh.utils;

import org.apache.log4j.Logger;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class DateUtils {
    private static Logger logger = Logger.getLogger(DateUtils.class);
    public static final String ddMMyyyyHHmmss = "dd/MM/yyyy HH:mm:ss";
    public static final String yyyyMMddTHHmmssZ = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    public static final String yyyyMMdd_T_HHmmssSSS = "yyyy-MM-dd'T'HH:mm:ss.SSS";
    private static final String yyyyMMdd_T_HHmmss = "yyyy-MM-dd'T'HH:mm:ss";
    public static final String yyyyMMddHHmmss = "yyyy-MM-dd HH:mm:ss";
    public static final String yyyyMMddHHmmssSSS = "yyyy-MM-dd hh:mm:ss.SSS";

    public static Date convertStringToDate_ssmmHHddMMYYYY(String strdate) {
        try {
            DateFormat dateFormat = new SimpleDateFormat(ddMMyyyyHHmmss);
            return dateFormat.parse(strdate);
        } catch (ParseException e) {
            logger.error("Exception parse date : " + strdate + "|" + e);
            return null;
        }

    }

    public static Date convertStringToDate_yyyyMMddHHmmss(String strdate) {
        try {
            if (strdate.trim().equals("")) {
                return null;
            } else {
                DateFormat dateFormat = new SimpleDateFormat(yyyyMMddHHmmss);
                return dateFormat.parse(strdate);
            }
        } catch (ParseException e) {
            logger.error("Exception parse date : " + strdate + "|" + e);
            return null;
        }

    }


    public static Date convertStringToDate_yyyyMMddTHHmmssZ(String strdate) {
        try {
            if (strdate.trim().equals("")) {
                return null;
            } else {
                DateFormat dateFormat = new SimpleDateFormat(yyyyMMddTHHmmssZ);
                return dateFormat.parse(strdate);
            }
        } catch (ParseException e) {
            logger.error("Exception parse date : " + strdate + "|" + e);
            return null;
        }

    }

    public static Timestamp convertStringToTimestamp(String date, String format) {
        Timestamp timestamp = null;
        SimpleDateFormat dateFormat = null;
        Date parsedDate = null;
        if (date != null && !"".equals(date) && !"null".equals(date)) {
            try {
                switch (format) {
                    case yyyyMMddHHmmssSSS:
                        if (date.length() > yyyyMMddHHmmss.length())
                            dateFormat = new SimpleDateFormat(yyyyMMddHHmmssSSS);
                        else
                            dateFormat = new SimpleDateFormat(yyyyMMddHHmmss);
                        parsedDate = dateFormat.parse(date);
                        timestamp = new java.sql.Timestamp(parsedDate.getTime());
                        return timestamp;
                    case yyyyMMdd_T_HHmmssSSS:
                        try {
                            dateFormat = new SimpleDateFormat(yyyyMMdd_T_HHmmssSSS, Locale.getDefault());
                            parsedDate = dateFormat.parse(date);
                        } catch (Exception ex) {
                            dateFormat = new SimpleDateFormat(yyyyMMdd_T_HHmmss, Locale.getDefault());
                            parsedDate = dateFormat.parse(date);
                        }
                        timestamp = new java.sql.Timestamp(parsedDate.getTime());
                        return timestamp;
                }
            } catch (Exception e) {
                logger.error("Exception parse date : " + date + "|" + e);
                return null;
            }
        }
        return null;
    }

    public static String convertDateToString__yyyyMMddTHHmmssZ(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(yyyyMMddTHHmmssZ);
        return simpleDateFormat.format(date);
    }

    public static Date subtractDate(Date date, Integer month, Integer day, Integer hour, Integer min) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        if (month != null)
            cal.add(Calendar.MONTH, month);
        if (day != null)
            cal.add(Calendar.DATE, day);
        if (hour != null)
            cal.add(Calendar.HOUR, hour);
        if (min != null)
            cal.add(Calendar.MINUTE, min);
        Date dateBefore = cal.getTime();
        return dateBefore;
    }

    public static Date roundDate(Date date, Integer month, Integer day, Integer hour, Integer min, Integer second) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        if (month != null)
            cal.set(Calendar.MONTH, month);
        if (day != null)
            cal.set(Calendar.DATE, day);
        if (hour != null)
            cal.set(Calendar.HOUR_OF_DAY, hour);
        if (min != null)
            cal.set(Calendar.MINUTE, min);
        if (second != null)
            cal.set(Calendar.SECOND, second);
        Date dateBefore = cal.getTime();
        return dateBefore;
    }

    public static void main(String[] args) {
        Timestamp date = convertStringToTimestamp("2017-11-01 15:20:55", yyyyMMddHHmmssSSS);

        System.out.println(date);
//        date = convertStringToTimestamp("2017-09-21T10:16:28", yyyyMMdd_T_HHmmssSSS);
        System.out.println(date);
    }

}
