public class Calculate {
    private int result;
    public Calculate(char ch, String first, String second) {
        Convert convert = new Convert(first, second);
        switch (ch) {
            case '+' -> result = (convert.getIntNum() + convert.getIntNum2());
            case '-' -> result = (convert.getIntNum() - convert.getIntNum2());
            case '*' -> result = (convert.getIntNum() * convert.getIntNum2());
            case '/' -> result = (convert.getIntNum() / convert.getIntNum2());
        }
        if (!Character.isDigit(first.charAt(0)) && !Character.isDigit(second.charAt(0)) && result > 0) {
            System.out.println(convert.convertInt(result));
        } else if (!Character.isDigit(first.charAt(0)) && !Character.isDigit(second.charAt(0)) && result <= 0) {
            System.out.println("Недопустимое значение");
        } else if(Character.isDigit(first.charAt(0)) && Character.isDigit(second.charAt(0))&&convert.getIntNum()<11&&convert.getIntNum()>0&&convert.getIntNum2()<11&&convert.getIntNum2()>0){
            System.out.println(result);
        }
    }
}

