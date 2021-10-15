public class oddSpaced {
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        if((max-min)%2!=0){
           System.out.println("odd spaced");
        }
        else{
           System.out.println("not odd spaced");

        }

    }
}
