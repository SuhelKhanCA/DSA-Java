// package Generics.Lec5;

class Animal {

    long lifespan;
    float weight;

    Animal(long years, float kg) {
        lifespan = years;
        weight = kg;
    }

    public void print() {
        System.out.println("Maximum longevity: " + lifespan + " in years");
        System.out.println("Maximum weight: " + weight + " in kgs");
    }
}

class Aquatic extends Animal {

    boolean scale; // true: has scale, false: no scale

    Aquatic(long years, float kg, boolean skin) {
        super(years, kg);
        scale = skin;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Has scale? " + scale);
    }
}

class Land extends Animal {

    short vision; // 0 = nocturnal, 1 = only daylight, 2 = both

    Land(long years, float kg, short vision) {
        super(years, kg);
        this.vision = vision;
    }
}

class Pet extends Land {

    String name;

    Pet(long years, float kg, short vision, String name) {
        super(years, kg, vision);
        this.name = name;
    }
}

class Wild extends Land {

    float speed; // Maximum running speed in mph

    Wild(long years, float kg, short vision, float speed) {
        super(years, kg, vision);
        this.speed = speed;
    }
}

class AnimalWorld<T extends Animal> {

    T[] listOfAnimals;

    AnimalWorld(T[] list) {
        listOfAnimals = list;
    }
}

 class BoundedWildcards {

    // Case 1: Unbound wildcard: Any object can be passed as its argument.
    static void vitality(AnimalWorld<?> animals) {
        for (Animal a : animals.listOfAnimals) {
            a.print();
        }
        System.out.println();
    }

    // Case 2: Lower bounded wildcard: Any object of Aquatic or Animal can be passed as its argument.
    static void showSea(AnimalWorld<? super Aquatic> animals) {
        for (Object obj : animals.listOfAnimals) {
            if (obj instanceof Aquatic) {
                ((Aquatic) obj).print();
            } else if (obj instanceof Animal) {
                ((Animal) obj).print();
            }
        }
        System.out.println();
    }

    // Case 3a: Upper bounded wildcard: Any object of Land/ Pet/ Wild can be passed as its argument.
    static void showLand(AnimalWorld<? extends Land> animals) {
        for (Animal animal : animals.listOfAnimals) {
            animal.print();
            System.out.println("Vision: " + ((Land) animal).vision);
        }
        System.out.println();
    }

    // Case 3b: Upper bounded wildcard: Any object of only Pet class can be passed as its argument.
    static void showPet(AnimalWorld<? extends Pet> animals) {
        for (Animal animal : animals.listOfAnimals) {
            Pet pet = (Pet) animal;
            System.out.println("Pet's name: " + pet.name);
            pet.print();
            System.out.println("Vision: " + pet.vision);
        }
        System.out.println();
    }

    // Case 3c: Upper bounded wildcard: Any object of only Wild class can be passed as its argument.
    static void showWild(AnimalWorld<? extends Wild> animals) {
        for (Animal animal : animals.listOfAnimals) {
            Wild wild = (Wild) animal;
            wild.print();
            System.out.println("Maximum running speed: " + wild.speed + " in mph");
            System.out.println("Vision: " + wild.vision);
        }
        System.out.println();
    }
}

public class BoundedWildcardArgumentsDemo {

    public static void main(String[] args) {

        Animal unknown = new Animal(40, 720);
        Animal[] u = { unknown };
        AnimalWorld<Animal> uList = new AnimalWorld<>(u);

        Aquatic whale = new Aquatic(90, 150000, true);
        Aquatic shark = new Aquatic(400, 2150, false);
        Aquatic[] q = { whale, shark };
        AnimalWorld<Aquatic> qList = new AnimalWorld<>(q);

        Land owl = new Land(3, 1, (short) 0);
        Land[] l = { owl };
        AnimalWorld<Land> lList = new AnimalWorld<>(l);

        Pet dog = new Pet(15, 75, (short) 2, "Prince");
        Pet[] p = { dog };
        AnimalWorld<Pet> pList = new AnimalWorld<>(p);

        Wild cheetah = new Wild(15, 75, (short) 2, 70);
        Wild deer = new Wild(10, 50, (short) 1, 30);
        Wild[] w = { cheetah, deer };
        AnimalWorld<Wild> wList = new AnimalWorld<>(w);

        BoundedWildcards.vitality(uList);
        BoundedWildcards.vitality(qList);
        BoundedWildcards.vitality(lList);
        BoundedWildcards.vitality(pList);
        BoundedWildcards.vitality(wList);

        BoundedWildcards.showSea(uList);
        BoundedWildcards.showSea(qList);
        // BoundedWildcards.showSea(lList); // Compile-time error: 'lList' is not a supertype of Aquatic
        // BoundedWildcards.showSea(pList); // Compile-time error: 'pList' is not a supertype of Aquatic
        // BoundedWildcards.showSea(wList); // Compile-time error: 'wList' is not a supertype of Aquatic

        // BoundedWildcards.showLand(uList); // Compile-time error: 'uList' is not a subtype of Land
        // BoundedWildcards.showLand(qList); // Compile-time error: 'qList' is not a subtype of Land
        BoundedWildcards.showLand(lList);
        BoundedWildcards.showLand(pList);
        BoundedWildcards.showLand(wList);

        // BoundedWildcards.showPet(uList); // Compile-time error: 'uList' is not a subtype of Pet
        // BoundedWildcards.showPet(qList); // Compile-time error: 'qList' is not a subtype of Pet
        // BoundedWildcards.showPet(lList); // Compile-time error: 'lList' is not a subtype of Pet
        BoundedWildcards.showPet(pList);
        // BoundedWildcards.showPet(wList); // Compile-time error: 'wList' is not a subtype of Pet

        // BoundedWildcards.showWild(uList); // Compile-time error: 'uList' is not a subtype of Wild
        // BoundedWildcards.showWild(qList); // Compile-time error: 'qList' is not a subtype of Wild
        // BoundedWildcards.showWild(lList); // Compile-time error: 'lList' is not a subtype of Wild
        // BoundedWildcards.showWild(pList); // Compile-time error: 'pList' is not a subtype of Wild
        BoundedWildcards.showWild(wList);
    }
}
