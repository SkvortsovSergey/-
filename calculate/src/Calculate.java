public class Calculate {
    private String firs, second;
    private int firstInt, secondInt;


    public Calculate(char ch, String first, String second) {
        Convert convert = new Convert();
        this.firs = first;
        this.second = second;
        switch (ch) {
            case '+':
                if (Character.isDigit(firs.charAt(0))) {
                    firstInt = Integer.parseInt(firs);
                    secondInt = Integer.parseInt(second);
                    System.out.println((firstInt + secondInt));
                } else {
                    firstInt = convert.convertStr(firs);
                    secondInt = convert.convertStr(second);
                    System.out.println(convert.convertInt(firstInt + secondInt));
                }
                break;

            case '-':
                if (Character.isDigit(firs.charAt(0))) {
                    firstInt = Integer.parseInt(firs);
                    secondInt = Integer.parseInt(second);
                    System.out.println((firstInt - secondInt));
                } else {
                    firstInt = convert.convertStr(firs);
                    secondInt = convert.convertStr(second);
                    System.out.println(convert.convertInt(firstInt - secondInt));
                }
                break;
            case '*':
                if (Character.isDigit(firs.charAt(0))) {
                    firstInt = Integer.parseInt(firs);
                    secondInt = Integer.parseInt(second);
                    System.out.println((firstInt * secondInt));
                } else {
                    firstInt = convert.convertStr(firs);
                    secondInt = convert.convertStr(second);
                    System.out.println(convert.convertInt(firstInt * secondInt));
                }
                break;
            case '/':
                if (Character.isDigit(firs.charAt(0))) {
                    firstInt = Integer.parseInt(firs);
                    secondInt = Integer.parseInt(second);
                    System.out.println((firstInt / secondInt));
                } else {
                    firstInt = convert.convertStr(firs);
                    secondInt = convert.convertStr(second);
                    System.out.println(convert.convertInt(firstInt / secondInt));
                }
                break;
        }
    }
}

