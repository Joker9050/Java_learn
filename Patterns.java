import java.util.Scanner;
class Patterns{
    public static void main(String[] args){
        System.out.println("Enter what pattern you want :");
        System.out.println("cube = 1");
        System.out.println("rightTriangle = 2");
        System.out.println("rightTriangle with number = 3");
        System.out.println("rightTriangle with number series = 4");
        System.out.println("reverseRightTriangle  = 5");
        System.out.println("reverseRightTriangle with number series = 6");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch(num){
            case 1:
                cubePattern();
                break;
            case 2:
                rightTriangle();
                break;
            case 3:
                rightTrianglenum();
                break;
            case 4:
                rightTrianglenNumberseries();
                break;
            case 5:
                reverseRightTriangle();
                break;
                // reverseRightTrianglenum
            case 6:
                reverseRightTrianglenum();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void cubePattern(){
        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void rightTriangle(){
        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void rightTrianglenum(){
        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public static void rightTrianglenNumberseries(){
        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }


    public static void reverseRightTriangle(){
        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =n; i>=1; i--){
            for(int j = n ; j>=n-i+1; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
   
}

// 1- 12345
// 2-1234