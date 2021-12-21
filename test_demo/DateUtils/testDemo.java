package DateUtils;

import java.text.ParseException;
import java.util.Date;

public class testDemo {
    public static void main(String[] args) throws ParseException {
        Date d=new Date();
        String s=DateUtils.dateToString(d,"yyyy-MM-dd HH:mm:ss");
        System.out.println(s);

        Date d1=DateUtils.stringToDate(s,"yyyy-MM-dd HH:mm:ss");
        System.out.println(d1);
    }
}
