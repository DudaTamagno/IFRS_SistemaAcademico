/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5exemplos;

import java.util.Scanner;

/**
 *
 * @author coelho
 */
public class ProgramaTeste3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escolha [1] para professor e [2] para aluno:");
        int opcao = s.nextInt();
        s.nextLine();
        if (opcao == 1) {
            Professor p = new Professor();
            System.out.println("Nome:");
            p.nome = s.nextLine();
            System.out.println("SIAPE:");
            p.siape = s.nextLong();
            System.out.println("Quantas áreas?");
            int quantAreas = s.nextInt();
            
            p.areas = new String[quantAreas];
            System.out.println("Informe as áreas:");
            for (int i = 0; i < quantAreas; i++) {
                p.areas[i] = s.nextLine();
            }
        } else {
            Aluno a = new Aluno();
            System.out.println("Nome:");
            a.nome = s.nextLine();
            System.out.println("Curso:");
            a.curso = s.nextLine();
            System.out.println("Matricula:");
            a.matricula = s.nextLong();
            System.out.println("Ingresso:");
            a.anoIngresso = s.nextInt();
            a.ehFormado = false;
        }
    }
}
