public class zeroPlentifull {
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        int pCounter=0;
        for (int i = 0; i < arr.length-3; i++) {
            if(i<arr.length-3 && (arr[i]==0 && arr[i+1]==0) && (arr[i+2]==0 && arr[i+3]==0)){
            pCounter++;
            }
        }
        System.out.println(pCounter);
    }
}
