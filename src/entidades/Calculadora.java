/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author siviany
 */
public class Calculadora {

    int numero;
    int numero2;
    double resultado;
    String operador;
    public static Stack<Double> lista = new Stack<>();

    public Calculadora() {
    }

    public Calculadora(int numero, int numero2, String operador) {
        this.numero = numero;
        this.numero2 = numero2;
        this.operador = operador;
    }

    public Calculadora(int numero, int numero2, double resultado, String operador) {
        this.numero = numero;
        this.numero2 = numero2;
        this.resultado = resultado;
        this.operador = operador;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public void sumar() {
        if (Calculadora.lista.isEmpty()) {
            this.resultado = this.numero + this.numero2;
            Calculadora.lista.add(this.resultado);
        } else {
            this.resultado = lista.peek() + this.numero2;
            Calculadora.lista.add(this.resultado);
        }
    }

    public void restar() {
        if (Calculadora.lista.isEmpty()) {
            this.resultado = this.numero - this.numero2;
            Calculadora.lista.add(this.resultado);
        } else {
            this.resultado = lista.peek() - this.numero2;
            Calculadora.lista.add(this.resultado);
        }
    }

    public void dividir() {
        if (Calculadora.lista.isEmpty()) {
            this.resultado = (double) this.numero / this.numero2;
            Calculadora.lista.add(this.resultado);
        } else {
            this.resultado = lista.peek() / this.numero2;
            Calculadora.lista.add(this.resultado);
        }
    }

    public void multiplicar() {
        if (Calculadora.lista.isEmpty()) {
            this.resultado = this.numero * this.numero2;
            Calculadora.lista.add(this.resultado);
        } else {
            this.resultado = lista.peek() * this.numero2;
            Calculadora.lista.add(this.resultado);
        }
    }

    @Override
    public String toString() {
        return "EL RESULTADO ES: " + this.resultado;
    }

}
