package util;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public class KeyboardReader {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String readString(String messageString) throws IOException {
        System.out.print(messageString);
        return reader.readLine();
    }

    public static int readInt(String messageString) throws IOException {
        while (true) {
            try {
                System.out.print(messageString);
                return Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid value! Please enter an integer.");
            }
        }
    }

    public static byte readByte(String messageString) throws IOException {
        while (true) {
            try {
                System.out.print(messageString);
                return Byte.parseByte(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid value! Please enter a number between -128 and 127.");
            }
        }
    }

    public static LocalDate readDate(String messageString, String datepattern) throws IOException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(datepattern);
        while (true) {
            try {
                System.out.print(messageString);
                String input = reader.readLine();
                return LocalDate.parse(input, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date! Use the datepattern: " + datepattern);
            }
        }
    }
}