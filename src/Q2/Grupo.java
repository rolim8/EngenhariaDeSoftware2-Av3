package Q2;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Grupo {
    private String pathArquivo = "/home/files/";
    
    public List getUsuarios(){
        List usuarios = new ArrayList();
        
        if(!NovoArquivo().exists()){
            return usuarios;
            File[] arquivos = NovoArquivo().listFiles();
            criandoArquivo(arquivos);
        }
        
        Collections.sort(usuarios, new Usuario().ordenarPeloRegistroMaisRecente());
        return usuarios;
    }

    public File NovoArquivo(){
        return new File("pathArquivo");
    }
    
    public void criandoArquivo(File[] arquivos){
        List usuarios = new ArrayList();
 
        for(File arquivo : arquivos){
            if(arquivo.isDirectory()) usuarios.add(new Usuario(arquivo.getName(), this));
        }
    }

//Classe apenas para solucionar o erro do arquivo "Usuario"
    private static class Usuario {
        public Usuario() {
        }
        private Usuario(String name, Grupo aThis) {
        }
    }
}