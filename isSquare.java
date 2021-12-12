public class isSquare {
    public static void main (String args[]){
        numGenerator generator=new numGenerator();
        int num=generator.generate();
        boolean square=false;
        for (int i = num; i > 0 ; i--) {
            if(i*i==num){
                square=true;
                break;
            }
        }
        if(square){
            System.out.println("square");
        } 
        else{
            System.out.println("not square");
        }  
    }
}
