package com.svgr.conversormonedas.conversor;

        import com.svgr.conversormonedas.conversor.Conversor;

        import java.io.IOException;
        import java.util.Scanner;

        public class ConversorApp {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int opcion = 0;

                while (opcion != 9) {
                    mostrarMenu();

                    try {
                        opcion = Integer.parseInt(scanner.nextLine());

                        if (opcion >= 1 && opcion <= 8) {
                            String base = "", destino = "";

                            switch (opcion) {
                                case 1 -> { base = "USD"; destino = "ARS"; }
                                case 2 -> { base = "ARS"; destino = "USD"; }
                                case 3 -> { base = "USD"; destino = "BRL"; }
                                case 4 -> { base = "BRL"; destino = "USD"; }
                                case 5 -> { base = "USD"; destino = "COP"; }
                                case 6 -> { base = "COP"; destino = "USD"; }
                                case 7 -> { base = "USD"; destino = "MXN"; }
                                case 8 -> { base = "MXN"; destino = "USD"; }
                            }

                            System.out.print("Ingrese la cantidad a convertir: ");
                            double cantidad = Double.parseDouble(scanner.nextLine());

                            double resultado = Conversor.convertir(base, destino, cantidad);
                            System.out.printf("Resultado: %.2f %s = %.2f %s\n\n", cantidad, base, resultado, destino);
                        } else if (opcion != 9) {
                            System.out.println("Opción no válida. Intente de nuevo.\n");
                        }

                    } catch (NumberFormatException | IOException | InterruptedException e) {
                        System.out.println("Error: " + e.getMessage() + "\n");
                    }
                }

                System.out.println("Gracias por usar el conversor de moneda.");
            }

            public static void mostrarMenu() {
                System.out.println("""
*************************************************
============ CONVERSOR DE DIVISAS ============
*************************************************
Bienvenido/a al Conversor de Moneda 

1) Dólar =>> Peso argentino
2) Peso argentino =>> Dólar
3) Dólar =>> Real brasileño
4) Real brasileño =>> Dólar
5) Dólar =>> Peso colombiano
6) Peso colombiano =>> Dólar
7) Dólar =>> Peso mexicano
8) Peso mexicano =>> Dólar
9) Salir

*************************************************
Elija una opción válida:
""");
     }
}