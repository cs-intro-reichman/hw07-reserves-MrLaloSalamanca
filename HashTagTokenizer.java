

public class HashTagTokenizer {

	public static void main(String[] args) {

		String hashTag = args[0];
		String []dictionary = readDictionary("dictionary.txt");
		//System.out.println("the word is in the string? " + existInDictionary(hashTag, dictionary));
		breakHashTag(hashTag, dictionary);
	}

	
	public static String[] readDictionary(String fileName) {
		String[] dictionary = new String[3000];
		In in = new In(fileName);
		for (int i = 0; i < dictionary.length; i++){
			dictionary[i] = in.readLine();
		}
		return dictionary;
	}

	public static boolean existInDictionary(String word, String []dictionary) {
		for (int i = 0; i < dictionary.length; i++){
			if (dictionary[i].equals(word)){
				return true;
			}
		}
		return false;
	}

	public static void breakHashTag(String hashtag, String[] dictionary) {
		// convert the entire hashtag to lowercase
		String lowHash = hashtag.toLowerCase();
		
		int N = lowHash.length();
	
		// if the hastag is empty
        if (lowHash.isEmpty()){
			return;
		}

        for (int i = 1; i <= N; i++) {
			String sub = lowHash.substring(0, i);
			if (existInDictionary(sub, dictionary)) {
				System.out.println(sub);
				breakHashTag(lowHash.substring(i), dictionary);
				break;
			}
		}
	}

}
