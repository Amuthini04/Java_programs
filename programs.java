import java.util.Scanner;

public class programs {
    public static void main(String a[]){
        int fact = 1;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range of factorial");
        int n = input.nextInt();

        for(int i=1 ; i<=n ; i++){
            fact = fact*i;
        }
    System.out.printf("the sum of series is %d",fact);
    input.close();
}

}