package br.edu.insper.desagil.joice.model;

public class CalculadoraCCC extends Calculadora{
	public CalculadoraCCC() {
		super("CCC");
	}
	
	@Override
	public double calcula(double peso, double raio) {
		double pesoA=peso;
		double nAtomos=2;
		double nAvogrado= 6.023*Math.pow(10, 23);
		double rraio =raio/Math.pow(10,7);
		double volumeUni=Math.pow((4*rraio)/Math.pow(3, 0.5),3);
		double densidade = (nAtomos*pesoA)/(volumeUni*nAvogrado);
		return densidade;
	}
	
}
