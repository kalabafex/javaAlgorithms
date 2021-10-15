import java.util.Scanner;

class evens {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        String num=sc.nextLine();
        int number=Integer.parseInt(num);
        if(isEvens(number)){
            System.out.println("evens");
        }
        else{
            System.out.println("not evens");
        }
        ;isEvens(number);
    }

    public static boolean isEvens(int number) {
        
        while(number!=0) {
            int x=number%10;
              if(x%2!=0){
                return false;
              }  
              number=number/10;
            
        }
        return true;
    }
}