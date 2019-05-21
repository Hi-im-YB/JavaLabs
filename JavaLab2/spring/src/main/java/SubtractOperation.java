import org.springframework.context.annotation.Bean;

public class SubtractOperation implements MathOpration {
    @Override
    public double operate(double l, double r) {
        return l - r;
    }
}