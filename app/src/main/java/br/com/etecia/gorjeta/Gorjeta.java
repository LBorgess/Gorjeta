package br.com.etecia.gorjeta;

public class Gorjeta {
    double valorDaConta;

    public double excelente() {
        double valorDaConta = this.valorDaConta;
        return valorDaConta * 1.10;
    }

    public double otimo() {
        double valorDaConta = this.valorDaConta;
        return valorDaConta * 1.08;
    }

    public double bom() {
        double valorDaConta = this.valorDaConta;
        return valorDaConta * 1.05;
    }

    public double ruim() {
        double valorDaConta = this.valorDaConta;
        return valorDaConta * 1.02;
    }

}
