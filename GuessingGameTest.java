import java.util.Random;
import java.util.Scanner;

/*
this is the guessing game. you are asked to choose a number between 1 and 2. the robot also does the same.
if the robot chooses the same number as you then the robot gets the point, but if the robot chooses the wrong
number then you get a point. the game ends when either you or the robot have 10 points.

*/

public class GuessingGameTest {

    public static void main(String[] args) {

        GuessingGame GG1 = new GuessingGame("Abdallah Bilal",19);

        int robotsScore =0;
        int yourScore = 0;
        int [] robotsAnswers = {1,2};

        Random r = new Random();
        int robotsAnswer = robotsAnswers[r.nextInt(2)]; //this is how the robot will always choose a random number

        System.out.println("The Challenger is Called "+ GG1.getFirstName());
        System.out.println("The Challenger is "+ GG1.getAge()+" Years old");

        for (int i = 0; i<20; i++) {

            Scanner in = new Scanner(System.in);
            System.out.println("Choose A number between 1 and 2: ");
            int yourAnswer = in.nextInt(); //this will be your answer
            System.out.println("This is your number "+yourAnswer);
            System.out.println("this is the robots number "+robotsAnswer);

            if (yourAnswer == robotsAnswer) {
                robotsScore++; //this is the robots score
            } else {
                yourScore++; //this is your score
            }


            //Exception Handling

            if(yourAnswer>=3){
                throw new ArithmeticException("Use A Number Between 1 and 2!");

            }

            if(yourAnswer<=0){
                throw new ArithmeticException("Use A Number Between 1 and 2!");

            }

            //This is how you will see your and the robots score
            System.out.println("This is your score "+yourScore);
            System.out.println("This is the robots score "+robotsScore);



            //if  you reach 10 the game will stop and exit
            if(yourScore == 10){
                System.out.println("you are the winner. CONGRATULATIONS");
                System.exit(10);
            }
            else {
                //if the robot reaches 10 the game will stop and exit
                if (robotsScore == 10) {
                    System.out.println("You lost.Sorry Try again");
                    System.exit(0);
                }
            }

        }


    }
}
