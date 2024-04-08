import java.util.Scanner;

class first_code
{
    public static void main(String a[])
    {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks1");

        int marks1 = input.nextInt();

        System.out.println("Enter marks2");

        int marks2 = input.nextInt();

        int result = marks1+marks2;

        if(result>50){
            System.out.println("Pass,grade-A");
        }

        else{
            System.out.println("fail");
        }
        
        input.close(); 

    }
}
