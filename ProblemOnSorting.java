package ShortingInArray;
public class ProblemOnSorting {
    static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }static void nonZero(int []arr){
        for(int i=0;i<arr.length-1;i++){
            boolean flag=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag){
                return ;
            }
        }
    }
    public static void main(String[] args) {
        int []arr={0,5,0,3,0,4,2};
        int []arr1={0,0,2,0,0,0,0,0};
        System.out.println("Your EndTerm_Examinaton.Array After Sorting :");
        nonZero(arr1);
        printArray(arr1);
    }
}
