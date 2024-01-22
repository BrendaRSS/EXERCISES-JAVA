import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Calendar calendar = new Calendar();

        calendar.addHolidayzer(new Holidayzer(LocalDate.of(2024, 1, 1),"Confraternização Mundial"));
        calendar.addHolidayzer(new Holidayzer(LocalDate.of(2024, 2, 12),"Carnaval"));
        calendar.addHolidayzer(new Holidayzer(LocalDate.of(2024, 2, 13),"Carnaval"));
        calendar.addHolidayzer(new Holidayzer(LocalDate.of(2024, 3, 29),"Sexta-feira Santa"));
        calendar.addHolidayzer(new Holidayzer(LocalDate.of(2024, 4, 21),"Tiradentes"));
        calendar.addHolidayzer(new Holidayzer(LocalDate.of(2024, 5, 1),"Dia do Trabalho"));
        calendar.addHolidayzer(new Holidayzer(LocalDate.of(2024, 5, 30),"Corpus Christi"));
        calendar.addHolidayzer(new Holidayzer(LocalDate.of(2024, 9, 7),"Independência do Brasil"));
        calendar.addHolidayzer(new Holidayzer(LocalDate.of(2024, 10, 12),"Nossa Senhora Aparecida"));
        calendar.addHolidayzer(new Holidayzer(LocalDate.of(2024, 11, 2),"Finados"));
        calendar.addHolidayzer(new Holidayzer(LocalDate.of(2024, 11, 15),"Proclamação da República"));
        calendar.addHolidayzer(new Holidayzer(LocalDate.of(2024, 11, 20),"Dia Nacional de Zumbi e da Consciência Negra"));
        calendar.addHolidayzer(new Holidayzer(LocalDate.of(2024, 12, 25),"Natal"));

        calendar.showHolidays();

        LocalDate dateCompare = LocalDate.of(2024, 3, 29);
        LocalDate dateCompare2 = LocalDate.of(2024, 5, 27);

        System.out.println(" ");
        calendar.compareDate(dateCompare);
        System.out.println(" ");
        calendar.compareDate(dateCompare2);
        
    }
}
