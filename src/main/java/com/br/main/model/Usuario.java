package com.br.main.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Usuario {

    @Override
	public String toString() {
		return "Usuario [id=" + id + ", login=" + login + ", senha=" + senha + ", nome=" + nome + ", ultimoAcesso="
				+ ultimoAcesso + ", dominio=" + dominio + ", configuracao=" + configuracao + "]";
	}

	@Id
    private Integer id;

    private String login;

    private String senha;

    private String nome;

    private LocalDateTime ultimoAcesso;

    @ManyToOne
    private Dominio dominio;

    @OneToOne(mappedBy = "usuario")
    private Configuracao configuracao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public LocalDateTime getUltimoAcesso() {
        return ultimoAcesso;
    }

    public void setUltimoAcesso(LocalDateTime ultimoAcesso) {
        this.ultimoAcesso = ultimoAcesso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Dominio getDominio() {
        return dominio;
    }

    public void setDominio(Dominio dominio) {
        this.dominio = dominio;
    }

//    public Configuracao getConfiguracao() {
//        return configuracao;
//    }
//
//    public void setConfiguracao(Configuracao configuracao) {
//        this.configuracao = configuracao;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        return id.equals(usuario.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
    
    
}
