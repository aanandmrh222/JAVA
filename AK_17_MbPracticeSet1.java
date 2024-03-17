import java.util.Scanner;
public class AK_17_MbPracticeSet1 {
    int roll() {
        double random = Math.random() * 6;
        return (int) Math.ceil(random);
    }

    int ran;
    AK_17_MbPracticeSet1() {
        ran = (int) Math.ceil(Math.random() * 100);
    }

    /**
     * @param guessNumber the number that player guessed
     * @return
     * - Negative if the guessed number is smaller.
     * - 0 if the guessed number is correct.
     * - Positive if the guessed number is higher.
     */
    int guess(int guessNumber) {
        return guessNumber - ran;
    }
    public static void main(String[] args) {
        System.out.println(" -- Random number generator -- ");
        AK_17_MbPracticeSet1 dice = new AK_17_MbPracticeSet1();
        for(int i=0; i<10; i++) {
            System.out.print(dice.roll() + " ");
        }

        System.out.println("\n -- Guessing Game between 1 to 100 -- ");
        Scanner input = new Scanner(System.in);
        AK_17_MbPracticeSet1 game = new AK_17_MbPracticeSet1();
        int num;
        int result;
        do {
            System.out.print("Guess the number: ");
            num = input.nextInt();
            result = game.guess(num);
            if(result==0) {
                System.out.println("Congrats, your guess is correct");
            } else if(result<0) {
                System.out.println("Please Guess Higher");
            } else {
                System.out.println("Please Guess Lower");
            }
        } while (result!=0);
    }
}
