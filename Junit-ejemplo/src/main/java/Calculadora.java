public class Calculadora {

    private int a, b;

    // Constructor
    public Calculadora(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Métodos
    public int sumar(){
        return a+b;
    }

    public int restar(){
        return a-b;
    }

    public int multiplicar(){
        return a*b;
    }

    public double dividir(){
        return ((double)a/b);
    }

    public double potencia(){
        return Math.pow(a, b);
    }

    // Getters y Setters
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
