public class Main {
    public static void main(String[] args) {
        double h = 0.1;
        double x = 0;
        double y = 0.2;
        for (int i = 0; i < 10; i++) {
            double k1 = h * f(x, y);
            double k2 = h * f(x + h/2, y + k1/2);
            double k3 = h * f(x + h/2, y + k2/2);
            double k4 = h * f(x + h, y + k3);
            System.out.println("x1 = "+x+", x2 = "+(x + h/2)+", x3 = "+(x + h/2)+", x4 = "+(x + h));
            System.out.println("y1 = "+y+", y2 = "+(y + k1/2)+", y3 = "+(y + k2/2)+", y4 = "+(y + k3));
            System.out.println("k1 = "+k1+", k2 = "+k2+", k3 = "+k3+", k4 = "+k4);
            System.out.println("2 * k2 = "+k2 * 2+", 2 * k3 = "+k3*2);
            y = y + (k1 + 2*k2 + 2*k3 + k4) / 6;
            x = x + h;
            System.out.println("x = " + x + ", y = " + y+"\n");
        }
    }
    public static double f(double x, double y) {
        return 0.2 * x + 3 * Math.pow(y, 2);
    }
}