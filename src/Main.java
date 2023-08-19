import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;


public class Main {
    public static void main(String[] args) {

        String start_date = "09/24/2021";
        String end_date = "10/17/2021";

        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

        try {
            Date startDate = format.parse(start_date);
            Date lastDate = format.parse(end_date);
            int difference = (int) (lastDate.getTime()-startDate.getTime()) / (1000*60*60*24);
            System.out.println("Разница в днях составляет " + difference);
        } catch (Exception e) {
            System.out.println("Ошибка");
        }

        // Выше код по классу Date


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date1 = LocalDate.parse(start_date, formatter);
        LocalDate date2 = LocalDate.parse(end_date,formatter);
        long diff = ChronoUnit.DAYS.between(date1,date2);
        System.out.println("Разница в днях составляет " +diff);

        // Выше код по классу DateTime


    }
}