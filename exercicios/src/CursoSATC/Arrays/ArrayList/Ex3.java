package Arrays.ArrayList;

public class Ex3 {
    public static void main(String[] args) {
        String[] frutas = {"Maçã", "Uva", "Banana", "Pera", "Kiwi"};
        for (String fruta : frutas) {
            if (fruta.equalsIgnoreCase("Banana")) {
                System.out.println("Banana encontrada.");
            }
        }
    }
}
