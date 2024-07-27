import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Classe abstrata Conteudo
public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    // Getters e Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}

// Classe Curso herdando de Conteudo
public class Curso extends Conteudo {
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    // Getters e Setters
    public int getCargaHoraria() { return cargaHoraria; }
    public void setCargaHoraria(int cargaHoraria) { this.cargaHoraria = cargaHoraria; }
}

// Classe Mentoria herdando de Conteudo
public class Mentoria extends Conteudo {
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    // Getters e Setters
    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }
}

// Classe Bootcamp
public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private List<Curso> cursos = new ArrayList<>();
    private List<Mentoria> mentorias = new ArrayList<>();
    private List<Dev> devsInscritos = new ArrayList<>();

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public List<Curso> getCursos() { return cursos; }
    public List<Mentoria> getMentorias() { return mentorias; }
    public List<Dev> getDevsInscritos() { return devsInscritos; }
}

// Classe Dev
public class Dev {
    private String nome;
    private Set<Curso> cursosInscritos = new HashSet<>();
    private Set<Curso> cursosConcluidos = new HashSet<>();

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Set<Curso> getCursosInscritos() { return cursosInscritos; }
    public Set<Curso> getCursosConcluidos() { return cursosConcluidos; }

    // Métodos para inscrever e concluir cursos
    public void inscreverCurso(Curso curso) {
        this.cursosInscritos.add(curso);
    }

    public void concluirCurso(Curso curso) {
        this.cursosInscritos.remove(curso);
        this.cursosConcluidos.add(curso);
    }
}

// Classe Main para testar o código
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java Básico");
        curso1.setDescricao("Curso introdutório de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java Avançado");
        curso2.setDescricao("Curso avançado de Java");
        curso2.setCargaHoraria(16);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria sobre Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getCursos().add(curso1);
        bootcamp.getCursos().add(curso2);
        bootcamp.getMentorias().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("João");
        dev.inscreverCurso(curso1);
        dev.inscreverCurso(curso2);

        System.out.println("Cursos inscritos de João: " + dev.getCursosInscritos());
        dev.concluirCurso(curso1);
        System.out.println("Cursos concluídos de João: " + dev.getCursosConcluidos());
    }
}
