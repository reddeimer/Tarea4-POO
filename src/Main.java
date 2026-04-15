public class Main {
    void main() {

        Vendedor v = new Vendedor("Andrea López", "Tecnología", 2850.75, 8, 92);
        v.mostrarReporte();

        Paciente p = new Paciente("Carlos Pérez", "0102030405", "Premium", 45, 25.5, 3, 4);
        p.mostrarReporte();

    }
}