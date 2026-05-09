package entidades;

import enums.StatusUsuario;

public class Usuario {

    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private StatusUsuario status;

    public Usuario() {

    }

    public Usuario(Long id, String nome, String cfp, String email, String senha,
            StatusUsuario status) {

        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.status = status;

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
     * @return String return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return String return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return StatusUsuario return the status
     */
    public StatusUsuario getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(StatusUsuario status) {
        this.status = status;
    }

}