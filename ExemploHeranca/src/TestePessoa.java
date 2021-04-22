
public class TestePessoa {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.setNome("Isidro");
		p.setEmail("isidro@professorisidro.com.br");
		p.setTelefone("98765-4321");
		
		p.exibirInfo();
		
		Aluno a = new Aluno();
		a.setNumMatricula(1234);
		a.setCurso("Computacao");
		a.setNome("Jose");			// estas infos aqui vieram por conta da herança
		a.setEmail("jose@jose.com");
		a.setTelefone("91234-5678");
		a.exibirInfo();
		
	}

}
