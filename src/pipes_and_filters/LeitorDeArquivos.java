/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipes_and_filters;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Aluno
 */
public class LeitorDeArquivos implements Filter {
    private String conteudo;
    public LeitorDeArquivos() {
       
    }
    
    public String getConteudo(){
        return this.conteudo;
    }

    @Override
    public void entrada(String entrada) {
        String content = null;
        File file = new File(entrada); // For example, foo.txt
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            char[] chars = new char[(int) file.length()];
            reader.read(chars);
            content = new String(chars);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.conteudo = content;
    }

    @Override
    public void processa() {
        
    }

    @Override
    public String saida() {
        return this.conteudo;
    }
}
