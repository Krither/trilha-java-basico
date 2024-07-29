public class Singleton {
    // Instância única da classe
    private static Singleton instanciaUnica;

    // Construtor privado para evitar instanciamento externo
    private Singleton() {
        // Inicialização da instância
    }

    // Método público para fornecer acesso à instância única
    public static Singleton getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Singleton();
        }
        return instanciaUnica;
    }

    // Outros métodos da classe
    public void mostrarMensagem() {
        System.out.println("Padrão Singleton em ação!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Obtendo a instância única da classe Singleton
        Singleton singleton = Singleton.getInstancia();
        
        // Chamando um método da instância Singleton
        singleton.mostrarMensagem();
    }
}
