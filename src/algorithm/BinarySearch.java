package algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int search = 13;
        boolean found = false;
        int left=0,right=numbers.length-1,middle = (left+right)/2;
        while (!found){
            if(numbers[middle]==search){
                System.out.println(search+" is at "+middle+" index");
                found=true;
            }
            else if(search>numbers[middle]){
                left = middle;
                middle = (left+right)/2;
            }else if(search<numbers[middle]) {
                right = middle;
                middle = (left+right)/2;
            }
        }
    }
}
