import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // p1
    Scanner scan = new Scanner(System.in);
    System.out.println("1. pls input double");
    double input = scan.nextDouble();
    if (input == 12.345){
      System.out.println("YES");
    }

    //p2
    System.out.println("2. pls input int");
    int in = scan.nextInt();
    if (in == 48){
      System.out.println("YES");
    }

    //p3
    System.out.println("3. pls enter 2 ints");
    in = scan.nextInt();
    int put = scan.nextInt();
    if (2 * in == put){
      System.out.println("YES");
    }

    //p4
    System.out.println("4. pls give int");
    in = scan.nextInt();
    if (in % 2 == 0){
      System.out.println("divisble by 2");
    }
    if (in % 3 == 0){
      System.out.println("divisble by 3");
    }

    //p5
    System.out.println("5. pls enter int");
    in = scan.nextInt();
    if (in % 2 == 0){
      System.out.println("even");
    } 
    else{
      System.out.println("odd");
    }
    scan.nextLine();

    //p6
    System.out.println("6. pls enter letter");
    String letter = scan.nextLine();
    if (letter.equals("A")){
    System.out.println("90-100");
    }
    else if (letter.equals("B")){
    System.out.println("80-90");
    }
    else if (letter.equals("C")){
    System.out.println("70-80");
    }
    else if (letter.equals("D")){
    System.out.println("60-70");
    }
    else if (letter.equals("F")){
    System.out.println("0-60");
    }
    else{
      System.out.println("invalid letter grade");
    }
    scan.nextLine();

    //p7
    int rand1 = (int) (Math.random() * 51);
    int rand2 = (int) (Math.random() * 50) + 51;
    System.out.println(rand1 + " + " + rand2 + " = ?");
    in = scan.nextInt();
    if (rand1 + rand2 == in){
      System.out.println("Correct!");
    }
    else{
      System.out.println("Wrong");
    }

    //p8
    System.out.println("what is the temperature little boi?");
    in = scan.nextInt();
    if ((97 <= in) && (99 >= in)){
      System.out.println("temperature is OK");
    }
    else{
      System.out.println("NOT NORMAL");
    }
    scan.close();
  }
}
