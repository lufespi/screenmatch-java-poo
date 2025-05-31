public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Creta";
        carro1.ano = 2023;
        carro1.cor = "Branco";

        carro1.exibirFichaTecnica();

        System.out.println("Idade do carro: " + carro1.idadeCarro() + " anos");
    }
}
