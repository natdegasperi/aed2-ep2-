
package ep2_aed2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeiaCSV {
    
    
    public ArrayList<Pessoa> run() {
        
        String arquivoCSV = "C:\\Users\\guikh\\OneDrive\\Documents\\OD_2017.csv";
        BufferedReader br = null;
        String linha = "";
        String csvDivisor = ",";
        ArrayList<Pessoa> vertices = new ArrayList<Pessoa>();
        try {

            br = new BufferedReader(new FileReader(arquivoCSV));
            while ((linha = br.readLine()) != null) {

                String[] pessoa = linha.split(csvDivisor);
                Pessoa p;
                
                if(!vertices.isEmpty() && !pessoa[84].equals("0") && pessoa[43].equals(vertices.get(vertices.size()-1).getId())){
                    p = vertices.get(vertices.size()-1);
                    p.addOrigem(pessoa[84], pessoa[85]);
                    p.addDestino(pessoa[88], pessoa[89]);
                }
                else if (!pessoa[84].equals("0")){
                    p = new Pessoa();
                    p.setId(pessoa[43]);
                    p.addOrigem(pessoa[84], pessoa[85]);
                    p.addDestino(pessoa[88], pessoa[89]);
                    vertices.add(p);
                }
                

                //System.out.println("teste [ID_PESSOA = " + pessoa[43] + " , PESSOA_OX = " + pessoa[84] + "]");

            }
            vertices.remove(0);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return vertices;
    } 
}
