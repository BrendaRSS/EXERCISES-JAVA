public class App {
    public static void main(String[] args) throws Exception {
        String[] fruits = {"Manga", "Morango","Uva", "Abacate", "Ameixa", "Maçã", "Pêra", "Mamão", "Figo"};
        String[] fruits2 = {"Banana", "Cajú", "Abacate", "Amora", "Goiaba", "Ameixa", "Graviola", "Maçã", "Jambo", "Pêra", "Mamão", "Figo", "Uva"};

        repeatedWords(fruits, fruits2);
    }

    public static void repeatedWords(String[] array1, String[] array2){
        System.out.println(" ");
        System.out.println("Elementos repetidos: ");
        System.out.println(" ");
        
        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array2.length; j++){
                if(array1[i].equals(array2[j])){
                    System.out.println(array1[i]);
                }
            }
        }
    }
}
