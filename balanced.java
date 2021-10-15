public class balanced {
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        boolean balanced=true;
        for (int i = 0; i < arr.length; i++) {
            if((i%2==0 && arr[i]%2!=0) || (i%2!=0 && arr[i]==0
            )){
                balanced=false;
             }
        
            }
           if(balanced){
            System.out.println("balanced");
           }
           else{
            System.out.println("not balanced");
           }
    }
}
