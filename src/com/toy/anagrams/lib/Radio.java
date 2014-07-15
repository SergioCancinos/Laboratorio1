/*
    Sergio Cancinos 13062
	Johnny del Cid  13032
     Ana Bartra  13643


	Radio.java 
	Se encarga de crear una interfaz en la cual existen los m�todos obligatorios para una clase que la implemente.

*/
//package com.toy.anagrams.lib;
public interface Radio{

	//Cambia el estado de AM en FM TRUE = AM FALSE = FM
	public void cambiarFrecuencia();
	// Guarda una estaci�n en la lista
	public void guardarEstacion(double estacion, int boton);
	//recive un par�metro TRUE = adelante FALSE= atras
	public void cambiarEstacion(boolean direccion);
	public void encendidoApagado();
	
	
	public String [] getEstacionesFav();	
	public boolean getFrecuencia();
	public boolean getEstado();
	public double getEstacion();	
	
	

}