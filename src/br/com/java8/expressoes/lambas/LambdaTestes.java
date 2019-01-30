package br.com.java8.expressoes.lambas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class LambdaTestes {

	private static JButton button = new JButton();

	public static void main(String[] args) {
		double soma = Calc.calcular(20d, 30d, (x, y) -> x + y);
		System.out.println(soma);
	}

	private void initButton() {
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Botao Clicado");
				System.out.println("Botao Clicado 2");

			}

		});
	}

	private void initButtonLambda() {
		button.addActionListener((event) -> imprimeTexto(event));

	}

	private void imprimeTexto(ActionEvent event) {
		System.out.println("Botao clicado");
		System.out.println("Botao clicado2");
	}

}
