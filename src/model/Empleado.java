package model;
public class Empleado{

	private Servicios servicioA;
	private Servicios servicioB;
	private Servicios servicioC;

	private String nombre;
	private String cargo;
	private String fechaIngreso;
	private double ganancia;
	private double acuImpuestos;
	private int cedula;


	public Empleado( Servicios servicioA, Servicios servicioB,Servicios servicioC, String nombre, String cargo, String fechaIngreso, Double ganancia, double acuImpuestos,int cedula){
		this.servicioA=servicioA;
		this.servicioB=null;
		this.servicioC=null;
		this.nombre=nombre;
		this.cargo=cargo;
		this.fechaIngreso=fechaIngreso;
		this.ganancia=ganancia;
		this.acuImpuestos=acuImpuestos;
		this.cedula=cedula;
	}

	public Servicios getServicioA(){
		return servicioA;
	}
	public Servicios getServicioB(){
		return servicioB;
	}
	public Servicios getServicioC(){
		return servicioC;
	}
	public String getNombre(){
		return nombre;
	}
	public String getCargo(){
		return cargo;
	}
	public String getFechaIngreso(){
		return fechaIngreso;
	}
	
	public int getCedula(){
		return cedula;
	}
	public double getGanancia(){

		String servicio = getServicioA().getServicio();

		if(servicio == "c"){
			ganancia = getServicioA().getIngreso()*2.0;
		}
		else if(servicio == "m"){
			ganancia = getServicioA().getIngreso()*3.5;
		}
		else if(servicio == "p"){
			ganancia = getServicioA().getIngreso()*2.5;
		}

		return ganancia;
	}

	public double getImpuestoAcumulado(){

		double acuImpuestos= 0.0;
		String servicio = getServicioA().getServicio();

		if(servicio == "c"){
			acuImpuestos = getServicioA().getIngreso()*0.5;
		}
		else if(servicio == "m"){
			acuImpuestos = getServicioA().getIngreso()*0.5;
		}
		else if(servicio == "p"){
			acuImpuestos = getServicioA().getIngreso()*0.5;
		}

		return acuImpuestos;
	}

	

}

	




