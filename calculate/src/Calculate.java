public class Calculate {
    private int result;
    public Calculate(char ch, String first, String second) {
        Convert convert = new Convert(first, second);
        int firstInt = convert.getIntNum();
        int secondInt = convert.getIntNum2();
        switch (ch) {
            case '+' -> result = (firstInt + secondInt);
            case '-' -> result = (firstInt - secondInt);
            case '*' -> result = (firstInt * secondInt);
            case '/' -> result = (firstInt / secondInt);
        }
        if (!Character.isDigit(first.charAt(0)) && !Character.isDigit(second.charAt(0)) && result > 0) {
            System.out.println(convert.convertInt(result));
        } else if (!Character.isDigit(first.charAt(0)) && !Character.isDigit(second.charAt(0)) && result <= 0) {
            System.out.println("Недопустимое значение");
        } else if(Character.isDigit(first.charAt(0)) && Character.isDigit(second.charAt(0))&&firstInt<11&&firstInt>0&&secondInt<11&&secondInt>0){
            System.out.println(result);
        }
    }
}

