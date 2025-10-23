import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    // Problem 1
    for (int i = 1; i <= 25; i += 2)
    {
      System.out.println(i + " ");
    }

    // Problem 2
    int count = 0;
    for (int a = 17; a <= 73; a++)
    {
      if (count < 11)
      {
        System.out.print(a + " ");
        count++;
      }
      else
      {
        count = 0;
        System.out.println(a + " ");
      }
    }

    // Problem 3
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number between 0 and 50");
    int num = sc.nextInt();

    for (int b = num; b <=50; b++)
    {
      if (num <= 0 || num >= 50)
      {
        System.out.println("error");
      }
      System.out.print(b + " ");
    }

    //Problem 4
    System.out.println("Enter a number greater than 0.");
    int pos = sc.nextInt();

    for (int c = pos; c >= 0; c--)
    {
      if (c < 0)
      {
        System.out.println("error");
      }
      else if (c % 3 == 0)
      {
        System.out.println(c + " ");
      }
    }
  }
}
