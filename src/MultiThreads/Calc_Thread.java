package MultiThreads;

import java.util.Scanner;

public class Calc_Thread implements Runnable {
	
	private int Num1;
	private int Num2;
	private char operador;
	
	public void run() {
		this.ler();
	}
	
	private synchronized void ler() {
		Scanner input = new Scanner(System.in);
			
		System.out.println("Digite o primeiro valor: ");
			this.Num1 = input.nextInt();
		
		System.out.println("Operação: ");
		System.out.println("+   |   -   |   *   |   /");
			String op = input.next();
		
		System.out.println("Digite o segundo valor: ");
			this.Num2 = input.nextInt();

			this.operador = op.charAt(0);
		
			System.out.println("Resultado: " + this.calcular());
			System.out.println("");
	}
	
	public synchronized double calcular(){
	
		Calculadora calc = new Calculadora();
		
		return calc.calcula(Num1, Num2, operador);
	
	}

}