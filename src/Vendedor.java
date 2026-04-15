public class Vendedor {
    public String nombre;
    public String area;

    private double montoVendido;
    private double porcentajeComision;
    private double cumplimiento;

    public Vendedor(String nombre, String area, double montoVendido, double porcentajeComision, double cumplimiento) {
        this.nombre = nombre;
        this.area = area;
        this.montoVendido = montoVendido;
        this.porcentajeComision = porcentajeComision;
        this.cumplimiento = cumplimiento;
    }

    public double getMontoVendido() {
        return montoVendido;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public double getCumplimiento() {
        return cumplimiento;
    }

    public void setMontoVendido(double montoVendido) {
        if (montoVendido > 0) {
            this.montoVendido = montoVendido;
        }
    }

    public void setPorcentajeComision(double porcentajeComision) {
        if (porcentajeComision >= 0) {
            this.porcentajeComision = porcentajeComision;
        }
    }

    public void setCumplimiento(double cumplimiento) {
        if (cumplimiento >= 0 && cumplimiento <= 100) {
            this.cumplimiento = cumplimiento;
        }
    }

    public double calcularComision() {
        return montoVendido * (porcentajeComision / 100);
    }

    public double calcularIngresoTotal() {
        return montoVendido + calcularComision();
    }

    public String estadoCumplimiento() {
        if (cumplimiento >= 90) return "Excelente";
        else if (cumplimiento >= 70) return "Aceptable";
        else return "Bajo";
    }

    public String mensajeFinal() {
        return switch (estadoCumplimiento()) {
            case "Excelente" -> "Vendedor con desempeño sobresaliente";
            case "Aceptable" -> "Vendedor con desempeño aceptable";
            default -> "Se requiere seguimiento comercial";
        };
    }

    public void mostrarReporte() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Área: " + area);
        System.out.println("Monto vendido: " + montoVendido);
        System.out.println("Comisión: " + calcularComision());
        System.out.println("Ingreso total: " + calcularIngresoTotal());
        System.out.println("Estado: " + estadoCumplimiento());
        System.out.println("Mensaje: " + mensajeFinal());
        System.out.println("----------------------------------------");
    }
}