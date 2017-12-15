package factorial;


/**
 * @author Juan Borrajo Rodriguez Nº5937
 * En esta clase se calcula un número.
 */
public class Calculo {
/**
 * El siguiente método se encarga de calcular un número.
 */
    public void calcular() {
        
        int j;
        int f;

        j=8;

        int i;
        if (j==0) {
            f=1;
        }
        else {
            f=1;
            for (i=j; i>=1; i--) {
                f=f*i;
            }
        }

        System.out.println(f);
    }
}
