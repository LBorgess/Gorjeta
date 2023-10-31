package br.com.etecia.gorjeta;

public class Gorjeta {

    private double valorDaConta;

    public double getValorDaConta() {
        return valorDaConta;
    }

    public void setValorDaConta(double valorDaConta) {
        this.valorDaConta = valorDaConta;
    }

    /**
     * Retorna um valor de 10%
     *
     * @return
     */
    public double excelente(double valor) {
        return valor * 1.10;
    }

    /**
     * Retorna um valor de 8%
     *
     * @return
     */
    public double otimo(double valor) {
        return valor * 1.08;
    }

    /**
     * Retorna o valor de 5%
     *
     * @return
     */
    public double bom(double valor) {
        return valor * 1.05;
    }

    /**
     * Retorna o valor de 2%
     *
     * @return
     */
    public double ruim(double valor) {
        return valor * 1.02;
    }

}
