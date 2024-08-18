import model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.EmployeeService;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ReportGenerator htmlReportGenerator = context.getBean("htmlReportGenerator", HTMLReportGenerator.class);
        htmlReportGenerator.generateReport();

        EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
        employeeService.run();

    }
}
