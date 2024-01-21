import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int number = random.nextInt();

        if(number%2== 0){
            if(number >= 0){
                System.out.println(number + " " + "é par e positivo");
            } else {
                System.out.println(number + " " + "é par e negativo");
            }
        }  else {
            if(number >= 0){
                System.out.println(number + " " + "é ímpar e positivo");
            } else {
                System.out.println(number + " " + "é ímpar e negativo");
            }
        }
    }
}
