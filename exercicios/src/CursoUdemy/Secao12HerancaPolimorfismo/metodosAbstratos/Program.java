package Secao12HerancaPolimorfismo.metodosAbstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of shapes:");
        List<Shape> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++) {
            System.out.println("Shape #" + i);
            System.out.println("Rectangle or Circle (r/c):");
            char ch = sc.next().charAt(0);
            System.out.println("Color: BLACK, BLUE OR RED:");
            Color color = Color.valueOf(sc.next().toUpperCase());
            switch (ch) {
                case 'r':
                    System.out.println("Enter rectangle height:");
                    double height = sc.nextDouble();
                    System.out.println("Enter rectangle width:");
                    double width = sc.nextDouble();
                    Rectangle r = new Rectangle(color , height , width);
                    list.add(r);
                    break;
                case 'c':
                    System.out.println("Enter circle radius:");
                    double radius = sc.nextDouble();
                    Circle c = new Circle(color , radius);
                    list.add(c);
                    break;
                default:
                    System.out.println("not found");

            }

        }
        System.out.println("Shape areas:");
        for (Shape shape : list) {
            System.out.println(shape.area());
        }
    }


}
