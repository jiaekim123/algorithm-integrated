//package effectivejava;
//
//import java.io.FileInputStream;
//import java.lang.ref.Cleaner;
//import java.util.concurrent.ThreadPoolExecutor;
//
//public class Restaurant implements AutoCloseable {
//    private static final Cleaner cleaner = Cleaner.create();
//
//    private static class Table implements Runnable {
//        int cups; // 치워야 하는 컵
//        int plates; // 치워야 하는 접시
//
//        Table (int cups, int plates) {
//            this.cups = cups;
//            this.plates = plates;
//        }
//
//        @Override public void run() {
//            System.out.println("자리 정리중...");
//            this.cups = 0;
//            this.plates = 0;
//        }
//
//    }
//
//    private final Table table;
//
//    private final Cleaner.Cleanable cleanable;
//
//    public Restaurant (int cups, int plates) {
//        table = new Table(cups, plates);
//        cleanable = cleaner.register(this, table);
//    }
//    @Override
//    public void close() throws Exception {
//        cleanable.clean();
//    }
//}
