package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDateLong {

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
    public static String convertLong(long date){
        Date d=new Date(date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        return dateFormat.format(d);
    }
}
