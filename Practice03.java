package Mar29th;

public class Practice03 {
	final static String[] CHO = { "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
			"��", "��" };
	final static String[] JUNG = { "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
			"��", "��", "��", "��" };
	final static String[] JONG = { "", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
			"��", "	��", "��", "��", "��", "��", "��", "��", "��", "��", "��" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String han = "�ȳ��ϼ���";

		for (int i = 0; i < han.length(); i++) {
			char uniVal = han.charAt(i);
			char cho = (char) ((uniVal - 0xAC00) / 28 / 21);
			char jung = (char) ((uniVal - 0xAC00) / 28 % 21);
			char jong = (char) ((uniVal - 0xAC00) % 28);
			System.out.print(CHO[cho] + JUNG[jung] + JONG[jong]);
		}

	}

}
