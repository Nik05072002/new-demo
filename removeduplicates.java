import java.util.*;

public class removeduplicates {

    public static void main (String[]args)
    {
        System.out.println("Java program to remove duplicate character");
        Scanner sc = new Scanner (System.in);
        System.out.println ("Please enter a String");
        String str = sc.nextLine(); 
        char[] ch = str.toCharArray(); 
        int len = str.length();
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len;j++){
                if(ch[i] == ch[j]){
                for(int k=j; k<len-1; k++){
                    ch[k] = ch[k+1];
                }
                len--;
                j--;
            }
        }
    }
    System.out.println("After removing duplicate character");
    for(int i=0;i<len;i++){  
        System.out.print(ch[i]);  
    } 
    }
}
    

