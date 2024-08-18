import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "test")
public class AppConfig {

    @Bean
    public ReportGenerator htmlReportGenerator(){
        return new HTMLReportGenerator();
    }

    @Bean
    public ReportGenerator pdfReportGenerator(){
        return new PDFReportGenerator();
    }

//    @Bean
//    public Color getColorFunction(){
//        return new Red();
//    }
}
