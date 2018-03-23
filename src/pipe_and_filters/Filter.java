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
public interface Filter {
    public void entrada(String entrada);
    public void processa();
    public String saida();
}
