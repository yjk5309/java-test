package Util;

import java.text.SimpleDateFormat;
import java.util.Date;


public class GetDate {
    public static String getCurrentDate(String fmt) {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }

    public static void main(String[] args) {
        System.out.println(GetDate.getCurrentDate("yyyyMMdd"));
    }
}