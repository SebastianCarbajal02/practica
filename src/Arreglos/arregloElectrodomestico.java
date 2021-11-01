package Arreglos;

import clases.Electrodomesticos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class arregloElectrodomestico {
	private ArrayList <Electrodomesticos> electrodomesticos  = new ArrayList<Electrodomesticos>();
	
	
	//Constructor
	
    public arregloElectrodomestico() {
    	electrodomesticos = new ArrayList <Electrodomesticos> ();
   	 /*(String nombre, String img, double kwhElectrodomestico, double hUso, int cantidad)*/
    	electrodomesticos.add(new Electrodomesticos("Computadora", "img/pc.png", 0.720, 1.0, 1));
    	electrodomesticos.add(new Electrodomesticos("Foco ahorrador", "img/pc.png", 0.15, 1.0, 1));
    	electrodomesticos.add(new Electrodomesticos("Cocina", "img/pc.png", 4.50, 1.0, 1));
    	electrodomesticos.add(new Electrodomesticos("TV", "img/pc.png", 0.12, 1.0, 1));
    	electrodomesticos.add(new Electrodomesticos("Terma", "img/pc.png",  1.50, 1.0, 1));
    	electrodomesticos.add(new Electrodomesticos("Equipo de video", "img/pc.png", 0.02, 1.0, 1));
    	electrodomesticos.add(new Electrodomesticos("Equipo de sonido", "img/pc.png", 0.03, 1.0, 1));
    	electrodomesticos.add(new Electrodomesticos("Foco incandecente", "img/pc.png", 0.40, 1.0, 1));
    	electrodomesticos.add(new Electrodomesticos("Foco led", "img/pc.png", 0.01, 1.0, 1));
    	electrodomesticos.add(new Electrodomesticos("Hervidor", "img/pc.png", 1.50, 1.0, 1));
    	electrodomesticos.add(new Electrodomesticos("Lavadora", "img/pc.png", 0.50, 1.0, 1));
    	electrodomesticos.add(new Electrodomesticos("Licuadora", "img/pc.png", 0.60, 1.0, 1));
    	electrodomesticos.add(new Electrodomesticos("Aspiradora", "img/pc.png", 1.40, 1.0, 1));
    	electrodomesticos.add(new Electrodomesticos("Microondas", "img/pc.png", 1.10, 1.0, 1));
    	electrodomesticos.add(new Electrodomesticos("Olla arrosera", "img/pc.png", 1.00, 1.0, 1));
    	electrodomesticos.add(new Electrodomesticos("Plancha", "img/pc.png", 1.00, 1.0, 1));
    	electrodomesticos.add(new Electrodomesticos("Celular", "img/pc.png", 0.03, 1.0, 1));
    	electrodomesticos.add(new Electrodomesticos("Refrigeradora", "img/pc.png", 0.30, 1.0, 1));
    	electrodomesticos.add(new Electrodomesticos("Secador de cabello", "img/pc.png", 1.20, 1.0, 1));
    	electrodomesticos.add(new Electrodomesticos("Ventilador", "img/pc.png", 0.05, 1.0, 1));
    	electrodomesticos.add(new Electrodomesticos("Calentador", "img/pc.png", 1.50, 1.0, 1));
    	electrodomesticos.add(new Electrodomesticos("Ducha Electrica", "img/pc.png", 4.00, 1.0, 1));
    	electrodomesticos.add(new Electrodomesticos("Aire Acondicionado", "img/pc.png", 2.00, 1.0, 1));
    	
    	cargarElectrodomestico();
    }
	
	 private void adicionar(Electrodomesticos x) {
		electrodomesticos.add(x);
		grabarElectrodomesticos();
	}
	//Tamaño del arreglo

	 public int tamanio(){
		 return electrodomesticos.size();
	 }
	 
	 //Obtener objeto
	 public Electrodomesticos obtener(int i){
		 return electrodomesticos.get(i);
	 }
	 
	 //Buscar por el nombre del artefacto
	 
	 public Electrodomesticos buscar(String nombre){
		 Electrodomesticos x;
		 for(int i = 0; i<tamanio(); i++){
			 x = obtener(i);
			 if(x.getNombre().equals(nombre)){
				 return x;
			 }
		 }
		 return null;
	 }
	 
	 //Eliminar objeto
	 public void eliminar(Electrodomesticos x){
		 electrodomesticos.remove(x);
		 grabarElectrodomesticos();
	 }
	 
	 //Para actualizar el arreglo en dlg
	 
	 public void actualizarArchivo(){
		 grabarElectrodomesticos();
	 }
	 
	 //Grabar alumno
	 
	 private void grabarElectrodomesticos(){
		 try {
			PrintWriter pw;
			String linea;
			Electrodomesticos x;
			//Creamos un archivo de texto que guardara la clase
			pw = new PrintWriter(new FileWriter("Electro.txt"));
			for(int i= 0; i<tamanio(); i++){
				x = obtener(i);
				/*String nombre, String img, double kwhElectrodomestico, double hUso, int cantidad*/
				linea = x.getNombre() + ";" + 
				        x.getImg() + ";" + 
						x.getKwhElectrodomestico() + ";" +
				        x.gethUso() + ";" +
						x.getCantidad();
				//Guardamos el fichero en la línea de texto que creamos
				pw.println(linea);
			}
			pw.close();
		} catch (Exception e) {
		}
	 }
	 
	 //Cargar los archivos
	 private void cargarElectrodomestico(){
		 try {
			BufferedReader br;
			String linea, nombre, img;
			double kwhElectrodomestico, hUso;
			int cantidad;
			String[] s;
			
			br = new BufferedReader(new FileReader("Electro.txt"));
			
			while ((linea = br.readLine()) != null) {
				/*String nombre, String img, double kwhElectrodomestico, double hUso, int cantidad*/
				s = linea.split(";");
				nombre = s[0].trim();
				img = s[1].trim();
				kwhElectrodomestico = Double.parseDouble(s[2].trim());
				hUso = Double.parseDouble(s[3].trim());
				cantidad = Integer.parseInt(s[4].trim());
				
				adicionar(new Electrodomesticos(nombre, img, kwhElectrodomestico, hUso, cantidad));
				
			}
			br.close();
			 
		} catch (Exception e) {
		}
	 }
	
	
	
	
	
	
	
	
	
	

}



