import java.util.Calendar;

public class Pet {
    private String name;
    private String type;
    private Date birthday;

    Calendar now = Calendar.getInstance();
        int currentY = now.get(Calendar.YEAR);
        int currentM = now.get(Calendar.MONTH) + 1;
        int currentD = now.get(Calendar.DATE);

    // constructors (part a)
    public Pet(String initName, String initType, Date initBirthday) {
        name = initName;
        type = initType;
        birthday = initBirthday;
    }
    public Pet(String initName, String initType, int initMonth, int initDay, int initYear) {
        name = initName;
        type = initType;
        birthday = new Date(initMonth, initDay, initYear);
    }

    //getters and setters (part b)
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setName(String newName) {
        name = newName;
    }

    //other methods (parts c and d)
    public boolean isBirthday() {
        return birthday.compareTo(new Date(currentM, currentD, birthday.getYear())) == 0;
    }
    public int getAge() {
        return birthday.ageAsOf(new Date(currentM, currentD, currentY));
    }
}