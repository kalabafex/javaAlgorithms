public class bunker {
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        boolean bunker=false;
        for (int i = 0; i < arr.length; i++) {
            if(i!=arr.length-1){
            if(arr[i]%2!=0 && isPrime(arr[i+1]))
            {
               bunker=true;
            }
            }
        }
        if(bunker){
            System.out.println("bunker");
        }
        else{
            System.out.println("not bunker");
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
