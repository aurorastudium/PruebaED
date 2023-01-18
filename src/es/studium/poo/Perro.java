package es.studium.poo;

public class Perro
{
	private Raza raza;
	private float tamano;
	private int edad;
	private String color;
	
	public Perro () {
		raza= new Raza ();
		tamano= 0.0f; // ponemos f para indicar que es un float
		edad= 0;
		color= "";
	}
//constructor por defecto
	public Perro(Raza raza, float tamano, int edad, String color)
	{
		this.raza = raza;
		this.tamano = tamano;
		this.edad = edad;
		this.color = color;
	}

	public Raza getRaza()
	{
		return raza;
	}

	public void setRaza(Raza raza)
	{
		this.raza = raza;
	}

	public float getTamano()
	{
		return tamano;
	}

	public void setTamano(float tamano)
	{
		this.tamano = tamano;
	}

	public int getEdad()
	{
		return edad;
	}

	public void setEdad(int edad)
	{
		this.edad = edad;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	@Override // indica que este método lo esta sobreescribiendo,
	// no es un metodo propio de la clase perro. Significa que es un  metodo heredado de la clase  Object. 
	// la clase object es la clase padre de todas las clases java
	public String toString()
	{
		return "Perro [raza=" + raza + ", tamano=" + tamano + ", edad=" + edad + ", color=" + color + "]";
	}
	
}
