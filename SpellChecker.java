
public class SpellChecker {


	public static void main(String[] args) {
		String word1 = args[0];
		int threshold = Integer.parseInt(args[1]);
		String[] dictionary = readDictionary("dictionary.txt");
		String correction = spellChecker(word, threshold, dictionary);
		System.out.println(correction);
		
	}

	public static String tail(String str) {
		String tail = "";
		for (int i = 1; i < str.length(); i++) {
		tail += str.charAt(i);
		}
		return tail;

	}

	public static int levenshtein(String word1, String word2) {
		String low1 = word1.toLowerCase();
		String low2 = word2.toLowerCase();

		if (low2.length() == 0)  
			return low1.length();

		if (low1.length() == 0)  
			return low2.length();
		
		if (low1.charAt(0) == low2.charAt(o)) {
			return (levenshtein(tail(low1),tail(low2)));

		} else {
			return 1 + (math.min(levenshtein(tail(low1),low2)),math.min((levenshtein(tail(low2),low1)),levenshtein(tail(low1),tail(low2))))
		}
	}

	public static String[] readDictionary(String fileName) {
		String[] dictionary = new String[3000];

		In in = new In(fileName);

		// Your code here

		return dictionary;
	}

	public static String spellChecker(String word, int threshold, String[] dictionary) {
		int minT = 100;
		for (int i = 0; i < dictionary.length; i++)
		if (levenshtein( dictionary[i], word )<= threshold && levenshtein( dictionary[i], word ) < minT ){
			String checked = dictionary[i];
			minT = (levenshtein( dictionary[i], word)
		}
		return checked;
	}

}
