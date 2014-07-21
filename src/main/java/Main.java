
import java.util.*;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * por Tomás Abril
 */
public class Main
{
    public static void main(String[] args) 
    {
        ArrayList<Jogador> time = new ArrayList<>();
        time.add(new Jogador (1, "Primeiro"));
        time.add(new Jogador (2, "Cuadrado"));
        time.add(new Jogador (3, "Terc"));
        time.add(new Jogador (5, "Shwazznegger"));
        time.add(new Jogador (4, "Neymar"));
     
        Collections.sort(time);
    }
}
