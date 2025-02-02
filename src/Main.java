import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        Date x1 = new Date();

        Date y1 = sdf1.parse("06/08/2004");

        Calendar cal = Calendar.getInstance();

        cal.setTime(x1);

        System.out.println(cal);
    }
}
