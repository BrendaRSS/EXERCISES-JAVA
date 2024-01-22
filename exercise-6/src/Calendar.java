import java.time.LocalDate;
import java.util.ArrayList;

public class Calendar {
   private ArrayList<Holidayzer> holidaysCalendar= new ArrayList<>();

   public void addHolidayzer(Holidayzer holidayzer){
    this.holidaysCalendar.add(holidayzer);
   }

   public void showHolidays(){
    for(Holidayzer holidayzer:holidaysCalendar){
        System.out.println(holidayzer.getDate() + " => " + holidayzer.getNameOfDate());
    }
   }

   public void compareDate(LocalDate date){
    for(Holidayzer holidayzer:holidaysCalendar){
        if(holidayzer.getDate().equals(date)){
            System.out.println("Dia " + date + " é: " + holidayzer.getNameOfDate());
            return;
        }
    }
    System.out.println("Dia " + date + " não é um feriado");
   }
}
