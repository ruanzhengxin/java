package thread;

public class Box {
    private int milk;
    private boolean state=false;
    public synchronized void getMilk() {
        if(!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("get" + milk + "milk");
        state=false;
        notifyAll();
    }

    public synchronized void putMilk(int milk) {
        if(state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk=milk;
        System.out.println("put" + milk + "milk");
        state=true;
        notifyAll();

    }
}
