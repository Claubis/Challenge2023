package challenge2023;

import java.util.Scanner;

public class IdiomaInteracao {
    private int ID_usuario;
    private String idiomaSelecionado;
    private int ID_idioma;

    public IdiomaInteracao() {
        this.ID_usuario = ID_usuario;
        this.idiomaSelecionado = idiomaSelecionado;
    }

    public String getIdiomaSelecionado() {
        return idiomaSelecionado;
    }

    public void setIdiomaSelecionado(String idiomaSelecionado) {
        this.idiomaSelecionado = idiomaSelecionado;
    }

    public int getID_usuario() {
        return ID_usuario;
        
        
    }
    
    

    public int getID_idioma() {
		return ID_idioma;
	}

	public void setID_idioma(int iD_idioma) {
		ID_idioma = iD_idioma;
	}

	public void setID_usuario(int ID_usuario) {
        this.ID_usuario = ID_usuario;
    }

    public void selecionarIdioma() {

        System.out.println("Selecione um dos idiomas abaixo: (0) Português, (1) Inglês, (2) Espanhol, (3) Francês, (4) Alemão");
        
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        
        if(opcao == 0) {
        	System.out.println("Idioma Portugûes selecionado");
        }else if(opcao == 1) {
        	System.out.println("Idioma Inglês selecionado");
        }else if(opcao == 2) {
        	System.out.println("Idioma Espanhol selecionado");
        }else if(opcao == 3) {
        	System.out.println("Idioma Francês selecionado");
        }else if(opcao == 4) {
        	System.out.println("Idioma Alemão selecionado");
        }else {
        	System.out.println("Opção inválida!");
        }
    	
    }

    public String obterIdioma(int usuarioID) {
    	this.ID_usuario = ID_usuario;
    	
		return idiomaSelecionado;
        
    }
}
