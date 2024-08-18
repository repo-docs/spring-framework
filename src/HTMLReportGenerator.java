import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import test.Color;

public class HTMLReportGenerator implements ReportGenerator{

    @Autowired
    @Qualifier("blue")
    Color color;

    @Override
    public void generateReport() {
        System.out.println("Generating HTML Report....");
        System.out.println("Background Color is " + color.getColor());
    }
}
