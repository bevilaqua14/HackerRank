import java.util.*;

class Solution{
	static String sort(String s){
		char[] a = s.toCharArray();
		Arrays.sort(a);
		return new String(a);
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		System.out.println((sort(a.toLowerCase()).equals(sort(b.toLowerCase())) ? "" : "Not ")+"Anagrams");
	}
}
