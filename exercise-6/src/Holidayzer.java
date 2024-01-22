import java.time.LocalDate;

public class Holidayzer {
    private LocalDate date;
    private String nameOfDate;

    public Holidayzer(LocalDate date, String nameOfDate){
        this.date = date;
        this.nameOfDate = nameOfDate;
    }

    public LocalDate getDate(){
        return this.date;
    }

    public String getNameOfDate(){
        return this.nameOfDate;
    }

}
