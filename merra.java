public class merra {
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        boolean merra=true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]*2==arr[j]){
                merra=false;
                }
            }
        }
        if(merra){
            System.out.println("Merra");
        }
        else{
            System.out.println("not Merra");
        }
    }
}
