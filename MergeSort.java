package ShortingInArray;

public class MergeSort {
    static void displayArray(int [] arr){
        for(int val :arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
    static void merge(int [] arr,int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;
        int [] left=new int[n1];
        int [] right=new int[n2];
        int i,j,k;
        for(i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(j=0;j<n2;j++){
            right[j]=arr[m+1+j];
        }
        i=0;
        j=0;
        k=l;
        while(i<n1 && j<n2){
            if(left[i] < right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }


    }
    static void mergeSort(int [] arr ,int l,int r){
        if(l >= r){
            return;
        }
        int mid =(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    public static void main(String[] args) {
        int [] arr ={7,20,4,11,8,2};
        int n=arr.length;
        System.out.println("My Entered EndTerm_Examinaton.Array Elements :");
        displayArray(arr);
        mergeSort(arr,0,n-1);
        System.out.println("My EndTerm_Examinaton.Array After Sorting :");
        displayArray(arr);
    }
}
