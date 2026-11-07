package ejercicios.tema6_Ejercicio6;

// ==========================================
// CLASE HIJA: PASSWORD FREE
// ==========================================
class PasswordFree extends Password {

    // Constructor que traslada el valor a la clase padre
    public PasswordFree(String valor) {
        super(valor);
    }

    // El string puede tener cualquier longitud menos cero
    @Override
    public boolean validar(String s) {
        return s != null && s.length() > 0;
    }

    // Si tiene más de 4 caracteres es Fuerte; si no, Débil
    @Override
    public String getFortaleza() {
        if (valor == null) {
            return "Inválida";
        }
        if (valor.length() > 4) {
            return "Fuerte";
        }
        return "Débil";
    }

    // Formato cómodo para imprimirlo directamente en la matriz de pruebas
    @Override
    public String toString() {
        return "[Free] " + (valor != null ? valor : "VACÍO") + " (Fortaleza: " + getFortaleza() + ")";
    }
}