public class Paciente {
    public String nombre;
    public String id;
    public String seguro;

    private int edad;
    private double costoConsulta;
    private int consultas;
    private int prioridad;

    public Paciente(String nombre, String id, String seguro, int edad, double costoConsulta, int consultas, int prioridad) {
        this.nombre = nombre;
        this.id = id;
        this.seguro = seguro;
        this.edad = edad;
        this.costoConsulta = costoConsulta;
        this.consultas = consultas;
        this.prioridad = prioridad;
    }

    public void setEdad(int edad) {
        if (edad > 0) this.edad = edad;
    }

    public void setCostoConsulta(double costoConsulta) {
        if (costoConsulta > 0) this.costoConsulta = costoConsulta;
    }

    public void setConsultas(int consultas) {
        if (consultas >= 0) this.consultas = consultas;
    }

    public void setPrioridad(int prioridad) {
        if (prioridad >= 1 && prioridad <= 5) this.prioridad = prioridad;
    }

    public double calcularTotal() {
        return costoConsulta * consultas;
    }

    public double aplicarDescuento() {
        double total = calcularTotal();

        return switch (seguro) {
            case "Basico" -> total * 0.9;
            case "Premium" -> total * 0.8;
            default -> total;
        };
    }

    public String clasificacion() {
        if (prioridad >= 4) return "Alta prioridad";
        else if (prioridad >= 2) return "Media";
        else return "Baja";
    }

    public String mensaje() {
        return switch (clasificacion()) {
            case "Alta prioridad" -> "Atención inmediata requerida";
            case "Media" -> "Seguimiento necesario";
            default -> "Control regular";
        };
    }

    public void mostrarReporte() {
        System.out.println("Paciente: " + nombre);
        System.out.println("Total: " + calcularTotal());
        System.out.println("Total con descuento: " + aplicarDescuento());
        System.out.println("Clasificación: " + clasificacion());
        System.out.println("Mensaje: " + mensaje());
        System.out.println("----------------------------------------");
    }
}

