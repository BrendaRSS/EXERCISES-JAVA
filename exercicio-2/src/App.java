import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int number = random.nextInt(101);
        System.out.println(number);

        fibonacci(number);
    }

    public static void fibonacci(int x){
        long firstTerm = 0;
        long secondTerm = 1;
        ArrayList<Long> fibonacciSequence= new ArrayList<>();

        System.out.println("Sequência Fibonacci para o número " + x + " : ");
        System.out.println(" ");

        for(int i=0; i<x; i++){
            fibonacciSequence.add(firstTerm);

           long nextTerm = firstTerm + secondTerm;
           firstTerm = secondTerm;
           secondTerm = nextTerm;

        }

        for(int i=0; i<fibonacciSequence.size(); i++){
            System.out.print(fibonacciSequence.get(i)+" ");
        }
    }
}
