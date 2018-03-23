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
public class CalculaValores implements Filter {

    @Override
    public void entrada(String entrada) {
        String[] aux = entrada.split(entrada);
    }

    @Override
    public void processa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String saida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
