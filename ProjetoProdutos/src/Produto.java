
public class Produto {
	private int    codigo;
	private String descricao;
	private double preco;
	private int    qtde;
	
	
	public Produto(int codigo, String descricao, double preco, int qtde) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
		this.qtde = qtde;
	}
	
	public void aplicarDesconto(double percentual) {
		this.preco = this.preco - this.preco * percentual /100;
	}
	
	public void diminuiEstoque() {
		this.qtde--;
	}
	
	public String exibirProduto() {
		String strProduto;
		strProduto = descricao + " R$ "+preco;
		if (qtde > 0) {
			strProduto = strProduto + "  Em Estoque!";
		}
		else {
			strProduto = strProduto + "  INDISPONIVEL";
		}
		return strProduto;
				
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQtde() {
		return qtde;
	}
}
