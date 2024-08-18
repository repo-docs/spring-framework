package test;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Red implements Color{
    @Override
    public String getColor() {
        return "The color is RED";
    }
}
