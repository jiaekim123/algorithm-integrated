package effectivejava.item24;

public class TestThread {
    public static void main(String[] args) {
        Thread goodNightThread = new Thread(() -> {
            try {
                for (int i = 0; i <10; i++){
                    Thread.sleep(1000);
                    System.out.println("양 " + i + "마리...");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        goodNightThread.start();
    }
}
