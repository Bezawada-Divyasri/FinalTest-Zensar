package zensartest;

import java.util.Scanner;

public class VowelsinString {
public static void main(String args[]) {
	System.out.println("Enter the string");
	Scanner sc=new Scanner(System.in);
	String str = sc.next();
    for(int i=0; i<str.length(); i++) {
      if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| 
          str.charAt(i) == 'i' || str.charAt(i) == 'o' || 
          str.charAt(i) == 'u')
        
        System.out.println("Given string contains " + 
            str.charAt(i)+" at the index " + i);
    }
  }
}

