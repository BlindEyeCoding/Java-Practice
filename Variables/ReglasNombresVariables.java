public class ReglasNombresVariables {
    static void main(String[] args) {
        // Reglas nombres variables
        String nombreCompleto = "Daniel Antelo"; // Correcto, y buenas practicas
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Daniel Antelo 2"; // Correcto, no aplica buenas practicas
        System.out.println("NombreCompleto = " + NombreCompleto);
        //String nombre-cliente = "Daniel"; // Incorrecto
        String nombre_cliente = "Daniel"; // Correcto, no aplica buenas practicas
        String _apellido = "Antelo"; // Correcto y aceptable
        String $apellido = "Antelo"; // Correcto y aceptable
        int totPzs = 10; // Correcto, no aplica buenas practicas
        int totalPiezas = 10; // Correcto, aplica buenas practicas
        boolean casado = true; // Correcto, aun puede mejorar
        boolean esCasado = true; // Correcto, y aplica buenas practicas
        boolean isCasado = true; // Correcto, y aplica buenas practicas *
        boolean tieneSaldo = true; // Correcto, aplica buenas practicas
        boolean hasSaldo = true; // Correcto, y aplica buenas practicas
    }
}
