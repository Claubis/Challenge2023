package challenge2023;

import java.util.Scanner;

public class Usuario {
    private int ID;
    private String nome;
    private String email;
    private String senha;

    public Usuario(int ID, String nome, String email, String senha, String plataforma) {
        this.ID = ID;
        this.nome = nome;
        this.email = email;
        this.senha = senha;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public void autenticarUsuario() {
        // Implementar do método autenticarUsuario quando ele digitar o login e a senha.
    }

    public void registrarNovoUsuario() {
        System.out.println("Para cadastrar um novo usuário, preencha as informações abaixo: ");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite seu e-mail: ");
        String email = scanner.next();
        System.out.println("Digite sua senha: ");
        String senha = scanner.next();
        System.out.println("Usuário registrado com sucesso! ");
        System.out.println("---------------------------");
    }

    public void guardarDataHora() {
        // Implementar do método guardarDataHora - Preciso saber como chamar a hora aqui.
    }
}