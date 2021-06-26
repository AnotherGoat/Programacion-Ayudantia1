public class Calculadora {

    // Atributos
    private int num1, num2;

    // Constructor
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Métodos
    public int sumar(){
        return num1+num2;
    }

    public int restar(){
        return num1-num2;
    }

    public int multiplicar(){
        return num1*num2;
    }

    public double dividir(){
        return ((double)num1/num2);
    }

    public double potencia(){
        return Math.pow(num1,num2);
    }

    // Getters y Setters
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
