public class Palindrome{
    public static boolean isPalindrome(String str){
	str = str.toLowerCase();
	int j = str.length()-1;

	for(int i=0; i<=j; i++, j--)
	    if(str.charAt(i) != str.charAt(j))
		return false;

	return true;
    }

    public static void main(String[] args){
	String s = "bob";

	if(isPalindrome(s))
	    System.out.println("Sim");

	else
	    System.out.println("Não");
    }
}
