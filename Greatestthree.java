import java.util.Scanner;
class Greatestthree{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        System.out.println("First number="); 
        int a = sc.nextInt(); 
        System.out.println("Second number="); 
        int b = sc.nextInt(); 
        System.out.println("Third number="); 
        int c = sc.nextInt(); 
        if(a>b && a>c){
            System.out.println("a is greatest" + a);
        }else if(b>a && b>c){
            System.out.println("b is greatest" + b);
        }else{
            System.out.println("c is greatest" + c);
        }
    }
}