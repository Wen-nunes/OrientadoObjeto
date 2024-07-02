package trabalhoArquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {
	private FileWriter arqw;
	private BufferedWriter escritor;
	private FileReader arqr;
	private BufferedReader leitor;
	public List<Produto> listProduto;
	public String nomeArquivo;
	
	public Arquivo(String nomeArquivo) {
		super();
		this.nomeArquivo = nomeArquivo;
		listProduto = new ArrayList<>();
	}
	
	public void gravarArquivo(Produto p) {
		try {
			arqw = new FileWriter (nomeArquivo + ".txt", true);
			escritor = new BufferedWriter(arqw);
			escritor.write(p.getCod() + ", " + p.getDescricao() + ", " + p.getPc() + ", " + p.getPv() + ", " + p.getEstoque());
			escritor.newLine();
			escritor.close();
			arqw.close();
			
			System.out.println("Produtos salvos no aquivo produtos.txt");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Produto> leArquivo(){
		System.out.println("Produtos lidos do arquivo: ");
		try {
			arqr = new FileReader(nomeArquivo + ".txt");
			leitor = new BufferedReader(arqr);
			String linha;
			while((linha = leitor.readLine()) != null) {
				String[] campos = linha.split(", ");
				
				int cod = Integer.parseInt(campos[0]);
				String descricao = campos[1];
				float pc = Float.parseFloat(campos[2].replace(",", ".")); 
				float pv = Float.parseFloat(campos[3].replace(",", ".")); 
				int estoque = Integer.parseInt(campos[4]);
				Produto produto = new Produto(cod, descricao, pc, pv, estoque);
				listProduto.add(produto);
				
			}
			leitor.close();
			arqr.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		return listProduto;
	}
	

	public void regravarArquivo(List<Produto> listprodutos) {
	    try {
	        FileWriter arqw = new FileWriter(nomeArquivo + ".txt", false);
	        BufferedWriter escritor = new BufferedWriter(arqw);
	        for (Produto p : listprodutos) {
	            escritor.write(p.getCod() + ", " + p.getDescricao() + ", " + p.getPc() + ", " + p.getPv() + ", " + p.getEstoque());
	            escritor.newLine();
	        }
	        escritor.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

}
