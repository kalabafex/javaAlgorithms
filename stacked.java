public class stacked {
    
  public static void main (String args[]){ 
    numGenerator gen=new numGenerator();
    int num=gen.generate();
    int sum=0;
    for (int i = 1; i < num; i++) {
        sum+=i;
        if(sum==num){
            break;
        }
    }
    if(sum==num){
        System.out.println("stacked");
    }
    else{
        System.out.println("not stacked");
    }
  }
}
