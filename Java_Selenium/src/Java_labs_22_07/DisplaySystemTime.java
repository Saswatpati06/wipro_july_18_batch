package Java_labs_22_07;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplaySystemTime 
{
	    public static void main(String[] args) {
	        LocalDateTime current = LocalDateTime.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E MMM dd HH:mm:ss z yyyy");

	        // Since LocalDateTime doesn't have time zone, you'd normally add ZonedDateTime for full match
	        System.out.println("Current Date time: " + current);
	    }
	}


