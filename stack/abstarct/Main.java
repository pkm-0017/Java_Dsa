// abstract class Employee {

//     String name;

//     Employee(String name) {
//         this.name = name;
//     }

//     abstract void salary();
// }

// class Manager extends Employee {

//     Manager(String name) {
//         super(name);
//     }

//     void salary() {
//         System.out.println(name + " Salary = 50000");
//     }
// }

// class Developer extends Employee {

//     Developer(String name) {
//         super(name);
//     }

//     void salary() {
//         System.out.println(name + " Salary = 40000");
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         Employee e1 = new Manager("Pratik");
//         Employee e2 = new Developer("Rahul");

//         e1.salary();
//         e2.salary();
//     }
// }


abstract class Parent {

    abstract void career();

    abstract void partner();
}

class Son extends Parent {

    @Override
    void career() {
        System.out.println("I want to become a Software Engineer");
    }

    @Override
    void partner() {
        System.out.println("I want a supportive partner");
    }
}

class Daughter extends Parent {

    @Override
    void career() {
        System.out.println("I want to become a Doctor");
    }

    @Override
    void partner() {
        System.out.println("I want an intelligent partner");
    }
}

public class Main {

    public static void main(String[] args) {

        Parent son = new Son();
        Parent daughter = new Daughter();

        son.career();
        son.partner();

        System.out.println();

        daughter.career();
        daughter.partner();
    }
}