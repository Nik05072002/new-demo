public class binarytohexadecimal
{  
//function to convert binary to decimal  
int binaryToDecimal(long binary)  
{  
//variable to store the converted binary number  
int decimalNumber = 0, i = 0;  
//extracting digits of the binary number  
while (binary > 0)   
{  
//extracting the digits by getting remainder on dividing by 10 and multiplying by increasing integral powers of 2  
decimalNumber += Math.pow(2, i++) * (binary % 10);  
//removes the last digit of the binary number  
binary = binary/10;  
}  
//returns the decimal number  
return decimalNumber;  
}  
//function to convert decimal to hexadecimal  
String decimalToHex(long binary)  
{  
//function calling and storing the decimal number in the variable decimalNumber   
int decimalNumber = binaryToDecimal(binary);  
//converting the integer to the corresponding hexadecimal number  
String hexNumber= Integer.toHexString(decimalNumber);  
//converting the string to uppercase   
hexNumber = hexNumber.toUpperCase();  
//returning the final hex string  
return hexNumber;  
}  
//driver Code  
public static void main(String[] args)  
{  
//instantiating the class  
binarytohexadecimal ob = new binarytohexadecimal ();  
//number to convert into hexadecimal number  
long num = 1100110011;  
//function calling and printing the output of decimalToHex() method  
System.out.println("Binary Number: " +num);  
System.out.println("Hexadecimal Number: "+ob.decimalToHex(10011110));  
}  
}  