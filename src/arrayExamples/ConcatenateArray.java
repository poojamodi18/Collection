package arrayExamples;

import java.util.Arrays;

//concat 2 array with using arraycopy and without using arraycopy
public class ConcatenateArray {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = {5,6,7};
        int[] ans = new int[array1.length+array2.length];

        System.arraycopy(array1,0,ans,0,array1.length);
        System.arraycopy(array2,0,ans,array1.length,array2.length);

        System.out.println(Arrays.toString(ans));

        int[] sum = new int[array1.length+array2.length];
        int index=0;
        for (int i : array1) {
            sum[index] = i;
            index++;
        }
        for (int i : array2) {
            sum[index] = i;
            index++;
        }
        System.out.println(Arrays.toString(sum));
    }
}
