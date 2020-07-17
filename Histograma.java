
package ep2_aed2;

import javax.swing.JFrame;
import org.jfree.data.category.DefaultCategoryDataset;
import java.util.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;

public class Histograma extends JFrame {
    
    public Histograma (){
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Histograma");
        setSize(950,700);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
    public int[] criarGrafico(ArrayList<Pessoa> lista){
        
        DefaultCategoryDataset barra = new DefaultCategoryDataset();
        int qtd [] = new int [lista.size()];
        int g;
        for(Pessoa p : lista){
            qtd[p.getGrau()]++;
        }
        for(int i : qtd){
            if(qtd[i]>0)
                barra.setValue(qtd[i], String.valueOf(i), "grau dos nos");
        }
        JFreeChart grafico = ChartFactory.createBarChart("Distribuicao de graus", "Quantidade de arestas", "Quantidade de nos", barra, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel painel = new ChartPanel(grafico);
        add(painel);
        
        return qtd;
    }
    
}
