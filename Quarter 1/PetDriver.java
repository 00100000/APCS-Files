public class PetDriver {
    public static void main (String[]args) {
        Pet fifi = new Pet("Fifi", "cat", new Date(6, 23, 1998));
            System.out.println(fifi.isBirthday());
            System.out.println(fifi.getAge());
    }   
}