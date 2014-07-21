
import java.util.Comparator;

/*

JogadorComparator que implementa a interface Comparator<Jogador>
 */

/**
 *
 * @author tomas abril
 */
public class JogadorComparator implements Comparator<Jogador> {

    public final boolean ordem = true;
    public final boolean alfabetica = false;
    
    @Override
    public int compare(Jogador o1, Jogador o2) {
        return o1.numero - o2.numero;
    }
    
}
