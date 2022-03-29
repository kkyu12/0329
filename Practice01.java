package Mar29th;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a1 = 'a';
		byte a2 = 'A';
		System.out.println(a1);
		System.out.println(a2);
		System.out.println();

		a1 = 'b';
		System.out.println(a1);
		a1 = 'z';
		System.out.println(a1);

		int num = 65;
		System.out.println((char) num);

		byte a3 = 65;
		for (int i = a3; i < a3 + 26; i++) {
			System.out.print((char)i + " ");
		}
	}

}
