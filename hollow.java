public class hollow {
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        int countZeros=0;
        int num=0;
        boolean hollow=true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                countZeros++;
            }
        }
        if(countZeros>2){
        num=arr.length-countZeros;
        if(num>0){
        for (int i = 0; i < num/2; i++) {
            
            if(arr[i]==0 || arr[i+countZeros+num/2]==0){ 
                hollow=false;    
            }
          
        }
    }

    }
    else{
       hollow=false;
    }

    if(hollow){ 
        System.out.println("hollow");
    }
    else{
        System.out.println("not hollow");
    }
    

}
}
