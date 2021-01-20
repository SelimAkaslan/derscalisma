import java.util.Arrays;

class Main {
	public static boolean isAnagram(String word1, String word2) {

		String str = "";

		int count = 0;
		for (int i = 0; i < word2.length(); i++) {
			char ch = word2.charAt(i);
			str = Character.toString(ch);
		}
		if (word1.contains(str)) {
			count++;
		}
		if (count == word1.length()) {

			return true;
		} else {
			return false;
		}
	}
}
