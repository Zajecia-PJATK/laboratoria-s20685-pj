package com.company;

interface Movable {
    void moveUP();

    void moveDown();

    void moveLeft();

    void moveRight();
}

class MovablePoint implements Movable {
    public double x, y, xSpeed, ySpeed;

    public MovablePoint(double x, double y, double xSpeed, double ySpeed) {
        this.x = 0;
        this.y = 0;
        this.xSpeed = 1;
        this.ySpeed = 1;
    }

    public void moveUP() {
        y -= ySpeed;
    }

    public void moveDown() {
        y += ySpeed;
    }

    public void moveLeft() {
        x -= xSpeed;
    }

    public void moveRight() {
        x += xSpeed;
    }
    @Override
    public String toString()
    {
        return "Pozycja Punktu: [X: " + x + " Y: " + y + "]";
    }

}

public class Main{
    public static void main(String[] args)
    {
        MovablePoint m1 = new MovablePoint(1, 1, 2 , 2);
        m1.moveUP();
        System.out.println(m1);
        m1.moveUP();
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);
    }

}