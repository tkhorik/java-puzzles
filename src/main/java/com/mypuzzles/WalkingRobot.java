package com.mypuzzles;

//    Given: Robot with two legs. Fix the template below to
//    synchronize the legs one by one: -..-left-right-left-right-.. (200 times in this example)
public class WalkingRobot {

    private final int n;

    public WalkingRobot(int n) {
        this.n = n;
    }

    public void left() {
        for (int i = 0; i < n; i++) {
            System.out.println("left");
        }
    }

    public void right() {
        for (int i = 0; i < n; i++) {
            System.out.println("right");
        }
    }

    public static void main(String[] args) {
        WalkingRobot robot = new WalkingRobot(100);
        new Thread(robot::left).start();
        new Thread(robot::right).start();
    }
}