public class sumSafe {
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        int sum=0;
        boolean sumSafe=true;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==sum){
                sumSafe=false;
            }
        }
        if(sumSafe){
            System.out.println("sum safe");
        }
        else{
            System.out.println("not sum safe");

        }
    }
}
