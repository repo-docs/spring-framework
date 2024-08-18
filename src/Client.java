import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ReportGenerator htmlReportGenerator = context.getBean("htmlReportGenerator", HTMLReportGenerator.class);
        htmlReportGenerator.generateReport();
    }
}
