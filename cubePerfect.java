public class cubePerfect {
    public static void main (String args[]){
        arrayGenerator generator=new arrayGenerator();
        int arr[]=generator.generate();
        boolean perfectCube=true;
        for (int i = 0; i < arr.length && perfectCube ; i++) {
            if(!cube(arr[i])){
                perfectCube=false;
            }
        }
      if(perfectCube){
          System.out.println("cube perfect");
      }
      else{
        System.out.println("not cube perfect");

      }
    }
    static boolean cube(int n){
        if(n>0){
            for (int j = 1 ; j <= n; j++) {
            if(j*j*j==n){
              return true;  
            } 
            
            }
            return false;
        }
        if(n<0){
            for (int j = -1 ; j >= n; j--) {
            if(j*j*j==n){
              return true;  
            } 
            
            }
            return false;
        }
      return true;
    }
}
