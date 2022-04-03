import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Loader {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String fullName = in.nextLine();

        String[] names = extractFIO(fullName);
        if (names == null)
            System.out.println("Invalid input");
        else {
            System.out.println("Фамилия: " + names[0]);
            System.out.println("Имя: " + names[1]);
            System.out.println("Отчество: " + names[2]);
        }
    }


    private final static Pattern FIO_PATTERN = Pattern.compile("\\s*+([А-ЯЁ][а-яё]++(?:-[А-ЯЁ][а-яё]++)?)\\s++([А-ЯЁ][а-яё]++)\\s++([А-ЯЁ][а-яё]++)\\s*+");

    public static String[] extractFIO(String fullName) {
        Matcher matcher = FIO_PATTERN.matcher(fullName);
        if (matcher.matches()) {
            return new String[]{matcher.group(1), matcher.group(2), matcher.group(3)};
        } else {
            return null;
        }
    }

}

