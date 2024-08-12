import modelo.ContaAReceber;
import modelo.Pagamento;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        ContaAReceber cr= new ContaAReceber(1800,"Anna Clara");
        System.out.println(cr);
        System.out.println(cr.getFonte());
        try {
            Pagamento p1=new Pagamento(200,LocalDate.now());
            cr.addPagamento(p1);
            Pagamento p2=new Pagamento(500,LocalDate.now());
            cr.addPagamento(p2);
            System.out.println(p1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}