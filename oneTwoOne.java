public class oneTwoOne {
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        boolean oneTwoOne=true;
        int index=0;
        boolean ones=false;
        boolean twos=false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=1 && arr[i]!=2){
                oneTwoOne=false;
            }
            
            if(arr[i]==2){
             index=i;
             break;
            }
        }
        for (int i = 0; i < index; i++) {
            if(arr[i]!=1){
                oneTwoOne=false;
            }
        }
        for (int i = index; i < arr.length-index; i++) {
            if(arr[i]!=2){
                oneTwoOne=false;
            }
        }
        for (int i = arr.length-index; i < arr.length; i++) {
            if(arr[i]!=1){
                oneTwoOne=false;
            }
        }
        if(oneTwoOne){
            System.out.println("oneTwoOne");
        }
        else{
            System.out.println("not oneTwoOne");

        }
    }
}
