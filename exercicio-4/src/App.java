import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int number = random.nextInt(10);

        pyramidNumbers(number);
    }

    public static void pyramidNumbers(int x){
        System.out.println("O número é: " + x);
        System.out.println(" ");

        for(int i=1; i<=x; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println(" ");
        }
        
    }
}
