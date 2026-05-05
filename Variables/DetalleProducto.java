public class DetalleProducto {
    static void main(String[] args) {
        // Detalle poducto
        System.out.println("*** Tienda en Linea (Detalle Producto) ***");
        String nombreProducto = "Leche";
        double precio = 3.50;
        int cantidadDisponible = 5;
        boolean disponible = true;

        // Imprimir el detalle del producto
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("disponible = " + disponible);

        // Modificar los valores
        nombreProducto = "Pan";
        precio = 8.7;
        cantidadDisponible = 10;
        disponible = false;

        System.out.println();
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("disponible = " + disponible);
    }
}
