//package effectivejava;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class RestaurantTest {
//    @Test
//    void quickManager() throws Exception {
//        try (Restaurant restaurant = new Restaurant(4, 4)){
//            System.out.println("즐거운 청소 시작!");
//        } finally {
//            System.out.println("청소 완료!");
//        }
//    }
//
//    @Test
//    void lazyManager() throws Exception {
//        new Restaurant(4, 4);
//        System.out.println("언젠간 하지 뭐..");
//    }
//}