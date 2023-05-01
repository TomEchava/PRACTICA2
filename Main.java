
import java.util.stream.Stream;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Collectors;
import java.util.List;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        String nombreArchivo = "src/sales.csv";

        try(Stream<String> linea=Files.lines(Paths.get(nombreArchivo))){
            List<Ventas> listaVentas = linea
                    .skip(1)
                    .map(Main::getVenta)
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

    private static Ventas getVenta(String linea) {
        String[] datos = linea.split(",");
        return new Ventas(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6],
                datos[7], datos[8], datos[9], datos[10], datos[11], datos[12], datos[13], datos[14],
                datos[15], datos[16], datos[17], datos[18], datos[19], datos[20], datos[21], datos[22],
                datos[23], datos[24]);


    }
}