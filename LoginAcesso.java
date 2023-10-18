package challenge2023;

import java.util.Scanner;

public class LoginAcesso {
    private int ID;
    private int IDUsuario;
    private String nivelAcesso;
    private String ipAcesso;
    private String dataHoraAcesso;

    public LoginAcesso(int ID, int IDUsuario, String nivelAcesso, String ipAcesso, String dataHoraAcesso) {
        this.ID = ID;
        this.IDUsuario = IDUsuario;
        this.nivelAcesso = nivelAcesso;
        this.ipAcesso = ipAcesso;
        this.dataHoraAcesso = dataHoraAcesso;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public String getIpAcesso() {
        return ipAcesso;
    }

    public void setIpAcesso(String ipAcesso) {
        this.ipAcesso = ipAcesso;
    }

    public String getDataHoraAcesso() {
        return dataHoraAcesso;
    }

    public void setDataHoraAcesso(String dataHoraAcesso) {
        this.dataHoraAcesso = dataHoraAcesso;
    }

    // Validar o login no site
    public void registrarAcessoSistema() {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Digite seu e-mail: ");
        String email = scanner.next();
        
        System.out.println("Digite sua senha: ");
        String senha = scanner.next();
    	
    	System.out.println("Usuário logado com sucesso! ");
    }
}