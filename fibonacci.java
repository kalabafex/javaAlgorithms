public class fibonacci {
    public static void main (String args[]){
        numGenerator generator=new numGenerator();
        int n=generator.generate();
        int fab=1;
        int fabb=0;
        int result=0;
        for (int i = 0; i < n; i++) {
            if(result==n){
          
        }
        result=fab+fabb;
        fab=fabb;
        fabb=result;
    }
    }
}
