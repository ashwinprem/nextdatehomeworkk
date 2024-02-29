package homework;

public class App {

    public static String NextDate(int day, int month, int year) {
        // Check if the date is within the valid domain
        if (year < 1812 || year > 2212 || month < 1 || month > 12 || day < 1 || day > 31) {
            return "--/--/----";
        }

        // Check for leap year
        boolean isLeapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));

        // Check for February and leap year exception
        if (month == 2) {
            if (isLeapYear && day > 29) return "--/--/----";
            if (!isLeapYear && day > 28) return "--/--/----";
        }

        // Check for months with 30 days
        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            return "--/--/----";
        }

        // Calculate next date
        day++;
        if ((month == 2 && ((isLeapYear && day > 29) || (!isLeapYear && day > 28)))
            || (day > 30 && (month == 4 || month == 6 || month == 9 || month == 11))
            || day > 31) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }

        // Return the next date in DD/MM/YYYY format
        return String.format("%d/%d/%d", day, month, year);
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println(NextDate(28, 2, 2024)); // Should print 29/2/2024 (Leap year)
    }
}
