package exercise;

public class Assignment11 {
	public static void main(String[] args) {
		int[] array = { 1,2,3,4,5,6,7,8,9,10};
		for(int element : array) {
			for(int count = 1; count<=10; count++) {
				System.out.print((element*count)+", ");
			}
			System.out.println("");
		}
	}
}
