import java.util.Scanner;
class Calculator{
public static void main(String[] args){
  System.out.println("for Addition press 1");
  System.out.println("for subtraction press 2");
  System.out.println("for divison press 3");
  System.out.println("for multiplication press 4");
  System.out.println("for modulus press 5");
  System.out.println("for power press 6");
  System.out.println("for square root press 7");
  System.out.println("Enter two numbers:");
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter first number=>");
  int a = sc.nextInt();
  System.out.println("Entern first number=>" + b);
  int b = sc.nextInt();
  System.out.println("Enter action to perform:");
  int action = sc.nextInt();
  switch(action){
    case 1:
        System.out.println("Addition is:" + (a+b));
        break;
    case 2:
        System.out.println("Subtraction is:" + (a-b));
        break;
    case 3:
        System.out.println("Divison is:" + (a/b));
        break;
    case 4:
        System.out.println("Multiplication is:" + (a*b));
        break;
    case 5:
        System.out.println("Modulus is:" + (a%b));
        break;
    case 6:
        System.out.println("Power of" + a + "is:" + Math.pow(a, b));
        break;
    case 7:
        System.out.println("Square root of:" + a + "is" + Math.sqrt(a));
        System.out.println("Square root of:" + b + "is" + Math.sqrt(b));
        break;
    default:
        System.out.println("Invalid actioon");
        break;
  }
}

}