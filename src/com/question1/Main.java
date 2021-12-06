package com.question1;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanNum = new Scanner(System.in);
        System.out.print("Insira o primeiro numero: ");
        int num = scanNum.nextInt();
        System.out.print("Insira o segundo numero: ");
        int num2 = scanNum.nextInt();

        float div = Calculator.div(num, num2);
        float sub = Calculator.sub(num, num2);
        float mult = Calculator.mult(num, num2);
        float sum = Calculator.sum(num, num2);

        System.out.println("Divisão: " + div);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Soma: " + sum);
    }
}

