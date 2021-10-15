public class factorEqual {
    public static void main (String args[]){
        numGenerator generator=new numGenerator();
        int n=generator.generate();
        int m=generator.generate();
        int countn=0;
        int countm=0;
        for (int i = 1; i <= n; i++) {
          if(n%i==0){
              countn++;
          }
        }
        for (int j = 1; j <= m; j++) {
            if(m%j==0){
                countm++;
            }  
        }
        if(countm==countn){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
