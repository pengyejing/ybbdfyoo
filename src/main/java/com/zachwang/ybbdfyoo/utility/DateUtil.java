package com.zachwang.ybbdfyoo.utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
  public DateUtil() {
  }

  /**
   * 根据时间格式字符串获取当前时间格式化后的字符串.
   *
   * @param formatStr 时间格式字符串
   * @return 当前时间格式化的字符串
   */
  public static String getCurrentTimeStr(String formatStr) {
    return new SimpleDateFormat(formatStr).format(new Date());
  }

  /**
   * 根据时间格式字符串获取时间格式化后的字符串.
   *
   * @param formatStr 时间格式字符串
   * @return 时间格式化的字符串
   */
  public static String getTimeStr(String formatStr, Date date) {
    return new SimpleDateFormat(formatStr).format(date);
  }

  /**
   * 获取某个月第一天一天的时间.
   *
   * @param year  年数 2018年-2018
   * @param month 月数 3月-3
   * @return 该月第一天一天的时间
   */
  public static Date getFirstDayOfMonth(int year, int month) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR, year);
    calendar.set(Calendar.MONTH, month - 1);
    calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DATE));
    return calendar.getTime();
  }

  /**
   * 获取某个月最后一天的时间.
   *
   * @param year  年数 2018年-2018
   * @param month 月数 3月-3
   * @return 该月最后一天的时间
   */
  public static Date getLastDayOfMonth(int year, int month) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR, year);
    calendar.set(Calendar.MONTH, month - 1);
    calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DATE));
    return calendar.getTime();
  }

  /**
   * 根据时间和时间偏移量获取新的时间.
   *
   * @param date        时间
   * @param millisecond 偏移时间的毫秒数，正数代表处理后的时间是处理前时间的未来时间，负数反之
   * @return 偏移后的时间
   */
  public static Date getOffSetMillisecond(Date date, int millisecond) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    calendar.add(Calendar.MILLISECOND, millisecond);
    return calendar.getTime();
  }

  /**
   * 获取某个时间对应年份的天数.
   *
   * @param date 时间
   * @return 该时间对应年份的天数
   */
  public static int getMaxDaysOfYear(Date date) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    return calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
  }

  /**
   * 获取某个时间对应月份的天数.
   *
   * @param date 时间
   * @return 该时间对应月份的天数
   */
  public static int getMaxDaysOfMonth(Date date) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
  }
}
