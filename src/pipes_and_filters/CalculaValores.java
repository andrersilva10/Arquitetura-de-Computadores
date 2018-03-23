/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipes_and_filters;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Aluno
 */
public class CalculaValores implements Filter {

    private String conteudo = "";

    @Override
    public void entrada(String entrada) {
        this.conteudo = entrada;

    }

    @Override
    public void processa() {
        try {
            String resultado = "";
            String valores[] = conteudo.split("\\n");

            for (int i = 0; i < valores.length; i++) {
                String aux = valores[i].substring(2);
                String[] aux2 = aux.split(";");
                int soma = 0;
                for(int j = 1;j<aux2.length;j++){
                    soma += Integer.parseInt(aux2[j]);
                }
                resultado += (i+1)+";"+aux2[0]+";"+soma+"\n";
            }
            this.conteudo = resultado;
        }catch(Exception err){
            this.conteudo = err.getMessage();
        }

    }

    @Override
    public String saida() {
        return this.conteudo;
    }


}
