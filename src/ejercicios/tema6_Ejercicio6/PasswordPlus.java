package ejercicios.tema6_Ejercicio6;

// ==========================================
// CLASE HIJA: PASSWORD PLUS
// ==========================================
class PasswordPlus extends Password {
	

    // Constructor que traslada el valor a la clase base
    public PasswordPlus(String valor) {
        super(valor);
    }

    // Requisito: Al menos 6 caracteres y contener como mínimo un dígito
    @Override
    public boolean validar(String s) {
        if (s == null || s.length() < 6) {
            return false;
        }
        // Expresión regular que busca al menos un número (\\d) en cualquier posición
        return s.matches(".*\\d.*");
    }

    // Más de 10 caracteres y al menos una mayúscula ([A-Z]) para ser Fuerte
    @Override
    public String getFortaleza() {
        if (valor == null) {
            return "Inválida";
        }
        if (valor.length() > 10 && valor.matches(".*[A-Z].*")) {
            return "Fuerte";
        }
        return "Débil";
    }

    // Formato legible para imprimirlo en las búsquedas del menú
    @Override
    public String toString() {
        return "[Plus] " + (valor != null ? valor : "VACÍO") + " (Fortaleza: " + getFortaleza() + ")";
    }
}