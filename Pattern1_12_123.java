// Java program to print the following pattern on the console
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

// Algorithm:
// STEP 1: START
// STEP 2: SET n=5.
// STEP 3: SET i=0. REPEAT STEP 4 to STEP 8 UNTIL i<=n.
// STEP 4: SET j=0.REPEAT STEP 5 to STEP 6 UNTIL j
// STEP 5: PRINT j+1
// STEP 6: SET j=j+1
// STEP 7: PRINT new line.
// STEP 8: SET i=i+1.
// STEP 9: END



public class Pattern1_12_123 {

        public static void main(String[] args)  
        {  
            int n = 5;  
            for(int i = 0 ; i <= n ; i++)  
            {  
            for(int j = 0 ; j < i ; j++)  
            {  
                System.out.print(j+1);  
            }  
                System.out.println("");  
            }  
        }  
      
    
}
