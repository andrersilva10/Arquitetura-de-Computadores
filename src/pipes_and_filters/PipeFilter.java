/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipes_and_filters;

/**
 *
 * @author andre
 */
public class PipeFilter implements Pipe{

    @Override
    public void conecta(String entrada, Filter f) {
        f.entrada(entrada);
    }
    
}
