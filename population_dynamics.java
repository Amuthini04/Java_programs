import java.util.Scanner;
class population_dynamics
{
    public static void main(String a[])
    {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the birth rate");
        double B = input.nextDouble();

        System.out.println("Enter the immigration rate");
        double I = input.nextDouble();

        System.out.println("Enter the death rate");
        double D = input.nextDouble();

        System.out.println("Enter the emmigration rate");
        double E = input.nextDouble();

        double result = B+I-D-E;

        System.out.println("The population dynamics is " + result);


    }
}