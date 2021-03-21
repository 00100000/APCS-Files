public class Dog extends Pet {
    String breed;

    public Dog(String initBreed, String initName, Date initBirthday) {
        super(initName, "Dog", initBirthday);
        breed = initBreed;
    }
    public Dog(String initName, Date initBirthday) {
        this(initName, "unknown", initBirthday);
    }
    public String toString() {
        return super.toString() + ", breed: " + breed;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String tempBreed) {
        breed = tempBreed;
    }
}
