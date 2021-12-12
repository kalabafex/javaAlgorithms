public class greaterThanSum {
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        int sum=0;
        boolean gts=true;
        for (int i = 0; i < arr.length; i++) {
            if(sum>arr[i]){
               gts=false;
            }
            sum+=arr[i];
        }
        if(gts){
            System.out.println("super");
        }
        else{
            System.out.println("not super");
        }
    }
}
