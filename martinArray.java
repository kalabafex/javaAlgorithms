public class martinArray {
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        int oneCounter=0;
        int twoCounter=0;
        boolean a=true;
        boolean b=true;
        for (int i = 0; i < arr.length; i++) {
        
            if( i!=arr.length-1 && arr[i]==arr[i+1] ){
                   b=false;
                   break;
             }
            
            if(arr[i]==1){
                oneCounter++;
            }
            if(arr[i]==2){
                twoCounter++;
            }
        }
        if(oneCounter<=twoCounter){
            b=false;
        }
        if(a&&b){
            System.out.println("martin");
        }
        else{
            System.out.println("not martin");

        }
    }
}
