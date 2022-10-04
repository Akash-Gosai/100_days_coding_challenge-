import java.util.Scanner;
class EvenOdd
{
  public static void main(String[]args)
  {
       // creating Scanner class object to take input
    Scanner sc=new Scanner(System.in);
      // read size of the array
    System.out.print("Enter the length of the array : ");
    int size=sc.nextInt();
      // creating an int array of size "size"
    int arr[] = new int[size];
      // taking input for the array
    System.out.println("Enter the numbers: ");
    for(int i=0; i<size;i++)
    {
        arr[i]=sc.nextInt();
    }
      //checking how many even numbers and odd numbers are there
      //initializing the value of even and odd
    int even=0;
    int odd=0;
    
    for(int k=0;k<size;k++)
    {
        if((arr[k]%2)==0)
        {
            even=even+1;
        }
        else
        {
            odd=odd+1;
        }
    }

      //creating two array to store the elements of even and odd numbers differently
    int evennums[]=new int[even];
    int oddnums[]=new int[odd];

       //storing the even nnumbers 
    int q=0;
    for(int l=0;l<size;l++)
    {
        if((arr[l]%2)==0)
        {
            evennums[q]=arr[l];
            q=q+1;
        }
    }

       //storing the odd numbers
    int v=0;
    for(int h=0;h<size;h++)
    {
        if((arr[h]%2)!=0)
        {
            oddnums[v]=arr[h];
            v=v+1;
        }
    }
      //displaying the even numbers and odd numbers 
    System.out.println("Even numbers are: ");
    for(int y=0;y<even;y++)
    {
        System.out.println(evennums[y]+" ");
    }
    System.out.println("Odd numbers are: ");
    for(int p=0;p<even;p++)
    {
        System.out.println(oddnums[p]+" ");
    }
  }
}
