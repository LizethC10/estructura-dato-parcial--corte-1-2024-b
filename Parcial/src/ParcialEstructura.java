
    import javax.swing.*;
import java.util.Scanner;

    public class ParcialEstructura {
        public static void main(String arg[]){

            Scanner scanner = new Scanner(System.in);
            String NombreCliente;
            String NombreProducto;
            double valorUnitario = 5
            int cantidad;
            double valorBruto;
            double valorNeto;
            double valorDescuento;
            double Descuento;
            System.out.print("Digite el nombre del cliente: ");
            NombreCliente = scanner.nextLine();
            System.out.print("Digite el nombre del producto: ");
            NombreProducto = scanner.next();
            System.out.println("Digite el valor unitario");
            valorUnitario = scanner.nextDouble();
             if (valorUnitario>=0){ System.out.println("Error en la entrada de los datos");
                 System.out.println("Cantidad a comprar");
                 cantidad = scanner.nextInt();
                 if (cantidad <= 0) {
                     System.out.println("Error en la entrada de datos");
                     return;
                 }


                 if (cantidad < 10) {
                     Descuento = 0;
                 } else if (cantidad < 20) {
                     Descuento = 0.05;
                 } else {
                     Descuento = 0.07;
                 }




            }
            }

}
