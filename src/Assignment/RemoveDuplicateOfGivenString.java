package Assignment;
import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicateOfGivenString {
	
	public static void main(String[] args) {
		String str="Welcome to Test Yantra";
		char[] arr=str.toCharArray();
		Set<Character> set=new LinkedHashSet<>();
		for(Character c:arr)
		{
			set.add(c);
		}
		System.out.println(set.toString());
		
		
	}

}
