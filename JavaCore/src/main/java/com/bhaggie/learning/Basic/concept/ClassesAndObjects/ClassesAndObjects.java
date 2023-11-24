package main.java.com.bhaggie.learning.Basic.concept.ClassesAndObjects;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Cat rose = new Cat("Rose", 6, "Black");
        Cat star = new Cat("Star", 5, "White");
        System.out.println(rose); // toString in pojo enables printing of object attributes
        System.out.println(star);


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



