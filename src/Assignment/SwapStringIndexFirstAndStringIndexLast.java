package Assignment;

class SwapStringIndexFirstAndStringIndexLast {
	public static void main(String[] args) {
		SwapStringIndexFirstAndStringIndexLast ss = new SwapStringIndexFirstAndStringIndexLast();
		System.out.println(ss.swapStringWithoutInbuiltMethod("Welcome to Test Yantra"));
	}

	public String swapStringWithoutInbuiltMethod(String sentence) {
		//goal is to identify last word and first word
		int[] firstWordIndexes = geFirstWordStartAndEndIndexesForGivenString(sentence); 
		int[] lastWordIndexes = geLastWordStartAndEndIndexesForGivenString(sentence); 
		String result = "";
		result = sentence.substring(lastWordIndexes[0], lastWordIndexes[1] + 1) + " " +  sentence.substring(firstWordIndexes[1] + 2, lastWordIndexes[0] - 1) + 
				 " " + sentence.substring(firstWordIndexes[0], firstWordIndexes[1] + 1);
		return result;
	}

	private int[] geFirstWordStartAndEndIndexesForGivenString(String sentence) {
		int[] result = new int[2];
		result[0] = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == ' ') {
				result[1] = i - 1;
				return result;
			}
		}
		return result;
	}

	private int[] geLastWordStartAndEndIndexesForGivenString(String sentence) {
		int[] result = new int[2];
		result[1] = sentence.length() - 1;
		for (int i = sentence.length() - 1; i >= 0; i--) {
			if (sentence.charAt(i) == ' ') {
				 result[0] = i + 1;
				 return result;
			}
		}
		return result;
	}
}