import java.util.ArrayList;

public class VetsOffice {
    ArrayList<Pet> pets;

    public VetsOffice() {
        pets = new ArrayList<Pet>();
    }
    public void addPet(Pet p) {
        pets.add(p);
    }
    public int findPet(String name) {
        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i).getName() == name) return i;
        }
        return -1;
    }
    public Pet getPet(String name) {
        Pet retPet = new Pet("Unknown Name", "Unknown Type", 1, 3, 37);
        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i).getName() == name) retPet = pets.get(i);
        }
        return retPet;
    }
    public Pet removePet(String name) {
        Pet retPet = new Pet("Unknown Name", "Unknown Type", 1, 3, 37);
        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i).getName() == name) {
                retPet = pets.get(i);
                pets.remove(i);
            }
        }
        return retPet;
    }
    public void listAll() {
        for (int i = 0; i < pets.size(); i++) {
            System.out.println(pets.get(i).toString());
        }
    }
    public void listAll(String type) {
        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i).getType() == type) {
                System.out.println(pets.get(i).toString());
            }
        }
    }
    public void listCatOwnersToRemind() {
        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i) instanceof Cat) {
                if (((Cat) pets.get(i)).dueForVaccination()) {
                    System.out.println(pets.get(i).toString());
                }
            }
        }
    }
}
