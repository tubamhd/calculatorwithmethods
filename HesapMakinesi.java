import java.util.Scanner;

public class HesapMakinesi {

    static double division() {
        double n3, n4;
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter 1st Number For Division:  ");
        n3 = input2.nextDouble();
        System.out.print("Enter 2nd Number For Division:  ");
        n4 = input2.nextDouble();

        if (n3 != 0 || n4 != 0) {
            System.out.println("Division Result: " + (n3 / n4));
        } else {
            System.out.println("Error! Division by zero can not calculated!");
        }
        return (n3 / n4);
    }
    static int squaring() {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me Number to square:  ");
        int no1 = input.nextInt();
        return no1 * no1;
    }
    static int cubing(){
        Scanner input2 = new Scanner(System.in);
        System.out.println("Give me number: ");
        int no2 = input2.nextInt();
        return (no2 * no2 * no2);
    }

    //----------------MAİN AREA------------------

    public static void main(String[] args) {
        int select;

        System.out.println("Welcome to My Counter! Please Enter The Number for Calculation!");
        Scanner inp = new Scanner(System.in);
        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\n5-Squaring\n6-Cubing");
        System.out.print("Your Choice:  ");
        select = inp.nextInt();



        switch(select){
            case 1:
                Scanner input = new Scanner(System.in);
                System.out.print("Enter 1st Number:  ");
                int n1 = input.nextInt();
                System.out.print("Enter 2nd Number:  ");
                int n2 = input.nextInt();
                System.out.println("Additional Result:  "+ (n1 + n2));
                break;
            case 2:
                Scanner input1 = new Scanner(System.in);
                System.out.print("Enter 1st Number:  ");
                int n3 = input1.nextInt();
                System.out.print("Enter 2nd Number:  ");
                int n4 = input1.nextInt();
                System.out.println("Subtraction Result:  "+ (n3 - n4));
                break;
            case 3:
                Scanner input2 = new Scanner(System.in);
                System.out.print("Enter 1st Number:  ");
                int n5 = input2.nextInt();
                System.out.print("Enter 2nd Number:  ");
                int n6 = input2.nextInt();
                System.out.println("Multiplication Result:  "+ (n5 * n6));
                break;
            case 4:
                System.out.println("Division Result:  "+ division());
                break;
            case 5:
                System.out.println("Squaring Result:  "+ squaring());
                break;
            case 6:
                System.out.println("Cubing Result:  " + cubing());
                break;

            }

    }
}

