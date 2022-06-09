package com.company;

class Point{

    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return x;
    }
    public void setX(int number){
        this.x = number;
    }
    public int getY(){
        return y;
    }
    public void setY(int number){
        this.y = number;
    }


    public Point getCoordinates(){
        return new Point(this.x,this.y);
    }
    public void setCoordinates(int x, int y){
        this.x = x;
        this.y = y;
    }
}

