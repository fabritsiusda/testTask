public class FactorialTask {

    private int r, m;
    private int min, middle;
    private double factorialMin = 1.0, factorialMax = 1., factorialMiddle = 1.;

    public FactorialTask(int r, int m) {
        this.r = r;
        this.m = m;
    }

    public double calculate(){

        if (r > (m - r)){
            min = m - r;
            middle = r;
        } else {
            min = r;
            middle = m - r;
        }

        factorialMax = factorial(1);

        return factorialMax / (factorialMin * factorialMiddle);
    }

    private double factorial(int f){

        if (f <= middle) {
            factorialMiddle *= f;
            if (f <= min)
                factorialMin *= f;
        }
        return (f == m) ? f : f * factorial(f + 1);
    }


}
