package JavaWeek2Tut;
import java.text.DecimalFormat;

public class decimalFormatofnumbers {
        public static void main(String[] args) {
            double number = 1234567.456;

            // Create a DecimalFormat object with the desired pattern
            DecimalFormat df = new DecimalFormat("#,###,###.0");

            // Format the number and print it
            String formattedNumber = df.format(number);
            System.out.println(formattedNumber);
        }
}
