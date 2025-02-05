package main.java.com.bhaggie.coreBasics.coreConcepts.classesAndObjects;

import main.java.com.bhaggie.coreBasics.coreUtils.model.Cat;
import main.java.com.bhaggie.coreBasics.coreUtils.model.Gender;
import main.java.com.bhaggie.coreBasics.coreUtils.model.Person;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Cat rose = new Cat("Rose", 6, "Black");
        Cat star = new Cat("Star", 5, "White");
        System.out.println(rose); // toString in pojo enables printing of object attributes
        System.out.println(star);

        // Understanding difference between "==" and ".equals()" for comparing an object

        Cat rose1 = new Cat("Rose", 6, "Black");
        Cat rose2 = new Cat("Rose", 6, "Black");

        System.out.println(rose1 == rose2);  // returns false as it compares the reference values of both the objects
        System.out.println(rose1.equals(rose2)); // returns false if it refers equals method from object class, else returns true if we have an override for equals method in Cat class


        Cat[] cats = {rose1, rose2};
        Person alex = new Person("Alex", "Cortana", Gender.MALE, cats);
        System.out.println(alex);



        //        Cat rose = new Cat();
        //        rose.setName("Rose");
        //        rose.meow();
        //        System.out.println(rose.getName());
        //
        //        Cat star = new Cat();
        //        star.setName("Star");
        //        star.meow();
        //        System.out.println(star.getName());

    }
}

//    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.meow();
//    }
//    static class Cat {
//        String name;
//        void meow() {
//            System.out.println(name + ": meow...");
//        }
//    }
//}


//    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.name = "Rose";
//        cat.meow();
//    }
//    static class Cat {
//        String name;
//        void meow() {
//            System.out.println(name + ": meow...");
//        }
//    }
//}


//    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.meow();
//    }
//    static class Cat {
//        String name = "Rose";
//        void meow() {
//            System.out.println(name + ": meow...");
//        }
//    }
//}



