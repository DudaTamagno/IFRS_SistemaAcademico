/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5exemplos;

/**
 *
 * @author coelho
 */
public class ProgramaTeste {

    public static void main(String[] args) {
        Aluno jorge = null;

        jorge = new Aluno();
        jorge.nome = "Jorge Adão de Albuquerque";
        jorge.curso = "Técnico em Informática Integrado ao Ensino Médio";
        jorge.anoIngresso = 2019;
        jorge.ehFormado = false;
        jorge.matricula = 164090;
    }
}
