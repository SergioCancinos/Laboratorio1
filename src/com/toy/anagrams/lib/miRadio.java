/*
        Sergio Cancinos 13062
	Johnny del Cid  13032
        Ana Bartra  13643
	miRadio.java
	Se encarga de crear un constructor, con susatributos ademas de los diferentes m�todos para que funcione la radio.




*/
//package com.toy.anagrams.lib;
public class miRadio implements Radio{
	private boolean estado, amfm;
	private String [] estacionesFav;
	private double estacion;
	
	//Constructor sin parametros
	public miRadio(){
		estado = true;
		amfm = false;
		estacion = 87.9;
		estacionesFav = new String[13];	
	}
		
		
	public void encendidoApagado(){ 
		if (estado == true){ 
			estado = false;
		}
		else if (estado == false){ 
			estado = true;
		}

	}
	
	public void cambiarFrecuencia(){//Cambia el estado de AM en FM TRUE = AM FALSE = FM
		if (amfm == true){// de AM a FM
			amfm = false;
			estacion = 87.9;
		}
		
		else if (amfm == false){//de FM a AM
			amfm = true;	
			estacion = 530;
		}
	}
	//Guarda una estaci�n favorita
	public void guardarEstacion(double estacion, int boton){// Guarda una estaci�n en la lista
		estacionesFav[boton] = Double.toString(estacion);
	}
	
	public void cambiarEstacion(boolean direccion){//recive un par�metro TRUE = adelante FALSE= atras
		//AM
		if (amfm == true){
			if (direccion == true){ //Mas volumen
				if (estacion >= 530 && estacion <=1610){
					estacion = estacion + 10;
				}
			}
			
			else if (direccion == false){//Menos volumen
				if (estacion >= 530 && estacion <=1610){
					estacion = estacion - 10;
				}
			}
		//FM
		}
		if (amfm == false){
			if (direccion == true){ //Mas volumen
				if (estacion >=87.9  && estacion <=107.9){
					estacion = estacion + 0.2;
				}
			}
			
			else if (direccion == false){//Menos volumen
				if (estacion >=87.9  && estacion <=107.9){
					estacion = estacion - 0.2;
				}
			}
		}
	}
	
//GETS Y SETS
	
	//ESTADO
	public boolean getEstado(){
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	//AM/FM
	public boolean getFrecuencia() {
		return amfm;
	}
	public void setFrecuencia(boolean amfm) {
		this.amfm = amfm;
	}
	
	//LISTA
	public String[] getEstacionesFav() {
		return estacionesFav;
	}
	public void setEstacionesFav(String[] estacionesFav) {
		this.estacionesFav = estacionesFav;
	}
	//ESTACION
	public double getEstacion() {
		return estacion;
	}
	public void setEstacion(double estacion) {
		this.estacion = estacion;
	}

}	