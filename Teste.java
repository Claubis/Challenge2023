package challenge2023;

public class Teste {
	public static void main(String[] args) {
		
		// Criar um usuário
		Usuario usuario1 = new Usuario(0, "Claudio","553472@fiap.com.br","123456","google");
		
		// Registrar o usuário
		usuario1.registrarNovoUsuario();
		
		// Consultar dados cadastrados
		System.out.println(usuario1.getID());
		System.out.println(usuario1.getNome());
		System.out.println(usuario1.getEmail());
		System.out.println(usuario1.getSenha());
		System.out.println("---------------------------");
		
		// Cadastrar as váriaveis de login de um usuário (funcionário)
		
		LoginAcesso login1 = new LoginAcesso(0,usuario1.getID(),"basico","123456","2023-10-17T08:07:00");
		
		System.out.println("Consultar os dados cadastrados");
		System.out.println("Id do usuário: " + login1.getIDUsuario());
		System.out.println("Nível de acesso: " +login1.getNivelAcesso());
		System.out.println("IP cadastrado: " +login1.getIpAcesso());
		System.out.println("Data e hora de acesso: " +login1.getDataHoraAcesso());
		System.out.println("---------------------------");
		
		// Realizar o acesso no sistema
		login1.registrarAcessoSistema();
		
		System.out.println("---------------------------");
		
		IdiomaInteracao idioma1 = new IdiomaInteracao();
		
		idioma1.getIdiomaSelecionado();
		System.out.println(idioma1.getID_idioma());
		idioma1.selecionarIdioma();
		}
		
	}

