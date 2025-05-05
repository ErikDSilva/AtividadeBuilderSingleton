package com.mycompany.app.builderSingleton;

public class PerfilBuilder {
    private String nome;
    private String email;
    private int idade;

    public PerfilBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public PerfilBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public PerfilBuilder setIdade(int idade) {
        this.idade = idade;
        return this;
    }

    public Perfil build() {
        Perfil perfil = new Perfil(nome, email, idade);
        PerfilManager.getInstance().registrarPerfil(perfil); // adiciona ao singleton
        return perfil;
    }
}
