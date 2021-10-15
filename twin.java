public class twin {
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        boolean nice=false;
        for (int i = 0; i < arr.length; i++) {
            if(isPrime(arr[i])){
            for (int j = 0; j < arr.length; j++) {
               
                if(isPrime(arr[j])){
                    if(arr[i]-arr[j]==2 || arr[i]-arr[j]==-2){

                    
                    nice=true;
                    } 
                }
            }
            }
        }
        if(nice){
            System.out.println("Nice");
        }
        else{
            System.out.println("not nice");
        }
    }
   
    static boolean isPrime(int n){
        for(int i=2; i<n; i++)
        if(n%i==0){
        return false;
        }
        return true;
        }
}
