package Arrays.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        String[] animais = {"Elefante" , "cao " ,"gato" , "Lontra"  , "Passaro"};
        for (String animal : animais){
            if (animal.length() <= 5) {
                System.out.println(animal);
            }
        }
    }
}
