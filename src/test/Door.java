package test;

import org.springframework.stereotype.Component;

@Component
public class Door implements Furniture{
    @Override
    public String getCategory() {
        return "Door";
    }
}
