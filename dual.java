public class dual {
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        boolean dual=true;
        for (int i = 0; i < arr.length; i++) {
            int count=0;
          for (int j = 0; j < arr.length; j++) {
              if(arr[i]==arr[j]){
                  count++;
              }
          }
          if(count!=2){
              dual=false;
          }
        }
        if(dual){
            System.out.println("Dual");
        }
        else{
            System.out.println("Not Dual");
        }
    }
}
