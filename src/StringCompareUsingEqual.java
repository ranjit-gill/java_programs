/*compares this string to the specified object. 
 * The result is true if and only if the argument is not null and is a String object that represents the same sequence of characters as this object.
 */

public class StringCompareUsingEqual {
	
	public static void main(String args[]) {
		
		 String s1 = "Happy New Year 2019";
	     String s2 = "Happy New Year 2019";
	     String s3 = new String ("Happy NEW YeaR 2019");
	     System.out.println(s1.equals(s2));
	     System.out.println(s2.equals(s3));
	}

}
