import java.util.Scanner;
class MinMax
{
    public static void main(String[]args)
    {
        int count;
        int max;
        int min;
        int i;
        int[]inputArray=new int[100];
        Scanner a=new Scanner(System.in);
        System.out.print("Enter number of Elements : ");
        count= a.nextInt();
        System.out.println("Enter "+ count +" Elements");
        for(i=0;i<count;i++)
        {
           inputArray[i]= a.nextInt();
        }
        max=min=inputArray[0];

        for(i=1;i<count;i++)
        {
            if(inputArray[i]>max)
               max=inputArray[i];
            else if(inputArray[i]<min)
               min = inputArray[i];
        }

       
        System.out.println("The minimum array element is : "+ min);
        System.out.println("The maximum array element is : "+ max);
    }
    
}
