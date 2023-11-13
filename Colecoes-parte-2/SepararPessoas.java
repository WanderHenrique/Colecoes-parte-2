import java.util.ArrayList;
import java.util.List;

public class SepararPessoas {

    public static void main(String[] args) {

        // Declara as listas para armazenar as pessoas por sexo
        List<Pessoa> homens = new ArrayList<>();
        List<Pessoa> mulheres = new ArrayList<>();

        // Leitura do nome e do sexo
        String nome;
        String sexo;

        do {
            System.out.println("Digite o nome: ");
            nome = System.console().readLine();

            System.out.println("Digite o sexo (M/F): ");
            sexo = System.console().readLine().toUpperCase();

            // Adiciona a pessoa na lista apropriada
            if (sexo.equals("M")) {
                homens.add(new Pessoa(nome, sexo));
            } else if (sexo.equals("F")) {
                mulheres.add(new Pessoa(nome, sexo));
            }

        } while (!sexo.equals("FIM"));

        // Imprime as pessoas por sexo
        System.out.println("Homens:");
        for (Pessoa homem : homens) {
            System.out.println(homem);
        }

        System.out.println("Mulheres:");
        for (Pessoa mulher : mulheres) {
            System.out.println(mulher);
        }
    }

}

class Pessoa {

    private String nome;
    private String sexo;

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Sexo: " + sexo;
    }

}
