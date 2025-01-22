import java.util.Scanner;

public class UserInput 
{
    //method to printout the operations
    public int getOperationChoice()
    {
        System.out.println("\nSelect an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Fibonacci Sequence");
        System.out.println("6. Mean of Array");
        System.out.println("7. Mode of Array");
        System.out.println("0. Exit");
        
        return getIntInput("Enter your choice: ");

    }    

    Scanner sc = new Scanner(System.in);

    public int getIntInput(String prompt){
        System.out.print(prompt);
        return sc.nextInt();
    }

    public double getDoubleInput(String prompt){
        System.out.print(prompt);
        return sc.nextDouble();
    }

    public double[] getArrayInput()
    {
        System.out.print("Enter the size of the array: ");

        int size = sc.nextInt();
        double[] arr = new double[size];
        for (int i = 0; i < size; i++){
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextDouble();
        }
        
        return arr;
    }
}
