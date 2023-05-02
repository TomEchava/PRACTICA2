import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "sales.csv");

        List<Ventas> ListaVentas = Files.lines(path)
                .skip(1)
                .map(Main::getVenta)
                .collect(Collectors.toList());
        System.out.println("Lista de ventas en NUEVA YORK:");
        ListaVentas.stream().filter(ventas -> ventas.getCITY().equals("NYC")).forEach(System.out::println);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("El total de ventas de NUEVA YORK fue:");
        ListaVentas.stream().filter(ventas -> ventas.getCITY().equals("NYC"))
                .mapToInt(ventas -> Integer.parseInt(ventas.getPRICEEACH())*Integer.parseInt(ventas.getQUANTITYORDERED()))
                .sum();
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("La cantidad de autos clasicos vendidos en NUEVA YORK fue:");
        ListaVentas.stream().
                filter(ventas -> ventas.getCITY().equals("NYC")).
                filter(ventas -> ventas.getPRODUCTLINE().equals("Classic Cars"))
                .mapToInt(ventas -> Integer.parseInt(ventas.getQUANTITYORDERED()))
                .sum();
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("El total de ventas de autos clasicos vendidos en NUEVA YORK fue:");
        ListaVentas.stream().
                filter(ventas -> ventas.getCITY().equals("NYC")).
                filter(ventas -> ventas.getPRODUCTLINE().equals("Classic Cars"))
                .mapToInt(ventas -> Integer.parseInt(ventas.getPRICEEACH())*Integer.parseInt(ventas.getQUANTITYORDERED()))
                .sum();
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("La cantidad de motocicletas vendidas en NUEVA YORK fue:");
        ListaVentas.stream().
                filter(ventas -> ventas.getCITY().equals("NYC")).
                filter(ventas -> ventas.getPRODUCTLINE().equals("Motorcycles"))
                .mapToInt(ventas -> Integer.parseInt(ventas.getQUANTITYORDERED()))
                .sum();
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("El total de ventas de motocicletas vendidas en NUEVA YORK fue:");
        ListaVentas.stream().
                filter(ventas -> ventas.getCITY().equals("NYC")).
                filter(ventas -> ventas.getPRODUCTLINE().equals("Motorcycles"))
                .mapToInt(ventas -> Integer.parseInt(ventas.getPRICEEACH())*Integer.parseInt(ventas.getQUANTITYORDERED()))
                .sum();
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("El cliente de NUEVA YORK que mas autos compro fue:");
        ListaVentas.stream().
                filter(ventas -> ventas.getCITY().equals("NYC")).
                filter(ventas -> ventas.getPRODUCTLINE().equals("Classic Cars"))
                .max((ventas1, ventas2) -> Integer.parseInt(ventas1.getQUANTITYORDERED()) - Integer.parseInt(ventas2.getQUANTITYORDERED()))
                .ifPresent(System.out::println);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("El cliente que mas compro fue:");
        ListaVentas.stream().
                max((ventas1, ventas2) -> Integer.parseInt(ventas1.getQUANTITYORDERED()) - Integer.parseInt(ventas2.getQUANTITYORDERED()))
                .ifPresent(System.out::println);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("El cliente que menos compro fue:");
        ListaVentas.stream().
                min((ventas1, ventas2) -> Integer.parseInt(ventas1.getQUANTITYORDERED()) - Integer.parseInt(ventas2.getQUANTITYORDERED()))
                .ifPresent(System.out::println);


    }



    private static Ventas getVenta(String linea) {
        String[] datos = linea.split(",");
        try {
            return new Ventas(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6],
                    datos[7], datos[8], datos[9], datos[10], datos[11], datos[12], datos[13], datos[14],
                    datos[15], datos[16], datos[17], datos[18], datos[19], datos[20], datos[21], datos[22],
                    datos[23], datos[24]);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }


    }
}