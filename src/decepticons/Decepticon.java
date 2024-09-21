package decepticons;
import interfaces.Interfaz;

public abstract class Decepticon implements Interfaz{
	 protected Integer codigo, velocidad, porcentajeMaldad;
	 protected String nombre, arma, modoAlterno;
	 
	 public Decepticon(){
	        autoEnsamblaje();
	    }
	 
     public Integer getCodigo() {
			return codigo;
		}
	public void setCodigo() {
			System.out.println("Ingrese el codigo del Decepticon: ");
			codigo = leer.nextInt();
	        leer.nextLine();
		}
		
	public Integer getVelocidad() {
			return velocidad;
		}
	public void setVelocidad() {
			 System.out.println("Ingrese la velocidad del Decepticon ["+nombre+"]: ");
		        velocidad = leer.nextInt();
		        leer.nextLine();
		}
		
	public String getNombre() {
			return nombre;
		}
	public void setNombre() {
			 System.out.println("Ingrese el nombre del Decepticon: ");
		     nombre = leer.nextLine();
		}
		
	public String getArma() {
			return arma;
		}
	public void setArma() {
			System.out.println("Ingrese el arma del Decepticon ["+nombre+"]: ");
	        arma = leer.nextLine();
		}
		
	public String getModoAlterno() {
			return modoAlterno;
		}
	public void setModoAlterno() {
			 System.out.println("Ingrese el modo alterno del Decepticon ["+nombre+"]: ");
		     modoAlterno = leer.nextLine();
		}
	  
	 @Override
	public void autoEnsamblaje(){
	        setCodigo();
	        setNombre();
	        setArma();
	        setModoAlterno();
	        setVelocidad();
	    }
	    
	public abstract void atacar();
}
