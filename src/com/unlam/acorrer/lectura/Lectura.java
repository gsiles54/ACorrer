package com.unlam.acorrer.lectura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.unlam.acorrer.carrera.Categoria;
import com.unlam.acorrer.carrera.Inscripto;

public class Lectura {

	Integer cantInscriptos;
	Integer cantCatF;
	Integer cantCatM;
	Integer corredoresArribados;
	List<Categoria> listaCategorias;
	List<Inscripto> listaInscripto;
	
	public Lectura() {
		
	}
	
	public void leerEntrada() {
		File f = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			f = new File("entrada.in");
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			listaInscripto = new ArrayList<>();
			
			String linea=br.readLine();
			String[] valores = linea.split(" ");
			
			
			cantInscriptos = Integer.valueOf(valores[0]);
			cantCatF = Integer.valueOf(valores[1]);
			cantCatM = Integer.valueOf(valores[2]);
			corredoresArribados = Integer.valueOf(valores[3]);
			
			Categoria[] categoriasM = new Categoria[cantCatM*80];
			Categoria[] categoriasF = new Categoria[cantCatF*80];
			
			int[][] puestosPorCategoria = new int[cantCatF+cantCatM][4];
	

				for( int i = 0 ; i < cantCatF && (linea =br.readLine())!=null ; i++){
					valores = linea.split(" ");

					System.out.println(i);
					System.out.println(valores[0] + " " + valores[1]);
					for(int j = Integer.valueOf(valores[0]) ; j <= Integer.valueOf(valores[1]) ; j++) {
						categoriasF[j] = new Categoria('F',Integer.valueOf(valores[0]),Integer.valueOf(valores[1]),i+1);
					}
				}
				for( int i = 0 ; i < cantCatM && (linea =br.readLine())!=null ; i++){
					valores = linea.split(" ");
					System.out.println(i);
					System.out.println(valores[0] + " " + valores[1]);
					for(int j = Integer.valueOf(valores[0]) ; j <= Integer.valueOf(valores[1]) ; j++) {
						categoriasM[j] = new Categoria('M',Integer.valueOf(valores[0]),Integer.valueOf(valores[1]),i+1);
						}
					}
				
				for(int i = 0 ; i < cantInscriptos && (linea =br.readLine())!=null ;  i++) {
					valores = linea.split(" ");
					Integer edad = Integer.valueOf(valores[0]);
					char sexo = valores[1].charAt(0);
					Categoria categoriaInscripto = (sexo=='M')?categoriasM[edad]:categoriasF[edad];
					listaInscripto.add(new Inscripto (edad,sexo,i+1,categoriaInscripto));
				}
				int cont = 0;
				for(int i = 0 ;  i < corredoresArribados && (linea =br.readLine())!=null ; i++) {
					Integer nroInscripto = Integer.valueOf(linea);
					Inscripto corredorEnMeta = listaInscripto.get(nroInscripto-1);
					cont++;
					if(corredorEnMeta.getSexo()=='F'){
						int primerPuesto =puestosPorCategoria[corredorEnMeta.getCategoria().getOrden()-1][1];
						if(primerPuesto==0){
							puestosPorCategoria[corredorEnMeta.getCategoria().getOrden()-1][1]=corredorEnMeta.getNroOrden();								
						}else{
							int segundoPuesto = puestosPorCategoria[corredorEnMeta.getCategoria().getOrden()-1][2];
							if(segundoPuesto==0){
								puestosPorCategoria[corredorEnMeta.getCategoria().getOrden()-1][2]=corredorEnMeta.getNroOrden();								
							}else{
								int tercerPuesto = puestosPorCategoria[corredorEnMeta.getCategoria().getOrden()-1][3];
								if(tercerPuesto==0){
									puestosPorCategoria[corredorEnMeta.getCategoria().getOrden()-1][3]=corredorEnMeta.getNroOrden();								
								}
							}
						}
					}else{
						int primerPuesto = puestosPorCategoria[corredorEnMeta.getCategoria().getOrden()-1+cantCatF][1];
						if(primerPuesto==0){
							puestosPorCategoria[corredorEnMeta.getCategoria().getOrden()-1+cantCatF][1]=corredorEnMeta.getNroOrden();								
						}else{
							int segundoPuesto = puestosPorCategoria[corredorEnMeta.getCategoria().getOrden()-1+cantCatF][2];
							if(segundoPuesto==0){
								puestosPorCategoria[corredorEnMeta.getCategoria().getOrden()-1+cantCatF][2]=corredorEnMeta.getNroOrden();								
							}else{
								int tercerPuesto = puestosPorCategoria[corredorEnMeta.getCategoria().getOrden()-1+cantCatF][3];
								if(tercerPuesto==0){
									puestosPorCategoria[corredorEnMeta.getCategoria().getOrden()-1+cantCatF][3]=corredorEnMeta.getNroOrden();								
								}
							}
						}
					}
				}
				
				for(int i = 0 ; i < cantCatF+cantCatM ; i++){
					for( int j  = 0 ; j < 4 ; j++){
						System.out.print(puestosPorCategoria[i][j] + " ");
					}
					System.out.println();
				}
			System.out.println(cont);
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[]args) {
		Lectura lec = new Lectura();
		lec.leerEntrada();
	}
}
