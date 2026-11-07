package ejercicios.tema6_Ejercicio6;

import java.time.LocalDate;

// ==========================================
// INTERFAZ VALIDATOR
// ==========================================
public interface Validator {
    boolean validar(String s);
    boolean validar(int x);
    boolean validar(double d);
    boolean validar(LocalDate fecha);
}
