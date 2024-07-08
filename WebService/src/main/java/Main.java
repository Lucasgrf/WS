import com.webservices.service.Calculator;
import com.webservices.service.CalculatorImplements;
import jakarta.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        CalculatorImplements calculator = new CalculatorImplements();
        Endpoint.publish("http://localhost/8085/service/calculator", calculator);
        System.out.println("Web Service is ready!");
    }
}
