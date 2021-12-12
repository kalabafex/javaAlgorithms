public class onionArray {
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        boolean onionArray=true;
        for (int i = 0; i < arr.length/2; i++) {
            if((arr[i]<0 || arr[arr.length-i-1]<0) ||
             
             (arr[i]==arr[arr.length-i-1] || arr[i]+arr[arr.length-i-1]>=10)){
               onionArray=false;
            }
        }
        if(onionArray){
                    
        System.out.println("onion array");
                }
                else{
        System.out.println("not onion array");

                }
    }
}
