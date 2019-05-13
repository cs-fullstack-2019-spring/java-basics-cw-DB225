import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner GradedClass = new Scanner(System.in);

        // Exercise1
        System.out.println("It’s a great day today");
        System.out.print("What's your name? ");
        String name = GradedClass.nextLine();
        System.out.println(name);

        // Exercise2
        System.out.print("Enter the first number: ");
        int number1 = GradedClass.nextInt();
        System.out.print("Enter the first number: ");
        int number2 = GradedClass.nextInt();

        System.out.println("The sum of "+number1+ " and "+number2+ " is "+(number1+number2));
        System.out.println("The difference is "+(number1-number2));

        // Exercise3
        System.out.print("Enter your balance: ");
        int balance = GradedClass.nextInt();
        System.out.println("I’ve granted you $1.50 more!");
        System.out.println("Your new balance is "+(balance+1.50));

        // Exercise4
        System.out.print("Enter a password: ");
        //I use nextLine because it can be a password with some spaces inside
        String password1 = GradedClass.nextLine();
        System.out.print("Enter the password again: ");
        String password2 = GradedClass.nextLine();

        if(password1 .equals(password2) ){
            System.out.println("You're correct!!!");
        }
        else{
            System.out.println("You're not correct");
        }

        // Exercise5
        System.out.print("Enter either 1,2 or 3: ");
        int OneTwoThree = GradedClass.nextInt();

        if(OneTwoThree != 1 && OneTwoThree!=2 && OneTwoThree!=3){
            System.out.println("INCORRECT...");
        }
        else{
            System.out.println("CORRECT...");
        }

        // Exercise6
        System.out.print("Enter a number: ");
        int sign = GradedClass.nextInt();

        if(sign > 0){
            System.out.println("POSITIVE");
        }
        else if(sign < 0) {
            System.out.println("NEGATIVE");
        }
        else {
            System.out.println("ZERO");
        }

        // Exercise7
        System.out.print("Enter the first card: ");
        int card1 = GradedClass.nextInt();

        System.out.print("Enter the second card: ");
        int card2 = GradedClass.nextInt();

        System.out.print("Enter the third card: ");
        int card3 = GradedClass.nextInt();

        int sum = card1+card2+card3;

        if(sum == 21){
            System.out.println("BLACKJACK!!!..");
        }
        else if(sum > 21){
            System.out.println("BUST!!!..");
        }
        else{
            System.out.println("The total is "+sum);
        }

        // Exercise8
        System.out.print("Enter a grade: ");
        int grade = GradedClass.nextInt();

        if(grade <= 100 && grade >=90){
            System.out.println("A");
        }
        else if(grade <= 89 && grade >=80){
            System.out.println("B");
        }
        else if(grade <= 79 && grade >=70){
            System.out.println("C");
        }
        else if(grade <= 69 && grade >=60){
            System.out.println("D");
        }
        else if(grade <= 59 && grade >=0){
            System.out.println("E");
        }
        else{
            System.out.println("Error...");
        }

        // Exercise9
        System.out.print("Enter your height in CM: ");
        int height = GradedClass.nextInt();
        System.out.println("Your height in inches is "+(height*0.39370));

        //Exercise10
        System.out.print("Enter the first number: ");
        int numb1 = GradedClass.nextInt();
        System.out.print("Enter the second number: ");
        int numb2 = GradedClass.nextInt();
        System.out.print("Enter the third number: ");
        int numb3 = GradedClass.nextInt();

        if(numb1>numb2 && numb1>numb3){
            System.out.println("The largest is "+numb1);
        }
        else if(numb2>numb1 && numb2>numb3){
            System.out.println("The largest is "+numb2);
        }
        else if(numb3>numb1 && numb3>numb2){
            System.out.println("The largest is "+numb3);
        }

        // Exercise 11
        System.out.print("Equation type: y = ax2 + bx + c");
        System.out.print("Enter a");
        int a = GradedClass.nextInt();
        System.out.print("Enter b");
        int b = GradedClass.nextInt();
        System.out.print("Enter c");
        int c = GradedClass.nextInt();

//        int x =((-b + (b*b -(Math.sqrt(4*a*c)))/2*a));
//        System.out.print(x);
    }
}
