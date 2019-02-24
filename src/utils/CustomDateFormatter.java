/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Calendar;
import java.util.Date;
import org.apache.commons.lang3.time.DateFormatUtils;

/**
 *
 * @author acer
 */
public class CustomDateFormatter {
    
    public static String formatToJavaDatePattern(Date date) {
        format = "dd-MM-yyyy";
        String tanggal = DateFormatUtils.format(date, format); 
        return tanggal;
    }
    public static String formatToJavaDatePattern(Calendar date) {
        format = "dd-MM-yyyy";
        String tanggal = DateFormatUtils.format(date, format); 
        return tanggal;
    }
    public static String formatToJavaDatePattern(String date) {
        String[] subDate = date.split("-");
        String tanggal = subDate[2] + "-" + subDate[1] + "-" + subDate[0];
        return tanggal;
    }
    
    public static String formatToMySqlDatePattern(Date date) {
        format = "yyyy-MM-dd";
        String tanggal = DateFormatUtils.format(date, format); 
        return tanggal;
    }
    public static String formatToMySqlDatePattern(Calendar date) {
        format = "yyyy-MM-dd";
        String tanggal = DateFormatUtils.format(date, format); 
        return tanggal;
    }
    public static String formatToMySqlDatePattern(String date) {
        String[] subDate = date.split("-");
        String tanggal = subDate[2] + "-" + subDate[1] + "-" + subDate[0];
        return tanggal;
    }
    
    private static String format;
}
