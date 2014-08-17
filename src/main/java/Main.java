
import java.util.*;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná DAINF - Departamento
 * Acadêmico de Informática IF62C - Fundamentos de Programação 2
 *
 * Template de projeto de programa Java usando Maven. por Tomás Abril
 */
public class Main {

	public static void main(String[] args) {

		ArrayList<Jogador> time = new ArrayList<>();

		time.add(new Jogador(1, "Primeiro"));
		time.add(new Jogador(2, "Cuadrado"));
		time.add(new Jogador(3, "Terc"));
		time.add(new Jogador(5, "Shwazznegger"));
		time.add(new Jogador(4, "Neymar"));

//		for (Jogador i : time) {
//			System.out.println(i);
//		}
		JogadorComparator comparador = new JogadorComparator(true, false);
		Collections.sort(time, comparador);

		String format = "%3d %-20s";
		System.out.println("Numero Nome");
		for (Jogador i : time) {
			System.out.println(String.format(format, i.numero, i.nome));
		}

		int posicao = Collections.binarySearch(time, new Jogador(4, "Neymar"),
			comparador);
		if (posicao >= 0) {
			System.out.println("Encontrado:");
			System.out.println(String.format(format, time.get(posicao).numero,
				time.get(posicao).nome));
		} else {
			System.out.println("Nao encontrado: " + posicao);
		}
	}
}
