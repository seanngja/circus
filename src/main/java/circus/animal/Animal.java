package circus.animal;

import circus.Asset;

import java.util.Comparator;

public abstract class Animal implements Asset {

    public static Comparator<Animal> AnimalNameComparator = new Comparator<Animal>() {
        public int compare(Animal a1, Animal a2) {
            return a1.name.compareToIgnoreCase(a2.name);
        }
    };

    public String name;
    public abstract String speak();
}
