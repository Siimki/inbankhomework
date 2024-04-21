package ee.taltech.inbankbackend.service;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

    public static void main(String personalCode) {
        System.out.println("Age: " + calculateAgeFromPersonalCode(personalCode));
    }

    public static int calculateAgeFromPersonalCode(String personalCode) {
        int centuryIndicator = Integer.parseInt(personalCode.substring(0, 1));
        int year = Integer.parseInt(personalCode.substring(1, 3));
        int month = Integer.parseInt(personalCode.substring(3, 5));
        int day = Integer.parseInt(personalCode.substring(5, 7));

        int fullYear = findFullYear(centuryIndicator, year);

        LocalDate birthDate = LocalDate.of(fullYear, month, day);

        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    private static int findFullYear(int centuryIndicator, int year) {
        switch (centuryIndicator) {
            case 1:
            case 2:
                return 1800 + year;
            case 3:
            case 4:
                return 1900 + year;
            case 5:
            case 6:
                return 2000 + year;
            default:
                throw new IllegalArgumentException("Invalid century indicator");
        }
    }
}
