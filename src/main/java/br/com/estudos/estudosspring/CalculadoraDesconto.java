package br.com.estudos.estudosspring;

public class CalculadoraDesconto {
    public double aplicar(double valor, double percentual) {
        return valor - (valor * percentual / 100.0);
    }
}
