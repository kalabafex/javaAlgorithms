public class completeArray {
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        boolean a=false;
        boolean b=false;
        boolean c=false;
        int max=arr[0];
        int min=arr[0];
        int countNums=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
              a=true;  
            }
            for (int j = 0; j < arr.length; j++) {
                if(max<arr[j]){
                max=arr[j];
                }
                if(min>arr[j]){
                min = arr[j];  
            }
        }
        for (int j = min; j < max; j++) {
            if(arr[i]==j){
                countNums++;
            }
        }
    }
    if(max!=min){
       b=true;
       if(max-min==countNums){
           c=true;
       }
    }
    if(a&&b&&c){

        System.out.println("complete array");
    }
   else{
    System.out.println("not complete array");
   }
}
}
