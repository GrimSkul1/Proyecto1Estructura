ridsdgfdggg package Codigo;
import java.io.File;

public class Funciones {
	
	
	

    static public StringBuilder quitarEspacios(File miArchivo) throws FileNotFoundException, IOException {

        BufferedReader br = new BufferedReader(new FileReader(miArchivo));
        String linea;
        StringBuilder sb = new StringBuilder();

        while ((linea = br.readLine()) != null) {
            sb.append(linea.trim());
        }
        return sb;
    }
    
}
