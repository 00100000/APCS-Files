import java.util.Calendar;

public class DateDriver {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
                int y = now.get(Calendar.YEAR);
                int m = now.get(Calendar.MONTH) + 1;
                int d = now.get(Calendar.DATE);

        Date d1 = new Date(4, 31, 2003);
                d1.setDay(d);
                d1.setMonth(m);
                d1.setYear(y);
        System.out.println(d1.toString());

        Date d2 = new Date(12, 25, 2020);
        Date d3 = new Date(4, 13, 1946);
        System.out.println(d2.compareTo(d3));
        System.out.println(d2.equals(d3));

        Date birthdate = new Date(3, 6, 1973);
        System.out.println(birthdate.ageAsOf(new Date(2, 5, 1974))); // 0
        System.out.println(birthdate.ageAsOf(new Date(12, 11, 2020))); // 47
        System.out.println(birthdate.ageAsOf(new Date(3, 5, 2023))); // 49
        System.out.println(birthdate.ageAsOf(new Date(3, 6, 2023))); // 50
    }
}