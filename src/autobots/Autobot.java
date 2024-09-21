package autobots;
import interfaces.Interfaz;

public abstract class Autobot implements Interfaz {
	protected Integer codigo, velocidad;
	protected String nombre, arma, modoAlterno;
	
	public Autobot() {
		//Contiene toda la construccion del objeto
		autoEnsamblaje();
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo() {
		System.out.println("Ingrese el codigo del Autobot: ");
		codigo = leer.nextInt();
        leer.nextLine();
	}
	
	public Integer getVelocidad() {
		return velocidad;
	}
	public void setVelocidad() {
		 System.out.println("Ingrese la velocidad del Autobot ["+nombre+"]: ");
	        velocidad = leer.nextInt();
	        leer.nextLine();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre() {
		 System.out.println("Ingrese el nombre del Autobot: ");
	     nombre = leer.nextLine();
	}
	
	public String getArma() {
		return arma;
	}
	public void setArma() {
		System.out.println("Ingrese el arma del Autobot ["+nombre+"]: ");
        arma = leer.nextLine();
	}
	
	public String getModoAlterno() {
		return modoAlterno;
	}
	public void setModoAlterno() {
		 System.out.println("Ingrese el modo alterno del Autobot ["+nombre+"]: ");
	     modoAlterno = leer.nextLine();
	}
	
	@Override  //codigo que contiene el orden
    public void autoEnsamblaje(){
        setCodigo();
        setNombre();
        setArma();
        setModoAlterno();
        setVelocidad();
    }
	
	//Metodo que sera implementado en los hijos
	public abstract void defender();
}
