public class nUnique {
    public static void main (String args[]){
    arrayGenerator generator=new arrayGenerator();
    int arr[]=generator.generate();
    numGenerator gen=new numGenerator();
    int num=gen.generate();
    boolean unique=true;
    for (int i = 0; i < arr.length; i++) {
        int count=0;
        for (int j = 0; j < arr.length; j++) {

            if(arr[i]+arr[j]==num){
              count++;
            }
        }
        if(count>1){
            unique=false;
            break;
        }
    }
    if(unique){
        System.out.println("Unique");   
    }
    else{
        System.out.println("not unique");   

    }
    }
}
