package br.com.java8.expressoes.lambas;

public class Calc {

	public static double calcular(double x, double y, OperacaoMatematica operacao) {
		return operacao.operar(x, y);
	}

      
}
