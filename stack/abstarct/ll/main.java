public class main {

    public static void main(String[] args) {

        ll list = new ll();

        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(10);

        list.insertLast(40);
        list.insertLast(50);

        list.display();

        System.out.println("Size = " + list.getSize());
    }
}