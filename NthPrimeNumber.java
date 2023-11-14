// nth Prime Number Java
// A number is prime if it is divisible by 1 and itself. In other words, a prime number is a natural number with exactly two distinct natural number divisors 1 and itself. For example, 2, 3, 5, 7, 11, etc. are the prime numbers. Note that 0 and 1 are not prime numbers. The number 2 is the only even prime number because all the other even numbers are divisible by 2. In this section, we will learn how to find the nth prime number in Java.

// There are two ways to find the nth prime number in Java:

// Using Basic/ traditional Approach
// Using Sieve of Eratosthenes Approach
// Using Basic/ traditional Approach
// In the basic approach, we follow the same approach that we have used to find the prime number. Follow the steps given below.

// Read an integer (n) from the user.
// In the while loop, execute the condition (c!=n). Initially, the variable c is 0 and counts the discovered prime numbers.
// Increment the variable i (initially 1) by 1 for the next number check.
// Check if the variable i is prime or not.
// If yes, increment the variable c by 1.
// Let's find the nth prime number through a Java program using a while loop.


import java.util.Scanner;  
public class NthPrimeNumber   
{  
public static void main(String[] args)   
{  
//constructor of the Scanner class  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the value of n to compute the nth prime number: ");  
//reading an integer from the user  
int n = sc.nextInt();   
int num=1, count=0, i;  
while (count < n)  
{  
num=num+1;  
for (i = 2; i <= num; i++)  
{   
//determines the modulo and compare it with 0   
if (num % i == 0)   
{  
//breaks the loop if the above condition returns true  
break;  
}  
}  
if (i == num)  
{  
//increments the count variable by 1 if the number is prime  
count = count+1;  
}  
}  
//prints the nth prime number  
System.out.println("The " +n +"th prime number is: " + num);  
}  
}  