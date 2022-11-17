package array;

public class Assign14 {
	public static void main(String[] args)
	{
	String s="valuemomentum";
	System.out.println(s.substring(6,11));
	//Substring method returns a string which is a substring of the String.
	//It returns the substring from the specified begin index to the specified end index.
	//In this program as begin index is 6 and end index is 11,we get the output as oment.
	// When substring was used before jdk 7 it led to serious memory issues.
	// It worked well for smaller strings but had issues in garbage collection of big strings.

	}
	

}
