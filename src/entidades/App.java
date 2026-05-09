package entidades;

import enums.PrioridadeTarefa;
import enums.StatusProjeto;
import enums.StatusTarefa;
import enums.StatusUsuario;
import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNome("Ana Carolina de Souza");
        usuario.setCpf("284.389.270-84");
        usuario.setEmail("ana@gmail.com");
        usuario.setSenha("123");
        usuario.setStatus(StatusUsuario.ATIVO);

        // Instanciando objeto da classe Projeto
        Projeto projeto = new Projeto();

        projeto.setId(1L);
        projeto.setNome("Sistema de Gestão de Projetos (SGP)");
        projeto.setDataInicio(LocalDate.of(2026, 5, 9));
        projeto.setStatus(StatusProjeto.ATIVO);
        projeto.setResponsavel(usuario);

        // Instanciando objeto da classe Tarefa
        Tarefa tarefa = new Tarefa();

        tarefa.setId(1L);
        tarefa.setTitulo("Criação das entidades do sistema");
        tarefa.setDataCriacao(LocalDate.now());
        tarefa.setPrioridade(PrioridadeTarefa.ALTA);
        tarefa.setStatus(StatusTarefa.CONCLUIDA);
        tarefa.setProjeto(projeto);
        tarefa.setUsuario(usuario);

    }
}