public class bean {
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        boolean nine=false;
        boolean seven=false;
        boolean thirteen=false;
        boolean sixteen=false;
        boolean bean=true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==9){
                nine=true;
            }
            if(arr[i]==7){
                seven=true;
            }
            if(arr[i]==13){
                thirteen=true;
            }
            if(arr[i]==16){
                sixteen=true;
            }
        }
        if(nine){
            if(thirteen){
                bean=true;
            }
            else{
                bean=false;
            }
        }
        if(seven){
            if(!sixteen){
                bean=true;
            }
            else{
                bean=false;
            }
        }
        if(bean){
            System.out.println("bean");
        }
        else{
            System.out.println("not bean");
        }

    }
}
