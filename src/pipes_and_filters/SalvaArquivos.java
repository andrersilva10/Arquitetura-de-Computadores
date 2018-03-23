/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipes_and_filters;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 *
 * @author andre
 */
public class SalvaArquivos implements Filter {

    private String conteudo = "";

    @Override
    public void entrada(String entrada) {
        this.conteudo = entrada;
    }

    @Override
    public void processa() {
        Writer writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("resultados.txt"), "utf-8"));
            writer.write(this.conteudo);
        } catch (IOException ex) {
            // Report
        } finally {
            try {
                writer.close();
            } catch (Exception ex) {/*ignore*/
            }
        }
    }

    @Override
    public String saida() {
        return this.conteudo;
    }

}
