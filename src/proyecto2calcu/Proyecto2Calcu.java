/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2calcu;

import entidades.Calculadora;
import javax.swing.JOptionPane;

enum Operador {
    S, R, M, D;
}

/**
 *
 * @author siviany
 */
public class Proyecto2Calcu {

    public static Operador valorOpreacion;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean continuar = false;
        int numero1 = 0;
        int numero2 = 0;
        String operacion = "";
        String respuestaUsuario = "s";
        Calculadora calcu = new Calculadora();
        do {
            do {
                continuar = false;
                try {
                    numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                } catch (NumberFormatException numE) {
                    JOptionPane.showMessageDialog(null, "Solo numeros enteros");
                    continuar = true;
                }
            } while (continuar);
            do {
                do {
                    continuar = false;
                    try {
                        operacion = JOptionPane.showInputDialog("Escriba lo que desea hacer:\n"
                                + "Sumar (s)\n"
                                + "Restar (s)\n"
                                + "Multiplicar (m)\n "
                                + "Dividir (d) ").toUpperCase();
                        valorOpreacion = Enum.valueOf(Operador.class, operacion);
                    } catch (IllegalArgumentException ex) {
                        JOptionPane.showMessageDialog(null, " Ingreso un dato no permitido solo S R D M");
                        continuar = true;
                    }
                } while (continuar);
                do {
                    continuar = false;
                    try {
                        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                    } catch (NumberFormatException numE) {
                        JOptionPane.showMessageDialog(null, "Solo numeros enteros");
                        continuar = true;
                    }
                } while (continuar);
                calcu.setNumero(numero1);
                calcu.setNumero2(numero2);
                switch (valorOpreacion) {
                    case S:
                        calcu.sumar();
                        break;
                    case R:
                        calcu.restar();
                        break;
                    case M:
                        calcu.multiplicar();
                        break;
                    case D:
                        calcu.dividir();
                        break;
                    default:
                        throw new AssertionError();
                }
                respuestaUsuario = JOptionPane.showInputDialog("Desea continuar si(s) o no (n)");
            } while (respuestaUsuario.equals("s"));
        } while (respuestaUsuario.equals("s"));
        JOptionPane.showMessageDialog(null, calcu.toString());
    }
}
