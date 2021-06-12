import java.util.Calendar;

public class Date {
  private int month;
  private int day;
  private int year;
  
  //constructors
  public Date(int initMonth, int initDay, int initYear) {
    month = initMonth;
    day = initDay;
    year = initYear;
  }
  
  public Date(int initMonth, int initDay) {
    this(initMonth, initDay,
         Calendar.getInstance().get(Calendar.YEAR));
  }
  
  public Date() {
    this(Calendar.getInstance().get(Calendar.MONTH) + 1,
         Calendar.getInstance().get(Calendar.DATE),
         Calendar.getInstance().get(Calendar.YEAR));
  }
  
  //getters and setters
  public int getMonth() {
    return month;
  }
  
  public int getDay() {
    return day;
  }
  
  public int getYear() {
    return year;
  }
  
  public void setMonth(int newMonth) {
    if (newMonth < 1 || newMonth > 12)
      throw new IllegalArgumentException("Invalid month: " + newMonth);
    month = newMonth;
  }
  
  public void setDay(int newDay) {
    day = newDay;
  }
  
  public void setYear(int newYear) {
    if (newYear == 0)
      throw new IllegalArgumentException("There is no year 0");
    year = newYear;
  }
  
  //other methods
  public String toString() {
    String[] months = {"", "January", "February", "March", "April", "May", "June",
      "July", "August", "September", "October", "November", "December"};
    return months[month] + " " + day + ", " + year;
  }
  
  public boolean equals(Date other) {
    return (month == other.month) &&
      (day == other.day) &&
      (year == other.year);
  }
  
  public int compareTo(Date other) {
    if (year < other.year)
      return -1;
    if (year > other.year)
      return 1;
    //at this point, the years must be the same
    if (month < other.month)
      return -1;
    if (month > other.month)
      return 1;
    //at this point, the years and months are the same
    return day - other.day;
  }
  
  public int ageAsOf(Date other) {
    if (this.compareTo(other) > 0)
      throw new IllegalArgumentException(this +
              " comes after " + other);
    int result = other.year - this.year;
    if (this.compareTo(new Date(other.month, other.day,
                                this.year)) > 0)
      result--;
    if (this.year < 0 && other.year > 0)
      result--;
    return result;
  }
}
  