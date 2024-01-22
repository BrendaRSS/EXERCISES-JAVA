import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int number = random.nextInt(21);

        multiplicationTable(number);
    }

    public static void multiplicationTable(int x){
        System.out.println("Tabela de multiplicação por " + x + " : ");

        for(int i=1; i<= 10; i++){
            System.out.println(x + " x " + i + " = " + (x*i));
        }
    }
}
