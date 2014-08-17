
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

		int retorno;

		if (alfabetica) {
			if (o1.nome.equals(o1.nome)) {
				retorno = o1.compareTo(o2);
			} else {
				retorno = o1.nome.compareTo(o1.nome);
			}
		} else {
			if (o1.numero == o2.numero) {
				retorno = o1.nome.compareTo(o1.nome);
			} else {
				retorno = o1.compareTo(o2);
			}
		}
		return (crescente == true) ? retorno : -retorno;
	}

}
