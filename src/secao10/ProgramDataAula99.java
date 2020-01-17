package secao10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ProgramDataAula99 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z" )); //UTC
	
		System.out.println("x5: " + sdf2.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);//isso acrescenta + 4 horas na hora do dia
		d = cal.getTime();
		System.out.println(sdf2.format(d));
	
	}

}
