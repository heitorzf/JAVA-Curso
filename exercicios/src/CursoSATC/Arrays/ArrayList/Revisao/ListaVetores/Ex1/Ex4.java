package Arrays.ArrayList.Revisao.ListaVetores.Ex1;

import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        int[] original = new int[100];
        int pares = 0;
        Random random = new Random();
        for (int i = 0 ; i < original.length ; i++){
            original[i] = random.nextInt(3000);
            if (original[i] % 2 == 0) {
                pares += 1;
        }
            for (int vect : original) {
                System.out.println(vect);

            }
            System.out.println(pares);

        }
    }
}
