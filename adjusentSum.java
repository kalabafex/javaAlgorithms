public class adjusentSum {
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        int max=arr[0]+arr[1];
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]+arr[i+1]>max){
            max=arr[i]+arr[i+1];
            }
        }
        System.out.println("adjacent sum is "+max);
    }
    
}
