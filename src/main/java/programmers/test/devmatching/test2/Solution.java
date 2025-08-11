package programmers.test.devmatching.test2;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int n, String[] recipes, String[] orders) {
        int answer = 0;
        Map<String, Integer> recipeMap = convertRecipeMap(recipes);
        Queue<Order> orderQueue = initOrderQueue(orders, recipeMap);

        // int[] 화구 (n개) => Cooker n개 생성
        // priorityQueue에 Cooker를 넣고, 제일 빨리 조리되는 친구를 꺼내와서 cook 메서드 호출 (order를 받아서 time을 올려주는 친구)
        // order큐가 비는 순간, Cooker Queue에서 time 값이 가장 큰 값이 답이다.

        return answer;
    }

    private Map<String, Integer> convertRecipeMap(String[] recipes) {
        Map<String, Integer> recipeMap = new HashMap<>();
        for (String recipe : recipes) {
            String[] splitString = recipe.split(" ");
            recipeMap.put(splitString[0], Integer.parseInt(splitString[1]));
        }
        return recipeMap;
    }

    private Queue<Order> initOrderQueue(String[] orders, Map<String, Integer> recipeMap) {
        Queue<Order> orderQueue = new PriorityQueue<>();
        for (String order : orders) {
            String[] splitString = order.split(" ");
            orderQueue.add(new Order(splitString[0], splitString[1], recipeMap.get(splitString[0])));
        }
        return orderQueue;
    }

    static class Order implements Comparable<Order> {
        private String menu;
        private int orderTime;
        private int recipeTime;

        public Order(String menu, String orderTime, int recipeTime) {
            this.menu = menu;
            this.orderTime = Integer.parseInt(orderTime);
            this.recipeTime = recipeTime;
        }

        @Override
        public int compareTo(Order o) {
            return this.orderTime - o.orderTime;
        }

        public String getMenu() {
            return menu;
        }

        public int getOrderTime() {
            return orderTime;
        }

        public int getRecipeTime() {
            return recipeTime;
        }
    }

    static class Cooker implements Comparable<Cooker> {
        private int time;

        public void cook(Order order) {
            this.time = this.time + order.getRecipeTime();
        }

        @Override
        public int compareTo(Cooker o) {
            return this.time - o.time;
        }
    }

}