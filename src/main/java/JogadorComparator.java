
import java.util.Comparator;

/*

 JogadorComparator que implementa a interface Comparator<Jogador>
 */
/**
 *
 * @author tomas abril
 */
public class JogadorComparator implements Comparator<Jogador> {

    public boolean crescente = true;
    public boolean alfabetica = false;

    public JogadorComparator(boolean ordem, boolean alfa) {
        this.crescente = ordem;
        this.alfabetica = alfa;
    }

    @Override
    public int compare(Jogador o1, Jogador o2) {
        if (alfabetica == false) {
            if (crescente == true) {
                return o1.numero - o2.numero;
            } else {
                return o2.numero - o1.numero;
            }
        }
        if (alfabetica == true) {
            if (crescente == true) {
                int tam;
                if (o1.nome.length() < o2.nome.length()) {
                    tam = o1.nome.length();
                } else {
                    tam = o2.nome.length();
                }
                for (int i = 0; i < tam; i++) {
                    return (o1.nome.charAt(i) > o2.nome.charAt(i)) ? 1 : -1;
                }
            }
        }

    }

}
