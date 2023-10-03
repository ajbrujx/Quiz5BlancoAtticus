import java.util.Scanner;
public class Quiz5 {

    int sum = 0;
    int numberCount = 0;


    public void processNumber (int integer) {
        this.sum = this.sum + integer;
        this.numberCount++;
    }

    public void getInput(int number) {
        Scanner scanner = new Scanner(System.in);
        // sout propt
        System.out.println("Select a number between 1-100");

        // userVal input\store userVal input to variable
        int userVal = Integer.parseInt(scanner.nextLine());

        // if tree checksum input between [1,100]
        if (userVal >= 1 && userVal <=100) {
            getInput(userVal);
        } else {
            System.out.println("Invalid number entered");
            return;
        }

    }

    public void showResults() {

    }

    public static void main(String[] args) {



    }
}