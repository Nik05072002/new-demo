public class findSecondLargest {
    public static void main(String args[]){

        int[] array = {2,5,8,4,97,88};
        System.out.println(findSecondHighest(array));
    
    }

    private static int findSecondHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
    
        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }
    
        }
        return secondHighest;
    }
    
}
