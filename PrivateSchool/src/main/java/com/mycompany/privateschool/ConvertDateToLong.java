package com.mycompany.privateschool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDateToLong {

    public static long convertDate(String string_date) {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        long milliseconds = 0;
        try {
            Date d = f.parse(string_date);
            milliseconds = d.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return milliseconds;
    }
    public static String convertLong(Date date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        return dateFormat.format(date);
    }
}
