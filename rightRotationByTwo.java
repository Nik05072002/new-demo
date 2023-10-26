import java.util.*;

public class rightRotationByTwo {

	public static void main(String[] args) {
	    int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Java Program to perform right rotation two times");
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++) {
            System.out.print("Please give value for index "+ i +" : ");
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<2; i++)
        {
            temp=arr[size-1];
            for(int j=size-1; j>0; j--)
            {
                arr[j]=arr[j-1];
		    }
            arr[0]=temp;
        }
        System.out.println("Array after two time right rotation");
        for(int i=0; i<size; i++)

        {
            System.out.print(arr[i]+"\t");
        }
	}
}
    

