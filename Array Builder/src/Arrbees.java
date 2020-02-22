import java.util.Scanner;

public class Arrbees {

	public static void main(String[] args) {
		
		//System.out.println("");
		getArbees();

	}

	private static void getArbees() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How big do you want your array?");
		
		int size = scanner.nextInt();
		
		System.out.println("What range do you want? 0 - ?");
		
		int range = scanner.nextInt() ;

		String arbee ="int[] arr = {";
		
		for(int i = 0; i<size; i++ ) {
			
			
			if(i == size-1) {
				arbee += (int) (Math.random()*(range+1));
			}else {
				arbee += (int) (Math.random()*(range+1)) + ", ";
			}
			
		}
		
		arbee += "};";
		System.out.println(arbee);
		int[] arr = {8, 3, 8, 5, 0, 9, 6, 5, 3, 0, 9, 5, 10, 8, 3, 5, 0, 7, 2, 9, 3, 3, 4, 6, 3, 1, 0, 10, 8, 9, 4, 6, 2, 2, 6, 8, 1, 10, 0, 1, 4, 1, 3, 9, 2, 7, 8, 7, 1, 8, 0, 5, 5, 7, 3, 4, 10, 6, 0, 0, 6, 0, 4, 10, 6, 6, 9, 2, 0, 4, 9, 6, 8, 2, 6, 7, 3, 8, 7, 3, 8, 9, 6, 2, 5, 8, 6, 0, 0, 6, 1, 3, 6, 2, 10, 6, 7, 7, 8, 0};

	}

}
