import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import test.Color;
import test.Furniture;

public class HTMLReportGenerator implements ReportGenerator{

    @Autowired
    @Qualifier("blue")
    Color color;

    @Autowired
    Furniture furniture;

    @Override
    public void generateReport() {
        System.out.println("Generating HTML Report....");
        System.out.println("Background Color is " + color.getColor());
        System.out.println("The category is " + furniture.getCategory());
    }
}
