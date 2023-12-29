import java.util.Scanner;
class App {
    public static void main(String[] args) {
        try (Scanner myScan = new Scanner(System.in)) {
            boolean isWin  = false;
            int min = 0, max = 20;
            int randomNum = min + (int)(Math.random() * ((max - min) + 1));

            // Looping for checking answer
            while (!isWin) {
                System.out.println("Guess The number Game");
                System.out.print("Your Answer: ");
                int answer = myScan.nextInt();
                if(answer > randomNum){
                    System.out.println("too big");
                } else if (answer == randomNum) {
                    System.out.println("YOU WIN!!!!!!!!!");
                    isWin = true;
                } else {
                    System.out.println("too small");
                }
            }
            System.out.println("The Corrent Answer is: " + randomNum);
        }
        System.out.println("Game End");
    }
}