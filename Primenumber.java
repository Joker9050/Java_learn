import java.util.Scanner;
class Primenumber{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your number:");
      int number = sc.nextInt();
      if(number == 0 || number == 1){
        System.out.println("Not a prime number");
      }else{
        boolean isPrime = true;
        for(int i = 2; i<= Math.sqrt(number); i++){
            if( number % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("The number" + number + "is a prime number");
        }else{
            System.out.println("The number "+ number + "is not a prime number");
        }
      }
      sc.close();
      
    }
}