import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();
        inputStr = inputStr.trim();
        GetChars getChars = new GetChars(inputStr);
        String firsStr = getChars.getFirsStr(), secondStr = getChars.getSecondStr();
        char ch = getChars.getCh();
        Calculate calculate = new Calculate(ch, firsStr, secondStr);

    }
}
