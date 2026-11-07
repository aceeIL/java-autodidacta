package ejercicios.tema6_Ejercicio6;

import java.time.LocalDate;

// ==========================================
// CLASE BASE ABSTRACTA: PASSWORD
// ==========================================
public abstract class Password implements Validator {
    protected String valor;

    public Password(String valor) {
        validaString(valor);
    }

    public String getValor() {
        return valor;
    }

    public void validaString(String s) {
        if (validar(s)) {
            this.valor = s;
        } else {
            this.valor = null;
        }
    }

    public abstract String getFortaleza();

    // ==========================================
    // IMPLEMENTACIÓN OBLIGATORIA DE LA INTERFAZ
    // ==========================================
    @Override
    public abstract boolean validar(String s);

    @Override
    public boolean validar(int x) {
        return false;
    }

    @Override
    public boolean validar(double d) {
        return false;
    }

    @Override
    public boolean validar(LocalDate fecha) {
        return false;
    }

    // ==========================================
    // MÉTODO ESTÁTICO DE ORDENACIÓN
    // ==========================================
    public static void ordenarAlfabeticamente(Password[] array, int totalElementos) {
        for (int i = 0; i < totalElementos - 1; i++) {
            for (int j = 0; j < totalElementos - i - 1; j++) {
                
                String valor1 = array[j].getValor();
                String valor2 = array[j + 1].getValor();
                
                if (valor1.compareToIgnoreCase(valor2) > 0) {
                    Password auxiliar = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = auxiliar;
                }
            }
        }
    }
}
