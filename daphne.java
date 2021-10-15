public class daphne {
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        boolean odd=false;
        boolean three=true;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]%2!=0){
             odd=true;
             break;
           }
        }
        for (int j = 0; j < 3; j++) {
          if(arr[j]%2!=0 && arr[arr.length-j]%2!=0){
                 three=false;
                 break;
          }       
        }
        if(three && odd){
            System.out.println("daphne");
        }
        else{
            System.out.println("not daphne");
        }
    }
}
