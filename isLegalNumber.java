public class isLegalNumber {
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        numGenerator gen=new numGenerator();
        int num=gen.generate();
        boolean isIllegal=false;
        double number=0;
        int reverse=arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>num-1){
             isIllegal=true;
             break;
            }
            reverse--;
            number+=arr[i]*square(num,reverse);
            System.out.println(square(num,reverse));
        }
        if(isIllegal)
{
    System.out.println("Number is illegal 0");
}
         else{
             System.out.println("Number is legal "+ number);
         }
}
static int square(int n,int ex){
    int num=1;
    if(ex==0){
        return 1;
    }
    for(int i=0; i<ex; i++){
     num*=n;
    }
    return num;
}
}
