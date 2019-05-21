import org.springframework.context.annotation.Bean;

public class DivideOperation implements MathOpration {
    @Override
    public double operate(double l, double r) {
        return l / r;
    }
}
