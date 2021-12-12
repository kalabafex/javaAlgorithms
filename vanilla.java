public class vanilla {
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        int iarr[]=new int[100];
        int counter=0;
        boolean vanilla =true;
        for (int i = 0; i < arr.length; i++) {
            while(arr[i]>0){
                if(arr[i]>10){
                    iarr[counter]=arr[i]%10;
                    counter++;
                    arr[i]/=10;
                }
                else{
                    iarr[counter]=arr[i]%10;
                    arr[i]/=10;
                }
            }
        }
        for (int i = 0; i <=counter; i++) {
            for (int j = 0; j <=counter; j++) {
                if(iarr[i]!=iarr[j]){
                  vanilla=false;
                  break;
                }
            }
        }
        if(vanilla){
            System.out.println("vanilla");
        }
        else{
            System.out.println("not vanilla");

        }
    }
}
