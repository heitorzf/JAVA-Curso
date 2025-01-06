import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//fiz varios testes com esse codigo com  nextInt, nextDouble, e etc
		Scanner sc = new Scanner(System.in);
		String s, x , y ,z;
		int w;
		
		w = sc.nextInt();
		s = sc.nextLine();
		x = sc.nextLine();
		y = sc.nextLine();
		z = sc.nextLine();
		System.out.printf("%d\n%s\n%s\n%s",w , x , y ,z);
		
		sc.close();
	}

}
