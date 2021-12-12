public class depth {   
  public static void main (String args[]){
        
        numGenerator gen=new numGenerator();
        int num=gen.generate();
        int n=num;
        int count=0;
        int numCount=1;
        int arr[]=new int [10];
        while(count<10){ 
        while(n>0){
            if(n>10){
            int drop=n%10;
            if(isFound(drop,arr)){
                arr[count]=drop;
                count++;
            }
        }
        else{
            if(isFound(n,arr)){
                arr[count]=n;
                count++;
            } 
        }
            n=n/10;
        }
      
        n=num*numCount;
        numCount++;
     }
     System.out.println("count is "+numCount);

    }

    static boolean isFound(int n,int arr[]){
         for (int i = 0; i < arr.length; i++) {  
             if(arr[i]==n){
                 return false;
             }
         }
         return true;
    }
}

