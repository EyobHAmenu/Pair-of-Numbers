import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        /*
            Welcome to play BLACK JACK.
            Enter a your first card number (J = 11, Q = 12, K = 13, A = 14): 1
            Enter a your second card number (J = 11, Q = 12, K = 13, A = 14): 14
            12
            Enter a your first card number (J = 11, Q = 12, K = 13, A = 14): 14
            Enter a your second card number (J = 11, Q = 12, K = 13, A = 14): 14
            12
            Enter a your first card number (J = 11, Q = 12, K = 13, A = 14): 14
            Enter a your second card number (J = 11, Q = 12, K = 13, A = 14): 13
            21 BLACK JACK!! You won!!
            Enter a your first card number (J = 11, Q = 12, K = 13, A = 14): 13
            Enter a your second card number (J = 11, Q = 12, K = 13, A = 14): 13
            20
            Enter a your first card number (J = 11, Q = 12, K = 13, A = 14): 9
            Enter a your second card number (J = 11, Q = 12, K = 13, A = 14): 9
            18
            Enter a your first card number (J = 11, Q = 12, K = 13, A = 14): 0
            Enter a your second card number (J = 11, Q = 12, K = 13, A = 14): 14
            11
            Enter a your first card number (J = 11, Q = 12, K = 13, A = 14): 0
            Enter a your second card number (J = 11, Q = 12, K = 13, A = 14): 0
            Good Bay!!!
         */

        int num1, num2;
        int sum = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to play BLACK JACK.");
        System.out.print("Enter a your first card number (J = 11, Q = 12, K = 13, A = 14): ");
        num1 = in.nextInt();
        System.out.print("Enter a your second card number (J = 11, Q = 12, K = 13, A = 14): ");
        num2 = in.nextInt();

        while (num1 != 0 || num2 != 0){

            sum = sumTwoCards(num1,num2);

            if (sum == 21){
                System.out.println(sum + " ******** BLACK JACK!! You won!!");
            }else {
                System.out.println(sum);
            }

            System.out.print("Enter a your first card number (J = 11, Q = 12, K = 13, A = 14): ");
            num1 = in.nextInt();
            System.out.print("Enter a your second card number (J = 11, Q = 12, K = 13, A = 14): ");
            num2 = in.nextInt();
        }
        System.out.println("Good Bay!!!");
    }
    public static int sumTwoCards(int x, int y){
        int add = 0;

        // x is A the
        if (x == 14){
            // y is A (both are A)
            if(y == 14){
                add = 11 + 1;
            }
            //x is A and y is J, Q, or K
            else if (y == 11 || y == 12 || y == 13){
                add = 11 + 10; // one card is A the other is J, Q or K
            }
            // x is A and y is less than or equal to 10
            else{
                add = 11 + y;
            }
        }

        // x is J, Q or K
        else if ((x == 11 || x == 12 || x == 13)) {
            // y is A the and x  is J, Q or K
            if ((y == 14)) {
                add = 11 + 10;
            }
            //both x and y are from J,Q or K.
             else if ((y == 11 || y == 12 || y == 13)) {
                add = 10 + 10;
             }
             // x is J, Q or K and y is less than or equal to 10
            else {
                add = 10 + y;
            }
        }

        // x is less than or equal 10
        else if (x <= 10){
            // x is less than or equal 10 and y is A
            if ((y == 14)) {
                add = 11 + x;
            }
            //x is less than or equal 10 and y is J,Q or K.
            else if ((y == 11 || y == 12 || y == 13)) {
                add = 10 + x;
            }
            //both x and y are less than or equal 10
            else {
                add = x + y;
            }
        }

        return add;
    }




}
