public class supperArray {
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        int sum=0;
        boolean supper=true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>sum){
                sum+=arr[i];
            }
            else{
              supper=false;  
            }
        }
        if(supper){
            System.out.println("supper");


        }
        else{
            System.out.println("not supper");

        }

    }
}
