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
    private static String format;
    static Calendar calendar = Calendar.getInstance();
    static Date date;
    public static String formatFromMySqlDate(Date cal) {
        format = "dd-MM-yyyy";
        String tanggal = DateFormatUtils.format(cal, format); 
        return tanggal;
    }
    public static String formatFromMySqlDate(Calendar cal) {
        format = "dd-MM-yyyy";
        String tanggal = DateFormatUtils.format(cal, format); 
        return tanggal;
    }
    
    public static String formatToMySqlDate(Date cal) {
        format = "yyyy-MM-dd";
        String tanggal = DateFormatUtils.format(cal, format); 
        return tanggal;
    }
    public static String formatToMySqlDate(Calendar cal) {
        format = "yyyy-MM-dd";
        String tanggal = DateFormatUtils.format(cal, format); 
        return tanggal;
    }
    public static void main(String[] args) {
        
        
    }
}
