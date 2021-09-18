import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();
        inputStr = inputStr.trim();
        GetChars getChars = new GetChars(inputStr);
        String firsStr = getChars.getFirsStr(), secondStr = getChars.getSecondStr();
        char ch = getChars.getCh();
        try {
            Calculate calculate = new Calculate(ch, firsStr, secondStr);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Неверный формат выражения");
        }

    }
}
