
package ep2_aed2;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        LeiaCSV obj = new LeiaCSV();
        ArrayList<Pessoa> vertices = obj.run();
        
        Grafo g = new Grafo(vertices);
        int qtdArestas = g.getA();
        System.out.println("Quantidade de arestas = "+qtdArestas);
        
        Histograma h = new Histograma();
        int graus[] = h.criarGrafico(g.getVertices());
        
        for(int i = 0; i<graus.length; i++){
            System.out.println("grau "+i+": "+graus[i]+" nos");
        }
        
    }
    
}
