package myproject;

public class Straight implements FuncMath{
    double k,b;

    public Straight(double k, double b) {
        this.k = k;
        this.b = b;
    }

    @Override
    public double calc(double x) {
        return k*x + b;
    }
}
