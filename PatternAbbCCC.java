// A
// B B
// C C C
// D D D D
// E E E E E

// To accomplish this task, we need to use two loops, the first loop is responsible for printing the line breaks whereas the second loop is responsible for printing the alphabet.

// Algorithm:
// STEP 1: START
// STEP 2: SET n=4.
// STEP 3: SET i=0.
// STEP 4: REPEAT STEP 5 to STEP 7 UNTIL i<=n
// STEP 5: SET j = 0. REPEAT STEP 6 UNTIL j<=i.
// STEP 6: PRINT char(65+i) and SET j=j+1.
// STEP 7: PRINT new line and SET i=i+1.
// STEP 8: END

 public class PatternAbbCCC  
{  
    public static void main(String[] args)  
    {  
        int n = 4;  
        for(int i = 0 ; i <= n ; i++)  
        {  
        for(int j = 0 ; j <= i ; j++)  
        {  
            System.out.print(" "+(char)(65 + i));  
        }  
            System.out.println("");  
        }  
    }  
}  