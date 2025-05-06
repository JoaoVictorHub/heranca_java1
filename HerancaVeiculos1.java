class Veiculo { // Classe Pai
    protected String nome; // Atributo que armazena o nome do veículo
    
    public Veiculo(String nome) {
        this.nome = nome; // Contrutor que inicia o nome do veículo
    }
    public void fazerSom() { // Método que define um comportamento
        System.out.println("Som de um veículo qualquer ao acelerar.");
    }
    public String getNome() { // Método que retorna o nome do veículo
        return nome;
    }
}

class Carro extends Veiculo { // Classe Filha que herda características da Classe Pai (Veiculo)
    public Carro(String nome) {
        super(nome); // Chama o construtor da Classe Pai
    }
    @Override // Sobrescreve o método da Classe Pai
    public void fazerSom() {
        System.out.println("Meu carro faz 'vrom vrom' ao acelerar!");
    }
}

class Moto extends Veiculo { // Classe Filha que herda características da Classe Pai (Veiculo)
    public Moto(String nome) {
        super(nome); // Chama o construtor da Classe Pai
    }
    @Override // Sobrescreve o método da Classe Pai
    public void fazerSom() {
        System.out.println("Minha moto faz 'van van' ao acelerar!");
    }
}

public class HerancaVeiculos1 { // Classe Principal que executa o programa Java
    public static void main(String[] args) { // Cria instâncias das classes Carro e Moto, cada um com um nome específico
        Carro meuCarro = new Carro("Ford Ranger");
        Moto minhaMoto = new Moto("Honda Biz");
        
        System.out.println("O modelo do meu carro é: " + meuCarro.getNome());
        meuCarro.fazerSom();
        
        System.out.println("\nO modelo da minha moto é: " + minhaMoto.getNome());
        minhaMoto.fazerSom();
    }
}