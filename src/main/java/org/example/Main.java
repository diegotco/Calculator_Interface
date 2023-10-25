package org.example;

class Calc implements Calculations {

    @Override
    public void add() {
        System.out.println(x + y);
    }

    @Override
    public void subtract() {

    }

    @Override
    public void multiply() {

    }

    @Override
    public void division() {

    }
}
public class Main {
    public static void main(String[] args) {
        var addResult = new Calc();

        addResult.add();
    }
}