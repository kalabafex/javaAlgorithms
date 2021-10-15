import java.util.Scanner;

public class arrayGenerator {
    public int[] generate(){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter length of the array");
    int num=sc.nextInt();
    int arr[]=new int [num]; 
    
    for(int i=0;i<num;i++){
        Scanner s= new Scanner(System.in);
        System.out.println("enter " +(i+1)+ " th "+ " number");
        arr[i]=s.nextInt();
    
    }
    return arr;
}
}
