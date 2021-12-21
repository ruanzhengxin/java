package DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class DateUtils {
    private DateUtils(){}
    public static String dateToString(Date date,String format){
        SimpleDateFormat sfm=new SimpleDateFormat(format);
        String s=sfm.format(date);
        return  s;
    }

    public static Date stringToDate(String s,String format) throws ParseException {
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        d=sdf.parse(s);
        return d;
    }
}
