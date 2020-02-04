import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
//		m.soma(10, 30);
//		m.soma(-30, 10);
//		m.soma(0, 0);
//		m.raioCirculo(2.00);
//		m.raioCirculo(100.64);
//		m.raioCirculo(150.00);
//		m.produto(5, 6, 7, 8);
//		m.produto(5, 6, -7, 8);
//		m.calculaSalario(25, 100, 5.50);
//		m.calculaSalario(1, 200, 20.50);
//		m.calculaSalario(6, 145, 15.55);
//		m.cumprimento();
		m.validarCobranca(22);
		m.validarCobranca(103);

	}
	
	public void soma(int a, int b) {
		int soma = a + b;
		System.out.println("Entrada:" + a +" "+ b);
		System.out.println("Saida: "+ soma);
	}
	
	public void raioCirculo(double raio) {
		double pi = 3.14159;
		double area = (double)pi * (raio * raio);
		System.out.printf("Entrada:" + raio );
		System.out.println("Saida: A = "+ area);
	}
	
	public void produto(int a, int b, int c, int d) {
		int diferenca = ((a*b)- (c*d));
		System.out.printf("Entrada: " + a + " "+ b + " "+ c + " "+ d + " ");
		System.out.println("Saida: "+ diferenca);
	}
	public void calculaSalario(int func, int horas, double valorHora) {
		double salario = (double) horas*valorHora;
		System.out.printf("Entrada: " + func + " "+ horas + " "+ valorHora + " ");
		System.out.println("Saida: NUMBER = "+ func +" SALARY = U$ "+ salario);
	}
	
	public void cumprimento() {
		int hora = Calendar.HOUR_OF_DAY;
		System.out.println(hora);
		if(hora<12){
			System.out.println("Bom dia!!!");
		}else if(hora>12 && hora<18) {
			System.out.println("Boa tarde!!!");
		}else if(hora>18) {
			System.out.println("Boa noite!!!");
		}
	}
	
	public void validarCobranca(int min)
	{
		double valor = 50.00;
		if(min <= 100) {
			System.out.println("Valor a pagar: R$ "+valor);
		}else {
			int exc = min - 100;
			double valorExc = (double) exc * 2.00;
			double valorTotalFatura = 50.00 + valorExc;
			System.out.println("Valor a pagar: R$ "+valorTotalFatura);
		}
	}

}
