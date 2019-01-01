
/* Program to compares two strings by using str compareTo (string), str compareToIgnoreCase(String) 
 * and str compareTo(object string) of string class 
 * and returns the ascii difference of first odd characters of compared strings.*/

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "Hello World";
		String string2 = "hello world";
		Object object1  = string1;
		
		System.out.println(string1.compareTo(string2));
		System.out.println(string1.compareToIgnoreCase(string2));
		System.out.println(string1.compareTo(object1.toString()));
	}

}
