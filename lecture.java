import java.util.Scanner;

public class lecture {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		 int n = 0;
		 
		 System.out.print("entre un nombre ");
		 n = clavier.nextInt();
		 
		 System.out.println("le carre de n est" + (n*n));
	}

}
