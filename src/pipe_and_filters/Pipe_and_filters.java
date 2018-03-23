/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipe_and_filters;

/**
 *
 * @author Aluno
 */
public class Pipe_and_filters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Filter leitor = new LeitorDeArquivos();

        leitor.entrada("C:\\Users\\Aluno\\Documents\\NetBeansProjects\\pipe_and_filters\\src\\pipe_and_filters\\dados.txt");
        System.out.println(leitor.saida());
    }
    
}
