
package ep2_aed2;

import java.util.ArrayList;

public class Pessoa {
    
    private String id;
    private ArrayList<String> origem;
    private ArrayList<String> destino;
    private ArrayList<String> arestas;
    
    public Pessoa(){
    
        id = "";
        origem = new ArrayList<String>();
        destino = new ArrayList<String>();
        arestas = new ArrayList<String>();
    
    }   
    
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getId(){
        return this.id;
    }
    
    public void addOrigem(String x, String y){
        this.origem.add(x);
        this.origem.add(y);
    }
    
    public ArrayList<String> getOrigem(){
        return this.origem;
    }
    
    public void addDestino(String x, String y){
        this.destino.add(x);
        this.destino.add(y);
    }
    
    public ArrayList<String> getDestino(){
        return this.destino;
    }
    
    public void addAresta(String id){
        this.arestas.add(id);
    }
    
    public ArrayList<String> getArestas(){
        return this.arestas;
    }
    
    public int getGrau(){
        return this.arestas.size();
    }
    
}
