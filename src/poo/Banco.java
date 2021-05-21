package poo;

public class Banco {
    // constante que qualquer um de qualquer lugar pode consultar
    public static int LIMITE_CONTAS_CORRENTE = 10;

    // 1 principio de OO: TODOS os atributos sao PRIVADOS
    private String nome;
    private int totalClientes;
    private float totalDepositos;
    
    // definir um metodo construtor 
    // Quando criar um metodo construtor ?
    // o que é essencial para .... construir (construtor) um banco ? 
    public Banco(String nome, float totalDepositos ) {
    	// duas maneiras ...
    	this.nome = nome; // normalmente se faz assim
    	setTotalDepositos(totalDepositos); // nao tão comum, mas totalmente certo.
    }
    
    // eu posso ter mais de 1 metodo construtor ?
    public Banco(String nome) { // essa linha é uma assinatura do metodo
    	this.nome = nome;
    }
    // assinatura dos metodos construtores sao diferentes ? SIM
    // metodos com mesmo nome, mas com argumentos diferentes == polimorfismo
    // nesse caso ----> sobrecarga de metodos
    
    
    // ENCAPSULAMENTO: get e set
    // TODOS os METODOS SAO PUBLICOS (attr)
    // camelCase
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTotalClientes(int totalClientes) {
        this.totalClientes = totalClientes;
    }

    public int getTotalClientes() {
        return  this.totalClientes;
    }

    public void setTotalDepositos( float totalDepositos) {
        this.totalDepositos = totalDepositos;
    }

    public float getTotalDepositos() {
        return this.totalDepositos;
    }

}
