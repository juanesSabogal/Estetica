package model;
public class Servicios{

	public final static double IVA= 0.0; 
	public final static String SERVICIO_PEDICURE="p";
	public final static String SERVICIO_MANICURE="m";
	public final static String SERVICIO_CORTE="c";

	private String servicio;
	private String nombre;
	private int numeroVeces;
	private double ingresos;
	private boolean publicidad;

	public Servicios(String servicio, String nombre, int numeroVeces, double ingresos, boolean publicidad){
		this.servicio=servicio;
		this.nombre=nombre;
		this.numeroVeces=numeroVeces;
		this.ingresos=ingresos;
		this.publicidad=publicidad;
	}
	public String getServicio(){
		return servicio;
	}
	public void setServicio(String servicio){
		this.servicio=servicio;
	}
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public int getNumeroVeces(){
		return numeroVeces;
	}
	
	public boolean getPublicidad(){
		return publicidad;
	}

	public double getIngreso(){

		if(servicio=="c"){

			ingresos = (8000*0.19) + 8000;

				if(publicidad==true)
					ingresos += ingresos*0.13; 
		}
		else if(servicio=="m"){

			ingresos = (7000*0.19) + 7000;

				if(publicidad==true)
					ingresos += ingresos*0.13; 
		}
		else if(servicio=="p"){

			ingresos = (9000*0.19) + 9000;

				if(publicidad==true)
					ingresos += ingresos*0.13;
		}
	return ingresos;
	}



}