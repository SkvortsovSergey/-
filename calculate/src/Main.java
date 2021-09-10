import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Convert convert = new Convert();
        String inputStr = in.nextLine();
        inputStr = inputStr.trim();
        int znak = 0, firstInt = 0, secondInt = 0;
        String firsStr, secondStr;
        if (inputStr.indexOf('+') > 0) {
            znak = inputStr.indexOf('+');
            firsStr = inputStr.substring(0, znak);
            secondStr = inputStr.substring(znak + 1, inputStr.length());
            if (Character.isDigit(firsStr.charAt(0))) {
                firstInt = Integer.parseInt(firsStr);
                secondInt = Integer.parseInt(secondStr);
                System.out.println((firstInt + secondInt));
            } else {
                firstInt = convert.convertStr(firsStr);
                secondInt = convert.convertStr(secondStr);
                System.out.println(convert.convertInt(firstInt + secondInt));
            }
        }
        if (inputStr.indexOf('-') > 0) {
            znak = inputStr.indexOf('-');
            firsStr = inputStr.substring(0, znak);
            secondStr = inputStr.substring(znak + 1, inputStr.length());
            if (Character.isDigit(firsStr.charAt(0))) {
                firstInt = Integer.parseInt(firsStr);
                secondInt = Integer.parseInt(secondStr);
                System.out.println((firstInt - secondInt));
            } else {
                firstInt = convert.convertStr(firsStr);
                secondInt = convert.convertStr(secondStr);
                System.out.println(convert.convertInt(firstInt - secondInt));
            }
        }
        if (inputStr.indexOf('*') > 0) {
            znak = inputStr.indexOf('*');
            firsStr = inputStr.substring(0, znak);
            secondStr = inputStr.substring(znak + 1, inputStr.length());
            if (Character.isDigit(firsStr.charAt(0))) {
                firstInt = Integer.parseInt(firsStr);
                secondInt = Integer.parseInt(secondStr);
                System.out.println(firstInt * secondInt);
            } else {
                firstInt = convert.convertStr(firsStr);
                secondInt = convert.convertStr(secondStr);
                System.out.println(convert.convertInt(firstInt * secondInt));
            }
        }
        if (inputStr.indexOf('/') > 0) {
            znak = inputStr.indexOf('/');
            firsStr = inputStr.substring(0, znak);
            secondStr = inputStr.substring(znak + 1, inputStr.length());
            if (Character.isDigit(firsStr.charAt(0))) {
                firstInt = Integer.parseInt(firsStr);
                secondInt = Integer.parseInt(secondStr);
                System.out.println(firstInt / secondInt);
            } else {
                firstInt = convert.convertStr(firsStr);
                secondInt = convert.convertStr(secondStr);
                System.out.println(convert.convertInt(firstInt / secondInt));
            }
        }
    }
}
