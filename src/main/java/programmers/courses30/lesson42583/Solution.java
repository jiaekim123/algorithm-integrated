/*
    https://programmers.co.kr/learn/courses/30/lessons/42583
    [프로그래머스][스택/큐] 다리를 달리는 트럭
 */
package programmers.courses30.lesson42583;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        Bridge bridge = new Bridge(bridge_length, weight);
        Queue<Truck> truckQueue = new LinkedList<Truck>();
        for (int truck_weight : truck_weights) {
            truckQueue.offer(new Truck(truck_weight));
        }

        while (!truckQueue.isEmpty() || !bridge.isBridgeEmpth()) {
            time++;
            bridge.removeTruck();
            bridge.addTruck(truckQueue);
            bridge.moveTruck();
        }
        return time;
    }
}

class Truck {
    private int weight;
    private int position;

    public Truck(int weight) {
        this.weight = weight;
        this.position = 0;
    }

    public void moveTruck(int position) {
        this.position += position;
    }

    public int getWeight() {
        return weight;
    }

    public int getPosition() {
        return position;
    }

    public void moveTruck() {
        ++this.position;
    }
}

class Bridge {
    private int bridgeWeight;
    private int truckWeights;
    private int bridgeLength;
    private Queue<Truck> bridgeQueue;

    public Bridge(int bridgeLength, int bridgeWeight) {
        this.bridgeLength = bridgeLength;
        this.bridgeWeight = bridgeWeight;
        this.truckWeights = 0;
        this.bridgeQueue = new LinkedList<Truck>();
    }

    public boolean addTruck(Queue<Truck> truckQueue) {
        if (!truckQueue.isEmpty() && truckQueue.peek().getWeight() + truckWeights <= bridgeWeight) {
            bridgeQueue.add(truckQueue.peek());
            truckWeights += truckQueue.poll().getWeight();
            return true;
        }
        return false;
    }

    public void removeTruck() {
        if (!bridgeQueue.isEmpty()) {
            if (bridgeQueue.peek().getPosition() == bridgeLength) {
                truckWeights -= bridgeQueue.poll().getWeight();
            }
        }
    }

    public void moveTruck() {
        for (Truck truck : bridgeQueue) {
            truck.moveTruck();
        }
    }

    public boolean isBridgeEmpth() {
        return this.bridgeQueue.isEmpty();
    }
}