package Criacao_arquivos;

import java.io.*;

public class Arquivos {
	// atributos
	private File arquivo;
	private InputStream input;
	private InputStreamReader ler_arquivo;
	private BufferedReader buffer;
	
	
	// get e sets
	public BufferedReader getBuffer() {
		return buffer;
	}
	
	public InputStream getInput() {
		return input;
	}
	public InputStreamReader getLer_arquivo() {
		return ler_arquivo;
	}
	public void setBuffer(BufferedReader buffer) {
		this.buffer = buffer;
	}
	public void setInput(InputStream input) {
		this.input = input;
	}
	public void setLer_arquivo(InputStreamReader ler_arquivo) {
		this.ler_arquivo = ler_arquivo;
	}
	
	public File getArquivo() {
		return arquivo;
	}
	
	public void setArquivo(File arquivo) {
		this.arquivo = arquivo;
	}
	
	
	// metodos
	
	public boolean Arquivo_existe(String caminho) throws FileNotFoundException{
		try { 
			
			if( getArquivo().exists()) {
				
				System.out.println(getArquivo().getName() +"existe");
				
				return true;
			} else {
				System.out.println(getArquivo().getName() +" não existe");
				
				return false;
			}
		} catch (NullPointerException e) {
			
			String mensagem = e.getMessage();
			System.out.println(mensagem);
			System.exit(0);
		}
		return false;
	}
	
	
	public File Criar_arquivo(String nome , String formato) throws IOException{		

		try {
			
			setArquivo( new File(nome));
			if (getArquivo().createNewFile()) {
				
				
				if (nome.endsWith("."+formato)) {
					getArquivo().createNewFile();
				}
			}else{
				System.out.println("O arquivo:"+ getArquivo().getName()+ " não foi encontrado");
				
			}
			
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return getArquivo();
	}
	
	
	
	public void Lendo_teclado() throws IOException {
		setInput(System.in);
		setLer_arquivo(new InputStreamReader(getInput()));
		setBuffer(new BufferedReader(getLer_arquivo()));
		String linha_arquivo = getBuffer().readLine();
		
		while(linha_arquivo != null){
				 System.out.println(linha_arquivo);
				 linha_arquivo= getBuffer().readLine();
		}
		getBuffer().close();
	}
	
	
	public void Lendo_aquivo(String arquivo_existente) throws IOException {
		setInput(new FileInputStream(arquivo_existente));
		setLer_arquivo(new InputStreamReader(getInput())); 
		setBuffer(new BufferedReader(getLer_arquivo()));
		String linha_arquivo =getBuffer().readLine();
		
		while(linha_arquivo != null){
				 System.out.println(linha_arquivo);
				 linha_arquivo= getBuffer().readLine();
		}
		getBuffer().close();
	}
	
	
	public void Criar_TXT(String nome_arquivo){
	
		try{
		setArquivo(new File(arquivo+ ".txt"));
		
		//if (nome_arquivo.endsWith(".txt")) {
			if (arquivo.exists()== true) {
				System.out.println("O arquivo "+ getArquivo().getName()+" ja existe");
			}else{
				
				if (getArquivo().createNewFile()) {
					System.out.println("arquivo foi criado");
				}else{
					System.out.println("O arquivo " + arquivo.getName() +"ja existe");
				}
			}
		//}else {
			//System.out.println("Não pode criar arquivo, somente .txt");
		//}
		
	
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
	
	
	
	
	// O metodo deleta_arquivo , exclui qualquer tipo de arquivo, deve-se colocar a extanção 
	// ele verifica se o arquivo existe , e logo em segiuida destroe
	
	public void Deleta_arquivo(String arquivo_apaga) {
		setArquivo(new File(arquivo_apaga));
		
		try {
			if (getArquivo().exists()) {
				System.out.println(getArquivo().getName()+ " existe");
				if (getArquivo().delete()) {
					System.out.println(getArquivo().getName() +"já foi excluido");
				} else {
				System.out.println("O arquivo escolhido não foi apagado");
				}
			}else {
				System.out.println(getArquivo().getName()+" não existe");
			}
			
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
