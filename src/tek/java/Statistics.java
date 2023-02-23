package tek.java;

public class Statistics {

    private int nSamples;
    private double min = Double.MAX_VALUE, max= Double.MIN_VALUE, sum;

    public Statistics(double[] values){
        for(int i=0; i<values.length;++i){
            double v = values[i];
            if(v<min) min = v;
            if(v>max) max = v;
            sum+=v;
            nSamples++;
        }
    }

    public int getnSamples() {
        return nSamples;
    }

    public void setnSamples(int nSamples) {
        this.nSamples = nSamples;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
