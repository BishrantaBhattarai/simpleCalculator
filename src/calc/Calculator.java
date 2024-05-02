package calc;

public class Calculator {

    private char operator;

    private double numberOne;

    private double numberTwo;

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator){
        this.operator=operator;
    }


    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }


    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }

    public double getNumberOne() {
        return numberOne;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public double addition(){
        return numberOne+numberTwo;
    }

    public double subtraction(){
        return numberOne-numberTwo;
    }

    public double multiplication(){
        return numberOne*numberTwo;
    }

    public double modulus(){
        return numberOne%numberTwo;
    }

    public double division(){
        return numberOne/numberTwo;
    }


}
