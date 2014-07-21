/**
*
* @author Tomas Abril
*/
public class Jogador {
    final public int numero;
    final public String nome;

    public Jogador(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return numero + " - " + nome;
    }
}