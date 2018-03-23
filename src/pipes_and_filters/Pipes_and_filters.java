/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipes_and_filters;

import java.io.*;

/**
 *
 * @author andre
 */
public class Pipes_and_filters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pipe pipe = new PipeFilter();
        Filter leitor = new LeitorDeArquivos();
        Filter soma = new CalculaValores();
        Filter salva = new SalvaArquivos();
        leitor.entrada("/home/andre/Documentos/GitHub/Pipes_and_filters/src/pipes_and_filters/dados.txt");
        
        //Leitor to Soma
        pipe.conecta(leitor.saida(), soma);
        soma.processa();
        
        //Soma to SalvarArquivos
        pipe.conecta(soma.saida(), salva);
        salva.processa();
        
        
    }
    
}
