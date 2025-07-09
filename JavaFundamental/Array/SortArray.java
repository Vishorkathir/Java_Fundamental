public class SortArray{
    public static void main(String[] args){

    int arr[] ={5,4,2,8,3,9};


    for(int i = 0;i<arr.length-1; i++){
        for(int j = i+1 ;j<arr.length;j++){
            if(arr[i] > arr[j]){
               int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
            }
        }
        
    }
    for (int x:arr){
        System.out.println(x);
    }}
}