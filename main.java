import java.util.Scanner;
class Main {
    static int age;
    public static void main(String[] args){
        /*String string = "the sky is blue";
        System.out.println(string);

        String updatedString = string.replace("blue", "red");
        System.out.println(updatedString);

        System.out.println(string.contains(" "));

        //taking input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("what is your name?");
        String name = scanner.nextLine();
        System.out.println("your name is " + name + ". How old are you?");
        int age = scanner.nextInt();
        System.out.printf("You are %d years old", age);
        scanner.close(); */

        //print doesnt have a new line character so the next line prints on the same line
        //printf help to print formatted strings %s for string %d for integer 

        //condition statement
        //explained using a calculator

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter the second number");
        double num2 = scan.nextDouble();
        scan.nextLine();

        System.out.println("what operation do you want to perform");
        String operation = scan.nextLine();

        if(operation.equals("sum")){
            System.out.printf("%f + %f = %f", num1, num2, num1 + num2);
        }else if(operation.equals("subtract")){
            System.out.printf("%f - %f = %f", num1, num2, num1-num2);
        }else if(operation.equals("multiply")){
            System.out.printf("%f * %f = %f", num1, num2, num1 * num2);
        }else if(operation.equals("divide")){
            System.out.printf("%f / %f = %f", num1, num2, num1 / num2);
        };
        scan.close();
    }
 }