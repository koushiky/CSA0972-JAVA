import java.util.Scanner;
public class voting
{ 
 public static void main(String[]args)
 {
  int age,shrt;
  Scanner scan=new Scanner(System.in);
  System.out.println("please enter your age");
  age = scan.nextInt();
  if(age>=18)
  {
   System.out.println("you are eligible for voting");
  }
  else
  {
   shrt=(18-age);
   System.out.println("you can vote after:"+shrt+"years");
  }
 }
}
