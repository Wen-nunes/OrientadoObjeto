package exemplo1;

public class Principal {
		public static void main (String[] args) {
			
			try {
				int[] numero = {1, 2, 3};
				System.out.println(numero[3]);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Erro: indice fora do Array \n" + e.getMessage());
			}catch(Exception e) {
				System.out.println("Exceção: " + e.toString());
			}
			
			//int a =10;
			//int b = 0;
			
			//System.out.println(a/b);
			
			//String numero = "abc";
			//int valor = Integer.parseInt(numero);
			
		}
}
