package ShortingInArray;

public class BubbleShort {
    static void bubbleSort(int []arr){
        for(int i=0;i<arr.length-1;i++){
            boolean flag=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if (!flag) {
                return;
            }

        }
    }static void decendingSorting(int []arr){
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]<arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    }
    static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int []arr={2,4,8,3,1,7,5,0,-10,-2,-5};
        bubbleSort(arr);
        System.out.println("Your Sorted EndTerm_Examinaton.Array In Ascending Order");
        printArray(arr);
        System.out.println("Your Sorted EndTerm_Examinaton.Array In Descending Order");
        decendingSorting(arr);
        printArray(arr);
    }
}
