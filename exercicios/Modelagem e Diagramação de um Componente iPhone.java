// Classe ReprodutorMusical
class ReprodutorMusical {
    public void tocar() {
        // Lógica para iniciar a reprodução da música
        System.out.println("Iniciando reprodução da música...");
    }

    public void pausar() {
        // Lógica para pausar a reprodução da música
        System.out.println("Pausando reprodução da música...");
    }

    public void selecionarMusica(String musica) {
        // Lógica para selecionar uma música específica
        System.out.println("Selecionando a música: " + musica);
    }
}

// Classe AparelhoTelefonico
class AparelhoTelefonico {
    public void ligar(String numero) {
        // Lógica para realizar uma chamada
        System.out.println("Chamando o número: " + numero);
    }

    public void atender() {
        // Lógica para atender uma chamada
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        // Lógica para iniciar o correio de voz
        System.out.println("Iniciando correio de voz...");
    }
}

// Classe NavegadorInternet
class NavegadorInternet {
    public void exibirPagina(String url) {
        // Lógica para abrir uma página da web
        System.out.println("Abrindo página: " + url);
    }

    public void adicionarNovaAba() {
        // Lógica para criar uma nova aba no navegador
        System.out.println("Criando nova aba...");
    }

    public void atualizarPagina() {
        // Lógica para atualizar a página atual
        System.out.println("Atualizando página...");
    }
}

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        reprodutor.tocar();
        reprodutor.selecionarMusica("Bohemian Rhapsody");

        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligar("+1 123-456-7890");
        telefone.atender();

        NavegadorInternet navegador = new NavegadorInternet();
        navegador.exibirPagina("https://www.example.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
