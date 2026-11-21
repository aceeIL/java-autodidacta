package repaso.tema8;

public class Pelicula implements Comparable<Pelicula>{

	private String codigo;

	public Pelicula(String codigo) {
		super();
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "codigo=" + codigo;
	}

	@Override
	public int hashCode() {
		return this.codigo.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Pelicula p = (Pelicula) obj;
		
		if(this.codigo.equals(p.codigo)) {
			return true;
		}
		
		return false;
	}

	@Override
	public int compareTo(Pelicula arg0) {
		// TODO Auto-generated method stub
		return this.codigo.compareTo(arg0.codigo);
	}
	
	
	
	
	
	
}
