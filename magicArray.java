import java.util.Arrays;
import java.util.Scanner;
public class magicArray extends arrayGenerator {
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        
       // System.out.println(Arrays.toString(arr));
       int sum=0;
      
       for(int j=0;j<arr.length;j++){
        int count=0;
        for(int k=2;k<arr[j];k++){
            
            if(arr[j]%k==0){
                count++;
               
            }
           
        }
        if(count==0){
            sum+=arr[j];
        }

       }
       if(sum==arr[0]){
        System.out.println("magic array");
       }
       else{
       System.out.println("not magic array");
       }
    }

}
