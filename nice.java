public class nice {
    
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        int found=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]+1==arr[j] || arr[i]-1==arr[j]){
                    found++;
                }
            }
        }
        if(found==arr.length){
        System.out.println("nice");
        }
        else{
            System.out.println("not nice");
        }
    }

}
