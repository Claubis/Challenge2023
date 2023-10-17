package projetoChallenge;

public class Usuario {
    private int ID;
    private String nome;
    private String email;
    private String senha;
    private String plataforma;

    public Usuario(int ID, String nome, String email, String senha, String plataforma) {
        this.ID = ID;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.plataforma = plataforma;
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

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void autenticarUsuario() {
        // Implementar do método autenticarUsuario
    }

    public void registrarNovoUsuario() {
        // Implementar do método registrarNovoUsuario
    }

    public void guardarDataHora() {
        // Implementar do método guardarDataHora
    }
}
