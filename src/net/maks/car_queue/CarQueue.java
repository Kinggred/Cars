package net.maks.car_queue;

import net.maks.cars.Car;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class CarQueue {
    Queue<Car> queued_cars;

    public CarQueue(Queue<Car> car_queue) {
        this.queued_cars = car_queue;
    }

    public void PrintQueue() {
        Queue car_queue = this.queued_cars;
        while(car_queue.peek() != null ) {
            System.out.println(car_queue.poll());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
    }
}
