package br.com.matheusaraujopereira.apiweb.model;

import jakarta.persistence.*;

@Entity
@Table(name = "USUARIO", schema = "API_WEB")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "TIPO", nullable = false)
    private String tipo;

    @Column(name = "PRIMEIRO_NOME", nullable = false)
    private String primeiroNome;

    @Column(name = "SOBRENOME", nullable = false)
    private String sobrenome;

    @Column(name = "ENDERECO_ID")
    private Long enderecoId;

    @Column(name = "TELEFONE")
    private String telefone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Long getEnderecoId() {
        return enderecoId;
    }

    public void setEnderecoId(Long enderecoId) {
        this.enderecoId = enderecoId;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
