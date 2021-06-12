public class Cat extends Pet {
    Date nextVaccineDate;

    public Cat(String initName, Date initBirthday, Date initNextVaccineDate) {
        super(initName, "Cat", initBirthday);
        nextVaccineDate = initNextVaccineDate;
    }
    public String toString() {
        return super.toString() + ", nextVaccineDate: " + nextVaccineDate.toString();
    }
    public Date getNextVaccineDate() {
        return nextVaccineDate;
    }
    public boolean dueForVaccination() {
        Date todayDate = new Date();
        return todayDate.compareTo(nextVaccineDate) > 0;
    }
    public void vaccinate() {
        nextVaccineDate.setYear(nextVaccineDate.getYear() + 1);
    }
}