import java.util.Scanner;
//a
public class Questao05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite A: ");
		int A = Integer.parseInt(scanner.nextLine());
		System.out.print("Digite B: ");
		int B = Integer.parseInt(scanner.nextLine());
	
		if(A>10 || A+B==20) {
			System.out.println("número válido");
		} else {
			System.out.println("número não válido");
		}
		
		scanner.close();

	}
	
}
