package ejercicios.tema6_Ejercicio5;

public class Linea2D extends Punto2D implements Relationable{

	
	//atr
	private Punto2D p1;
	private Punto2D p2;
	private float distancia;
	
	//Constructor
	public Linea2D(int x, int y,Punto2D p1,Punto2D p2) {
		super(x, y);
		this.p1 = p1;
		this.p2 = p2;
		setDistancia();
	}
	
	//Metodos de acceso
	public Punto2D getP1() {
		return p1;
	}
	public Punto2D getP2() {
		return p2;
	}
	public float getDistancia() {
		return distancia;
	}
	public void setDistancia() {
		// Formula: (x2-x1) * (x2-x1) + (y2-y1) * (y2-y1)
		this.distancia = (float) (Math.sqrt((getX()*2-getX()*1) * (getX()*2-getX()*1) + (getY()*2-getY()*1) * (getY()*2-getY()*1)));
	}
	

	
	
	//Metodos de interfaz
	@Override
	public boolean isIgual(Object a, Object b) {
		// TODO Auto-generated method stub
		if(a instanceof Linea2D && b instanceof Linea2D) {
			if(((Linea2D)a).getDistancia() == ((Linea2D)b).getDistancia()) {
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean isMenorQue(Object a, Object b) {
		// TODO Auto-generated method stub
		if(a instanceof Linea2D && b instanceof Linea2D) {
			if(((Linea2D)a).getDistancia()<((Linea2D)b).getDistancia()) {
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean isMayorQue(Object a, Object b) {
		// TODO Auto-generated method stub
		if(a instanceof Linea2D && b instanceof Linea2D) {
			if(((Linea2D)a).getDistancia()>((Linea2D)b).getDistancia()) {
				return true;
			}
		}
		return false;
	}
	//toString
	@Override
	public String toString() {
		String mensaje = super.toString();
		mensaje += " | "+ "p1: "+this.p1 + " | "+ "p2: "+this.p2 + " | " + "distancia: "+this.distancia;
		return mensaje;
	}

	
	
	

}
