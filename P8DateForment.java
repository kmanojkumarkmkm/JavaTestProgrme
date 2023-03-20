package onesoft.testProgram;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class P8DateForment {

	public static void main(String[] args) {

		String date = "1/2/2342";
		DateTimeFormatter myPatten = DateTimeFormatter.ofPattern("d/M/yyyy");
		LocalDate locatDate = LocalDate.parse(date, myPatten);
		// SimpleDateFormat dateFormet=new SimpleDateFormat("dd/MM/yyyy");
		// dateFormet.format(locatDate);
		System.out.println(locatDate);

	}

}
