public class isolated {
    public static void main (String args[]){
        numGenerator generator=new numGenerator();
        int num=generator.generate();
        int square=num*num;
        int scounter=0;
        int ccounter=0;
        int sarr[]=new int [10];
        int carr[]=new int [10];
        boolean isolated=true; 
        int cube=num*num*num;
        while(square>0){
            if(square>10){
               sarr[scounter]= square%10;
               scounter++;
               square/=10;
            }
            else{
                sarr[scounter]= square;
                square/=10;
            }
           
        }
        while(cube>0){
            if(cube>10){
               carr[ccounter]= cube%10;
               ccounter++;
               cube/=10;
            }
            else{
                carr[ccounter]= cube;
                cube/=10;
            }
           
        }
        for (int i = 0; i <=scounter; i++) {
            for (int j = 0; j <= ccounter; j++) {
                if(sarr[i]==carr[j]){
                    isolated=false;
                }
            }
        }
        if(isolated){
            System.out.println("isolated");
        }
        else{
            System.out.println("not isolated");

        }
    }
}
