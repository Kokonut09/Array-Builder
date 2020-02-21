
public class Arrbees {

	public static void main(String[] args) {
		
		//System.out.println("");
		getArbees();

	}

	private static void getArbees() {
		
		String arbee ="int[] arr = {";
		int L = 5;
		
		for(int i = 0; i<L; i++ ) {
			
			if(i == L-1) {
				arbee += i;
			}else {
				arbee += i + ", ";
			}
			
		}
		
		arbee += "};";
		System.out.println(arbee);
		
	}

}
