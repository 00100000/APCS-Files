public class Pet {
    private String name;
    private String type;
    private Date birthday;

    // constructors
    public Pet(String initName, String initType, Date initBirthday) {
        name = initName;
        type = initType;
        birthday = initBirthday;
    }

    public Pet(String initName, String initType, int initMonth, int initDay, int initYear) {
        this(initName, initType, new Date(initMonth, initDay, initYear));
    }

    // getters and setters
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

    // other methods
    public boolean isBirthday() {
        Date today = new Date();
        today.setYear(birthday.getYear());
        return today.equals(birthday);
    }

    public int getAge() {
        return birthday.ageAsOf(new Date());
    }
}