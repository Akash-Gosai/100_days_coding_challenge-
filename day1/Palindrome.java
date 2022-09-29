import java.util.Scanner;

class Palindrome {
  public static void main(String []args)
  {
    String name;
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter your string : ");
    name=sc.nextLine();
    int leng=name.length();
    String rev="";
    for(int i=leng-1;i>=0;i--)
    {
      rev=rev+name.charAt(i);
    }
    if(name.equals(rev))
    {
      System.out.println(name+" :is  palindrome");

    }
    else{
      System.out.println(name+"  :not palindrome");
    }
    }
}
