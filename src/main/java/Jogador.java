/**
*
* @author Tomas Abril
*/
public class Jogador {
    private int numero;
    private String nome;

    public Jogador(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return numero + " - " + nome;
    }
}