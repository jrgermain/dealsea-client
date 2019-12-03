import java.util.Scanner;

public class ConsoleInput {

    private int interval;
    private String keyWord;
    private Scanner io = new Scanner(System.in);

    ConsoleInput(){
        //Input
        System.out.println("---Deal Sailor---");
        System.out.println("Enter an item you want to search for");
        keyWord = io.nextLine();
        System.out.println("Refresh Frequency(min(s))");
        interval = io.nextInt();

        //Output
        System.out.println("All set. You will be notified when we find a match for your search.");
        System.out.println("Item(s) Searched:" + "\n" + "\t" + keyWord);
        System.out.println("Frequency: " + interval +" min(s)");
        io.close();
    }

    int getInterval() {
        return this.interval;
    }

    String getKeyWord() {
        return this.keyWord;
    }

}
