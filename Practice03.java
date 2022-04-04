package Mar29th;

public class Practice03 {
	final static String[] CHO = { "ㄱ", "ㄲ", "ㄴ", "ㄷ", "ㄸ", "ㄹ", "ㅁ", "ㅂ", "ㅃ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅉ", "ㅊ", "ㅋ", "ㅌ",
			"ㅍ", "ㅎ" };
	final static String[] JUNG = { "ㅏ", "ㅐ", "ㅑ", "ㅒ", "ㅓ", "ㅔ", "ㅕ", "ㅖ", "ㅗ", "ㅘ", "ㅙ", "ㅚ", "ㅛ", "ㅜ", "ㅝ", "ㅞ", "ㅟ",
			"ㅠ", "ㅡ", "ㅢ", "ㅣ" };
	final static String[] JONG = { "", "ㄱ", "ㄲ", "ㄳ", "ㄴ", "ㄵ", "ㄶ", "ㄷ", "ㄹ", "ㄺ", "ㄻ", "ㄼ", "ㄽ", "ㄾ", "ㄿ", "ㅀ", "ㅁ",
			"ㅂ", "	ㅄ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String han = "안녕하세요";

		for (int i = 0; i < han.length(); i++) {
			char uniVal = han.charAt(i);
			char cho = (char) ((uniVal - 0xAC00) / 28 / 21);
			char jung = (char) ((uniVal - 0xAC00) / 28 % 21);
			char jong = (char) ((uniVal - 0xAC00) % 28); 
			System.out.print(CHO[cho] + JUNG[jung] + JONG[jong]);
		}

	}

}
