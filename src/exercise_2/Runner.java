package exercise_2;

public class Runner implements Runnable {
    int num;

    public Runner (int numberOfThreads){

        num = numberOfThreads;
    }

    public void run(){
        try {
            for (int i = 1; i <= num ; i++) {
                System.out.println("Hallo, jeg hedder Thread #"+i);
            }

        }catch (Exception e){}
    }

}
