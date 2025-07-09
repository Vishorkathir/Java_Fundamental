public class LarAndSmall{
    public static void main(String[] args) {
        
        int arr[] ={10,20,30,40,50};

        for(int i = 0;i<arr.length-1;i++){
            for(int j =i+1 ; j<arr.length;j++){

                if(arr[i]  < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int x:arr){
            System.out.println(x);
        }

     

     int largestvalue = arr[0];
     int largestsecondvalue = arr[1];
     int smallestvalue = arr[4];
     int smallestsecondvalue = arr[3];

    //  for (int i = 0; i < arr.length; i++) {
    //     if(largestvalue < arr[i]){
    //         smallestvalue = largestvalue;
    //         largestvalue = arr[i];
    //     }   
    //  }
     System.out.println(largestvalue + " " + largestsecondvalue);
     System.out.println(smallestvalue + " " + smallestsecondvalue);
     
    }
}