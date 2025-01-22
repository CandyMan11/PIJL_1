import java.util.Arrays;

public class Calculator 
{
    //method to add two numbers
    public double add(double a, double b){
        return a + b;
    }

    //method to subtract two numbers
    public double subtract(double a, double b){
        return a - b;
    }

    //method to multiply two numbers
    public double multiply(double a, double b){
        return a * b;
    }

    //method to add divide two numbers
    public double divide(double a, double b){
        if (b == 0){
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        return a / b;
    }

    //method to print out the fibonacci series
    public String fibonacci(int n)
    {
        if (n <= 0){
            return "Invalid input.\n Please enter a positive integer...";
        }
        
        StringBuilder result = new StringBuilder("0");
        
        int a = 0, b = 1;
        for (int i = 1; i < n; i++)
        {
            result.append(", ").append(b);
            int next = a + b;
            a = b;
            b = next;
        }

        return result.toString();
    }

    //method to calculate the mean of an array
    public double mean(double array[])
    {
        double sum = 0;
        for (double num : array){
            sum += num;
        }
        return sum / array.length;
    }

    //method to calculate the mode of of an array
    public double mode(double array[])
    {
        Arrays.sort(array);
        double mode = array[0];

        int maxCount = 1;   //maxcount of element
        int count = 1;  //count of element
        for(int i = 0; i < array.length - 1; i++)
        {
            if(array[i] == array[i + 1]){
                count++;
            } 
            
            if(count > maxCount)
            {
                maxCount = count;
                mode = array[i];
                count = 1;
            }
        }

        //check frequency of the last element
        if(count > maxCount){
            mode = array[array.length - 1];
        }

        return mode;
    }
}