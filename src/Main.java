import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Counter counter = new Counter();

            System.out.println("Enter your gibberish");
            while (true){
                String Words = scan.nextLine();

                if (counter.isStopWord(Words)){
                    System.out.println("You wrote this many characters: "+counter.getChars());
                    System.out.println("You wrote this many rows: "+counter.getLines());
                    break;
                }
                counter.cAmount(Words.length());
                counter.lAmount();
            }

        }
}