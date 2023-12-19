package ShortingInArray;

public class SelectionSort {
    static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void sortedArray(int []arr){
       for(int i=0;i<arr.length-1;i++){
           int minIndex=i;
//           System.out.println(i);
           for(int j=i+1;j<arr.length;j++) {
//               System.out.println(j);
               if (arr[j] < arr[minIndex]) {
                   minIndex=j;
               }
               int temp = arr[i];
               arr[i] = arr[minIndex];
               arr[minIndex] = temp;
           }
       }

    }
    public static void main(String[] args) {
        int []arr={2,1,-4,5,8,-6,-9};
        System.out.println("Your Sorted EndTerm_Examinaton.Array");
        sortedArray(arr);
        printArray(arr);
    }
}
