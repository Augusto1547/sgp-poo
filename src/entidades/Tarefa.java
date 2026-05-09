package entidades;

import enums.PrioridadeTarefa;
import enums.StatusTarefa;
import java.time.LocalDate;

public class Tarefa {

    private Long id;
    private String titulo;
    private String descricao;
    private LocalDate dataCriacao;
    private LocalDate dataConclusao;
    private PrioridadeTarefa prioridade;
    private StatusTarefa status;
    private Usuario usuario;
    private Projeto projeto;

    public Tarefa() {

    }

    public Tarefa(Long id, String titulo, String descricao, LocalDate dataCriacao,
            LocalDate dataConclusao, PrioridadeTarefa prioridade,
            StatusTarefa status, Usuario usuario, Projeto projeto) {

    }

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return String return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return LocalDate return the dataCriacao
     */
    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    /**
     * @param dataCriacao the dataCriacao to set
     */
    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    /**
     * @return LocalDate return the dataConclusao
     */
    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    /**
     * @param dataConclusao the dataConclusao to set
     */
    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    /**
     * @return PrioridadeTarefa return the prioridade
     */
    public PrioridadeTarefa getPrioridade() {
        return prioridade;
    }

    /**
     * @param prioridade the prioridade to set
     */
    public void setPrioridade(PrioridadeTarefa prioridade) {
        this.prioridade = prioridade;
    }

    /**
     * @return StatusTarefa return the status
     */
    public StatusTarefa getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(StatusTarefa status) {
        this.status = status;
    }

    /**
     * @return Usuario return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return Projeto return the projeto
     */
    public Projeto getProjeto() {
        return projeto;
    }

    /**
     * @param projeto the projeto to set
     */
    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

}