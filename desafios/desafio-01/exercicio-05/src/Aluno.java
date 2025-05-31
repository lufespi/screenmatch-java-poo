public class Aluno {
    String nome;
    int idade;

    void exibirInformacoes() {
        String fichaAluno = String.format("""
                Nome do Aluno: %s
                Idade: %d
                """, nome, idade);
        System.out.println(fichaAluno);
    }
}
