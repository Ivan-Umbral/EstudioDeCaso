
package EstudioDeCaso;
import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class EntradaTeclado {
    private String entradaTeclado;

    public EntradaTeclado() {
        Scanner sc= new Scanner(System.in);
       
        this.entradaTeclado = sc.nextLine();
    }

    public String getEntradaTeclado() {
        return entradaTeclado;
    }

    public void setEntradaTeclado(String entradaTeclado) {
        this.entradaTeclado = entradaTeclado;
    }
}
