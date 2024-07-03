package SecondChallenge;

import java.util.stream.Collectors;

class WhiteSpace {

    public static void main(String[] args)
    {
        String str = "   How     To Remove All White Space     ";
        String op = str.chars()
                .filter(c -> !Character.isWhitespace(c))
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println(op);
    }
}