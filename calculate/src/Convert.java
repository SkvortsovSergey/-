public class Convert {
    private final String[] ROMNUM = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
    private int intNum, intNum2;

    public Convert(String romNum, String romNum2) {//перевод строк в арабские цифры
        if (!Character.isDigit(romNum.charAt(0)) && !Character.isDigit(romNum2.charAt(0))) {
            try {
                for (int i = 0; i < 11; i++) {
                    String[] TEST = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
                    if (romNum.equals(TEST[i])) this.intNum = i;
                    if (romNum2.equals(TEST[i])) this.intNum2 = i;
                }
                intNum = intNum / intNum * intNum;
                intNum2 = intNum2 / intNum2 * intNum2;
            } catch (ArithmeticException e) {
                System.out.println("Введено неверное значение.");
            }
        } else if (Character.isDigit(romNum.charAt(0)) && Character.isDigit(romNum2.charAt(0))) {
            this.intNum = Integer.parseInt(romNum);
            this.intNum2 = Integer.parseInt(romNum2);
        }
        try {
            if (intNum < 1 || intNum > 10 || intNum2 < 1 || intNum2 > 10) {
                intNum = 0;
                intNum2 = 0;
            }
            intNum = intNum / intNum * intNum;
            intNum2 = intNum2 / intNum2 * intNum2;
        } catch (ArithmeticException e) {
            System.out.println("Введено неверное значение.");
        }
    }
    public String convertInt(int num) {//перевод арабских цифр в римские
        return num >= 1 ? ROMNUM[num] : "Ошибка, число не может быть меньше или равно 0";
    }

    public int getIntNum() {
        return intNum;
    }

    public int getIntNum2() {
        return intNum2;
    }
}
