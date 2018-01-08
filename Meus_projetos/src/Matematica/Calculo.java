package Matematica;

public class Calculo {	
	// atributos 
		private double numero1;
		private double numero2;
		private String operador;
		private long fatorial;
		private double porcentagem;
		
		// contrutor da classe
//		public Calculo(double numero1 , double numero2){
//			this.numero1 = numero1;
//			this.numero2 = numero2;
//		}
		
		// metodos Matematicos
		
			// os metodos matematicos so iram mudar a variavel "operador", é mandar capturar os campos e valores
			// para as varivaie numro1 e numero2 
		
			public double Somar_dois_numeros(double numero1 , double numero2, String operador ){
				
				double resultado;
				if(operador.equals("+")){
					resultado = numero1 + numero2;
					return resultado;
				}else{
					System.out.println("Erro ao fazer o calculo");
				}
			return numero1 + numero2;
		}// fim do metodo soma
			
			
			public double Subtarir_dois_numeros(double numero1 , double numero2, String operador ){
				
				double resultado;
				if(operador.equals("-")){
					resultado = numero1 - numero2;
					return resultado;
				}else{
					System.out.println("Erro ao fazer o calculo");
			}
			return numero1 - numero2;
		}// fim do metodo subtrair
			
			public double Multiplicar_dois_numeros(double numero1 , double numero2, String operador ){
				
				double resultado;
				if(operador.equals("*") ){
					resultado = numero1 * numero2;
					return resultado;
				}else{
					System.out.println("Erro ao fazer o calculo");
				}
			return numero1 * numero2;
		}// fim do metodo multiplicar
			
			public double Divi_dois_numeros(double numero1 , double numero2, String operador ){
				
				double resultado;
				if(operador.equals("/")){
					resultado = numero1 / numero2;
					return resultado;
				}else{
					System.out.println("Erro ao fazer o calculo");
				}
			return numero1 / numero2;
		}// fim do metodo dividir
			
			
			// retorna uma raiz quadrada
			public double Raiz_quadrada_2(double numero1){
				return Math.sqrt(numero1) ;
			}
			
			// retorna um valor fatorial de uma equação
			public int Fatorial(int numero){
				this.fatorial = numero;
				numero =1;
				for (int i = 1; i <= this.fatorial; i++) {
					
					if(numero <= 0){
						System.out.println("Não foi possivel fazer o calculo , tente novamente");
					}else{
						numero = numero * i; 
		                //1 = 1*1;
		                // imprimir 1=1
		                //1= 1*2
		                //imprimir 2=2
		                // 2 = 2*3
		                //  imprimir 2=6
		           System.out.println("Fatorial de "+i+" = "+numero);
		           //return numero;
					}
				}
				return numero;
			}
			
			public double porcentagem(double porcento){
				this.porcentagem = porcento;
			
				return porcento / 100;
			}
			
			public double retira_porcentagem(double porcento){
				this.porcentagem = porcento;
				return porcento *100;
			}
			
			public  Integer Arranjo (int num, int num1) {
				int numero_primitivo =fatorial(num);
				int nunmero_secundario = num-num1;
				int numero_ter = fatorial(nunmero_secundario);
				int divi_fatorial = numero_primitivo / numero_ter;
				
				return divi_fatorial;
				
			}
			
			public  Integer Combinacao (int num , int num1) {
				int numero_primitivo = fatorial(num);
				int nunmero_secundario = num-num1;
				int numero_ter = fatorial(nunmero_secundario);
				int num_quar = fatorial(num1);
				int multi = numero_ter * num_quar;
				int divi_fatorial = numero_primitivo / multi;
				
				return divi_fatorial;
			}
			
			private Integer fatorial(Integer medidor) {
				int y = 1;
				for (int i = 1; i <= medidor; i++) {
					y*=i;
				}
				return y;
			}
			
			public String Baskara(int a , int b, int c) {
				double potencia = b*b;
				double resto = 4*a*c;
				Double result_delta =(potencia) - resto;
				Double positivo = Math.abs(result_delta);
				Double delta = Math.sqrt(positivo);
				
				if (delta < -1 || delta.equals(0)) {
					System.out.println("ERRO");
					System.exit(0);
				}else{
					Double baskara_p = (-b + delta)/(2*a);
					Double baskara_n = (-b - delta)/(2*a);
					
					return baskara_p.doubleValue()+ " " + baskara_n.doubleValue();
				}
				return null;		
			}

}
