public class inertial {
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        boolean a=false;
        boolean b=false;
        boolean c=true;
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                a=true;
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
       if(max%2==0){
           b=true;
       }
       for (int i = 0; i < arr.length; i++) {
           if(arr[i]%2!=0 ){
               for (int j = 0; j < arr.length; j++) {
                   if(arr[i]<arr[j] && arr[j]%2==0 && arr[j]!=max){
                       c=false;
                   }
               }
           }
       }
      if(a&&b&&c){
          System.out.println("inertial");
      }
      else{
          System.out.println("not inertial");
      }
    }
}
