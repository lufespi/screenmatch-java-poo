public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica() {
        System.out.println("Modelo do Carro: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    int idadeCarro() {
        return 2025 - ano;
    }
}
