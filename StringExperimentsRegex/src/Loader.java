import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader {
    public static void main(String[] args) {
        String text = "Вася заработал 800000 рублей, Петя - 7563 рублей, а Маша - 300000 рублей";
        Matcher matcher = Pattern.compile("\\d+", Pattern.MULTILINE).matcher(text);
        Integer sum = 0;
        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group(0));
        }
        System.out.println("Доход = " + sum);
    }
}


