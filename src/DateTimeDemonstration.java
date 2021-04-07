import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeDemonstration {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
//        System.out.println(today);
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
//        System.out.println("Today is " + today.format(outputFormatter));
//
//        LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
//        System.out.println("Today is still " + today.format(outputFormatter));
//        System.out.println("Tomorrow is " + tomorrow.format(outputFormatter));
//
//        LocalDate christmas = LocalDate.of(2021, Month.DECEMBER, 25);
//        Period timeToXmas = Period.between(today, christmas);
//        System.out.println(timeToXmas);
//        System.out.println("Christmas is in " + timeToXmas.get(ChronoUnit.DAYS) + " days.");
//        // this only gives a remainder
//        System.out.println("Christmas is in " + timeToXmas.get(ChronoUnit.YEARS) +
//                " years and " + timeToXmas.get(ChronoUnit.MONTHS) + " months and " +
//                timeToXmas.get(ChronoUnit.DAYS) + " days.");
//        System.out.println("Christmas is in " + ChronoUnit.DAYS.between(today,christmas) + " days.");

        String midtermsString = "11-06-2021";
        DateTimeFormatter inputFormater = DateTimeFormatter.ofPattern("LL-dd-yyyy");
        LocalDate midterms = LocalDate.parse(midtermsString, inputFormater);
        boolean alreadyHappened = today.isAfter(midterms);
        System.out.println("The midterm election " + (alreadyHappened ? "has": "has not" + " already happened."));
        LocalDate dayBeforeMidterms = midterms.minus(1, ChronoUnit.DAYS);
        System.out.println("There will be lots of campaigning on " + dayBeforeMidterms.format(outputFormatter));

    }
}
