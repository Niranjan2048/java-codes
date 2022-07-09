import java.util.Scanner;
import java.util.Arrays; 
public class Mango
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] input_array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<10; i++)
        {
            input_array[i]=sc.nextInt();
        }
        int max = Arrays.stream(input_array).max().getAsInt();
        int min = Arrays.stream(input_array).min().getAsInt();
        if(max<=100 && min>=0)
        {
            int[] processed_array = input_array.clone();
            Arrays.sort(processed_array);
            

            System.out.println("Sorted array ");
            int[] resulted_array = new int[10];
            for(int i=0; i<10; i++)
            {
                System.out.println(processed_array[i]);
            } 
            for(int i=0; i<10; i++)
            {
                resulted_array[i] = input_array[i]-processed_array[i];
            } 
            System.out.println("The difference between the two arrays is: ");
            for(int i=0; i<10; i++)
            {
                System.out.println(resulted_array[i]);
            } 
        }
        else
        {
            System.out.println("Array is Invalid");
        }
    }
}
