import com.sun.corba.se.impl.io.TypeMismatchException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1;
        int n2;

        try {
            System.out.println("Informe o primeiro valor: ");
            n1 = scanner.nextInt();

            System.out.println("Informe o segundo valor: ");
            n2 = scanner.nextInt();

            System.out.println("Valor do número 1: " + n1);
            System.out.println("Valor do número 2: " + n2);

            Calculadora calculadora = new Calculadora();
            int valorDivisao = calculadora.dividir(n1, n2);
            System.out.println("Divisão = " + valorDivisao);
        } catch (InputMismatchException e) {
            System.out.println("O valor fornecido deve ser numérico");
            return;
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero não é permitido");
            return;
        } catch (Exception e) {
            System.out.println("Ocorreu um erro desconhecido");
            System.out.println(e.getMessage());
            return;
        } finally {
            System.out.println("Isso vai ser executado de qualquer forma");
        }


        Calculadora c = new Calculadora();
        try {
            c.dividir(10, 50);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
