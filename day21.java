import java.math.BigDecimal;
import java.math.RoundingMode;

public class day21 {
    public static void main(String[] args) {
        BigDecimal dividend = new BigDecimal("10");
        BigDecimal divisor = new BigDecimal("4");

        BigDecimal result = dividend.divide(divisor, RoundingMode.HALF_UP);
        System.out.println("Hasil Pembagian : " + result);
    }
}
