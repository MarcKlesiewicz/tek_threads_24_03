package exercise_1;

public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Stuff("8",6));
        Thread t2 = new Thread(new Stuff("1", 3));
        Thread t3 = new Thread(new Stuff("2", 12));
        Thread t4 = new Thread(new Stuff("5", 9));


        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
