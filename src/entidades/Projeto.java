package entidades;

import enums.StatusProjeto;
import java.time.LocalDate;

public class Projeto {

    private Long id;
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataConclusao;
    private StatusProjeto status;
    private Usuario responsavel;

    public Projeto() {

    }

    public Projeto(Long id, String nome, String descricao, LocalDate dataInicio,
            LocalDate dataConclusao, StatusProjeto status, Usuario responsavel) {

        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataConclusao = dataConclusao;
        this.status = status;
        this.responsavel = responsavel;
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
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
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
     * @return LocalDate return the dataInicio
     */
    public LocalDate getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
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
     * @return StatusProjeto return the status
     */
    public StatusProjeto getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(StatusProjeto status) {
        this.status = status;
    }

    /**
     * @return Usuario return the responsavel
     */
    public Usuario getResponsavel() {
        return responsavel;
    }

    /**
     * @param responsavel the responsavel to set
     */
    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }

}