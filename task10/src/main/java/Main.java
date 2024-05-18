public class Main {
    public static void main(String[] args) {
        String input = "5521-aBc-5212-GDs-8z5D";

        System.out.println(input);
        System.out.println(FormatString.firstEightNumber(input));
        System.out.println(FormatString.replaceLetters(input));
        System.out.println(FormatString.onlyLettersInLower(input));
        System.out.println(FormatString.onlyLettersInUpper(input));
        System.out.println(FormatString.isHaveABC(input));
        System.out.println(FormatString.isStart555(input));
        System.out.println(FormatString.isEnd1a2b(input));
    }
}
