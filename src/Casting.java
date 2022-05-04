public class Casting {

    public static void main(String[] args) {
        double DoubleValue = 112.35;
        System.out.println("Double: " + DoubleValue);

        int integer = (int)DoubleValue;
        System.out.println("Int: " + integer);

        String data = "49";
        System.out.println("The String value is: " + data);
        int num = Integer.parseInt(data);
        System.out.println("The integer value is: " + num);

    }
}
