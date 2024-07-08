import com.service.client.Calculator;
import com.service.client.ServerUtil;
import jakarta.xml.ws.Service;
public class Main {
    static double result = 0;

    public static void main(String[] args) {
        Service service = ServerUtil.getConnection();
        if (service != null) {
            Calculator calculator = service.getPort(Calculator.class);
            double a = 5, b = 4;
            //Adição
            System.out.println("Valores para adição: " + a + " | " + b);
            result = calculator.add(a, b);
            System.out.println("Resultado: " + result);

            //Subtração
            System.out.println("Valores para subtração: " + a + " | " + b);
            result = calculator.sub(a, b);
            System.out.println("Resultado: " + result);

            //Divisão
            System.out.println("Valores para divisão: " + a + " | " + b);
            result = calculator.div(a, b);
            System.out.println("Resultado: " + result);

            //Multiplicação
            System.out.println("Valores para multiplicação: " + a + " | " + b);
            result = calculator.multi(a, b);
            System.out.println("Resultado: " + result);

        }
    }
}