package tek.java;

public class Main {
    public static void main(String[] args) {
        double[] values = {1.2, 2.3, 3.4, 4.5, 5.6,6.7};
        Statistics stats = new Statistics(values);
        System.out.println("Minimum value: " + stats.getMin());
        System.out.println("Maximum value: " + stats.getMax());
        System.out.println("Sum of values: " + stats.getSum());
        System.out.println("number of elements: " + stats.getnSamples());

}
}