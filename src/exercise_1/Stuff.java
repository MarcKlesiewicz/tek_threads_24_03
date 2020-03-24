package exercise_1;

public class Stuff implements Runnable {
    String name;
    int time;

    public Stuff(String num, int sleep){
        name = num;
        time = sleep*1000;

    }

    public void run(){
        try{
            Thread.sleep(time);
            System.out.println(name);

        }catch (Exception e){ }
    }

}
