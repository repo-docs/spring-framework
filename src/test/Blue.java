package test;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Blue implements Color {
    @Override
    public String getColor() {
        return "The color is Blue";
    }
}
