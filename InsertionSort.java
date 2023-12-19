package ShortingInArray;

public class InsertionSort {
    static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void sortedArray(int []arr){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 &&arr[j]<arr[j-1] ){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int []arr={1,3,2,4,6,5,8,0};
        System.out.println("Your Sorted EndTerm_Examination.Array");
        sortedArray(arr);
        printArray(arr);
    }
}
