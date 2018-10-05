package com.southeast.Calendar.test2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Calendar;

/**
 * public void add(int field,int amount):根据给定的日历字段和对应的时间，来对当前的日历进行操作。
 * public final void set(int year,int month,int date):设置当前日历的年月日
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar= Calendar.getInstance(); // 子类对象
        System.out.println(getYearMonthDay(calendar));

        // 三年前的今天
        calendar.add(Calendar.YEAR,-3);
        System.out.println(getYearMonthDay(calendar));

        // 5年后的10天前
        calendar.add(Calendar.YEAR, 5);
        calendar.add(Calendar.DATE, -10);
        System.out.println(getYearMonthDay(calendar));

        //设置 2011年11月11日
        calendar.set(2011, 0, 11); //注意 month是从0开始的 0-11表示 1月份到12月份
        System.out.println(getYearMonthDay(calendar));
    }

    //获取年、月、日
    public static String getYearMonthDay(Calendar calendar){
        int year=calendar.get(Calendar.YEAR);
        int month=calendar.get(Calendar.MONTH);
        int date=calendar.get(Calendar.DATE);
        return year + "年" + (month + 1) + "月" + date + "日";
    }


}
