package br.edu.insper.desagil.joice.model;

public class CalculadoraCFC extends Calculadora {
	public CalculadoraCFC() {
		super("CFC");
	}
	
	@Override
	public double calcula(double peso, double raio) {
		double pesoA=peso;
		double nAtomos=4;
		double nAvogrado= 6.023*Math.pow(10, 23);
		double rraio =raio/Math.pow(10,7);
		double volumeUni=Math.pow(2*Math.pow(2,0.5)*rraio,3);
		double densidade = (nAtomos*pesoA)/(volumeUni*nAvogrado);
		return densidade;
	}
}
