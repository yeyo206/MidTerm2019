package math.problems;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};
        int diff = getLowestDifference(array1,array1.length);
        System.out.println(diff);
        int diff2 = getLowestDifference(array2,array2.length);
        System.out.println(diff2);

    }
public static int getLowestDifference (int[] arr, int n){
     int diff = Integer.MAX_VALUE;

    for (int i=0; i<n-1; i++)
        for (int j=i+1; j<n; j++)
            if (Math.abs((arr[i] - arr[j]) )< diff)
                diff = Math.abs((arr[i] - arr[j]));
            return diff;

}
}
