public class normal {
    public static void main (String args[]){
        numGenerator generator=new numGenerator();
        int n=generator.generate();
        boolean normal=false;
        for (int i = 2; i < n && !normal; i++) {
            if(n%2==0){
              normal=true;
            }
        }
        if(normal){
            System.out.println("normal");
        }
        else{
            System.out.println("not normal");

        }
    }
}
