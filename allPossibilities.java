public class allPossibilities {
    
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==arr[j]){
                    count++;
                }
            }
        }
        if(count==arr.length){
            System.out.println("all");
        }
        else{
            System.out.println("not all");
        }
    }
}
