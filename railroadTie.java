public class railroadTie {
    
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        boolean a=false;
        boolean b=true;
        boolean c=true;

        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i]!=0){
                a=true;
            }
            if(i!=0 && i!=arr.length-1){
            if(arr[i]!=0 && (arr[i-1]==0 && arr[i+1]==0)){
                b=false;
            }
            if(arr[i]==0 && (arr[i+1]==0 && arr[i+2]==0)){
                c=false;
            }
            }
            if(i==0){
                if(arr[i]!=0 &&  arr[i+1]==0){
                    b=false;
                }
                if(arr[i]==0){
                    c=false;
                }
            }
            if(i==arr.length-1){
                if(arr[i]!=0 &&  arr[i-1]==0){
                    b=false;
                }
                if(arr[i]==0){
                    c=false;
                }
            }
             
           
        }
        if(a&&b&&c){
            System.out.println("railroad");
        }
        else{
            System.out.println("not railroad"+a+b+c);
        }
    }
}
