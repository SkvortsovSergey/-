public class GetChars {
    private int indexOfCh;
    private String firsStr;
    private String secondStr;
    private char ch;

    public GetChars(String consol) {
        if (consol.indexOf('+') > 0) {
            this.indexOfCh = consol.indexOf('+');
            this.ch = '+';
        } else if (consol.indexOf('-') > 0) {
            this.indexOfCh = consol.indexOf('-');
            this.ch = '-';
        } else if (consol.indexOf('*') > 0) {
            this.indexOfCh = consol.indexOf('*');
            this.ch = '*';
        } else if (consol.indexOf('/') > 0) {
            this.indexOfCh = consol.indexOf('/');
            this.ch = '/';
        } else System.out.println("Неверная запись выражения");
        firsStr = consol.substring(0, indexOfCh);
        secondStr = consol.substring(indexOfCh + 1);
    }

    public char getCh() {
        return ch;
    }


    public String getSecondStr() {
        return secondStr;
    }

    public String getFirsStr() {
        return firsStr;
    }
}
