public class day15 {
    public static void main(String[] args) {

        int primitifInt = 42;
        Integer nonPrimitifInt = Integer.valueOf(primitifInt);

        double primitifDouble = 3.14;
        Double nonPrimitifDouble = Double.valueOf(primitifDouble);

        System.out.println("Tipe data primitif ke Tipe data non primitif");
        System.out.println(nonPrimitifInt);
        System.out.println(nonPrimitifDouble);

        Integer nonPrimitifInt2 = new Integer(42);
        int primitifInt2 = nonPrimitifInt2.intValue();

        Double nonPrimitifDouble2 = new Double(3.14);
        double primitifDouble2 = nonPrimitifDouble2.doubleValue();

        System.out.println("\nTipe data non primitif ke Tipe data primitif");
        System.out.println(primitifInt2);
        System.out.println(primitifDouble2);
    }
}
