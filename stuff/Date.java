import java.util.Calendar;

public class Date {
    // properties
    private int year;
    private int month;
    private int day;

    Calendar now = Calendar.getInstance();
            int currentY = now.get(Calendar.YEAR);
            int currentM = now.get(Calendar.MONTH) + 1;
            int currentD = now.get(Calendar.DATE);

    // constructors
    public Date(int m, int d, int y) {
        setDay(d);
        setMonth(m);
        setYear(y);
    }
    public Date(int m, int d) {
        setDay(d);
        setMonth(m);
        setYear(currentY);
    }
    public Date() {
        setDay(currentD);
        setMonth(currentM);
        setYear(currentY);
    }

    // getters
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    //setters
    public void setYear(int newYear) {
        year = newYear;
    }
    public void setMonth(int newMonth) {
        month = newMonth;
    }
    public void setDay(int newDay) {
        day = newDay;
    }

    // part 2
    public String toString() {
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return month[getMonth() - 1] + " " + getDay() + ", " + getYear();
    }
    public boolean equals(Date other) {
        return this.compareTo(other) == 0 ? true : false;
    }
    public int compareTo(Date other) {
        if (this.getYear() == other.getYear()) {
            if (this.getMonth() == other.getMonth()) {
                if (this.getDay() == other.getDay()) {
                    return 0;
                } else {
                    return this.getDay() - other.getDay();
                }
            } else {
                return this.getMonth() - other.getMonth();
            }
        } else {
            return this.getYear() - other.getYear();
        }
    }

    // part 3
    public int ageAsOf(Date other) {
        int ret = other.getYear() - this.getYear();
        if (other.getMonth() < this.getMonth()) {
            ret--;
        } else if (other.getMonth() == this.getMonth()) {
            if (other.getDay() < this.getDay()) {
                ret--;
            }
        }
        if (ret < 0) throw new IllegalArgumentException();
        return ret;
    }
}