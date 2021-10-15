public class wave {
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        boolean wave=true;
        for (int i = 0; i < arr.length; i++) {
            if(i!=arr.length-1){
            if((arr[i]%2==0 && arr[i+1]%2==0) || (arr[i]%2!=0 && arr[i+1]%2!=0)){
                wave=false;
            }
        }
        
        }
        if(wave){
            System.out.println("wave Array");
        }
        else{
            System.out.println("not wave array");
        }
    }
}
