import java.util.*;

public class removeVowels {
 
    public static void main (String[]args){
        ArrayList<Character> arr = new ArrayList<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        System.out.println("Java program to remove Vowel from String");
        Scanner sc = new Scanner (System.in);
        System.out.println ("Please enter a String");
        String str = sc.nextLine(); 
        StringBuffer strBuffer = new StringBuffer();
        for(int i = 0; i < str.length(); i++){
            if(!arr.contains(str.charAt(i))) {  
                strBuffer.append(str.charAt(i));    
            }
        }
        System.out.println("After removing Vowel from String");
        System.out.println(strBuffer);
    }
}   

