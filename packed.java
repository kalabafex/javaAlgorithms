public class packed {
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        boolean packed=true;
        int pastNum=0;
        for (int i = 0; i < 2; i++) {
            for (int j = pastNum; j < arr[i]+pastNum; j++) {
                if(arr[j]!=arr[i]){
                    packed=false;
                }
                pastNum=arr[i]-1;
            }
        }
        if(packed){
            System.out.println("packed");
        }
        else{
            System.out.println("not packed");

        }
    }
}
