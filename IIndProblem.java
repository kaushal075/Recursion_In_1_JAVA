package ShortingInArray;

public class IIndProblem {
    static void sortingString(String []arr){
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j].compareTo(arr[minIndex])<0){
                    minIndex=j;
                }
            }
            String temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }

    }
    public static void main(String[] args) {
        String []arr={"kiwii","papaya","apple","banana","kiwi","mango"};
        System.out.println("Your EndTerm_Examinaton.Array After Sorting :");
        sortingString(arr);
        for(String i: arr){
            System.out.print(i+" ");
        }
    }
}
