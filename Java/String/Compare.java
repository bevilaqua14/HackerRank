import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        int number = sc.nextInt();
        
        ArrayList<String>arr=new ArrayList<String>();
		for(int i = 0; i <= words.length() - number; i++)
            arr.add(words.substring(i, i + number));
        
		Collections.sort(arr);
		System.out.println(arr.get(0));
		System.out.println(arr.get(arr.size()-1));
    }
}
