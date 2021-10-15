public class centered {
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        boolean centered=true;
        for (int i = 0; i < arr.length; i++) {
            if(arr.length%2==0 || arr[arr.length/2]>arr[i]){
                centered=false;
            }
            
        }
        if(centered){
            System.out.println("centered");
        }
        else{
            System.out.println("not centered");
        }
            }
    }