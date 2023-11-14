// Selection Sort in Java
// We can create a java program to sort array elements using selection sort. In selection sort algorithm, we search for the lowest element and arrange it to the proper location. We swap the current element with the next lowest number.

// selection sort
// How does selection sort work?
// The selection sort algorithm works in a very simple way. It maintains two subarray for the given array.

// The subarray is already sorted.
// And the second subarray is unsorted.
// With every iteration of selection sort, an element is picked from the unsorted subarray and moved to the sorted subarray.

// arr[] = 25 35 45 12 65 10  
  
// // Find the minimum element in arr[0...5] and place it at beginning.  
  
// 10 25 35 45 12 65   
  
// // Find the minimum element in arr[1...5] and place it at beginning of arr[1...5]  
  
// 10 12 25 35 45 65   
  
// // Find the minimum element in arr[2...5] and place it at beginning of arr[2...5]  
// No, you can see that the array is already sorted.   
  
// 10 12 25 35 45 65   
// Time Complexity
// Best: ?(n^2)
// Average: ?(n^2)
// Worst: O(n^2)
// Space Complexity
// O(1)


public class SelectionSort {  
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
       
    public static void main(String a[]){  
        int[] arr1 = {9,14,3,2,43,11,58,22};  
        System.out.println("Before Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr1);//sorting array using selection sort  
         
        System.out.println("After Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
    }  
}  
