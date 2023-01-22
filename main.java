import java.util.Scanner;
class Main {
    static int age;
    public static void main(String[] args){
        String string = "the sky is blue";
        System.out.println(string.replace("blue", "red"));

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
        scanner.close();

        //print doesnt have a new line character so the next line prints on the same line
        //printf help to print formatted strings %s for string %d for integer 
    }
 }