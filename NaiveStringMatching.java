import java.util.*;

public class NaiveStringMatching {

	static void match(String str, String substr)
	{
		int n = str.length();
		int m = substr.length();
		int i = 0, j = m - 1;

		for (i = 0, j = m - 1; j < n;) {

			if (substr.equals(str.substring(i, j + 1))) {
				System.out.println("Similar pattern is found at index " + i);
			}
			i++;
			j++;
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		System.out.println("Enter the substring to match: ");
		String substr = sc.nextLine();
	
		match(str, substr);
	}
}
