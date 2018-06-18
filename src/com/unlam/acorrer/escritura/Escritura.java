package com.unlam.acorrer.escritura;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.concurrent.ThreadLocalRandom;

public class Escritura {

	

	
	public static void main(String[] args){
		File f;
		FileWriter fw;
		BufferedWriter bw;
		try{
			f = new File("ejemplo.in");
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			
			bw.append("1000000");
			bw.append(" ");
			bw.append("60");
			bw.append(" ");
			bw.append("60");
			bw.append(" ");
			bw.append("1000000");
			bw.newLine();
			Integer minF = 10;
			Integer maxF = 69;
		
			while(minF<=maxF){
				bw.append(minF.toString());
				bw.append(" ");
				bw.append(minF.toString());
				bw.newLine();
				minF++;
			}
			minF=10;
			while(minF<=maxF){
				bw.append(minF.toString());
				bw.append(" ");
				bw.append(minF.toString());
				bw.newLine();
				minF++;
			}
			int n = 10;
			int a = 100000;
			while(n!=0){
				while(a!=0){
					Integer edad = ThreadLocalRandom.current().nextInt(10, 60);
					char sexo = edad<40?'F':'M';
					bw.append(edad.toString());
					bw.append(" ");
					bw.append(sexo);
					bw.newLine();
					a--;
				}
				a=100000;
				n--;
			}
			
			n= 10;
			a=100000;
			HashSet<Integer> tabla = new HashSet<>();
			Integer nroInscripto = 1;
			while(n!=0){
				while(a!=0){
					
					
					
						bw.append(nroInscripto.toString());
						bw.newLine();
						a--;
						nroInscripto++;
					
					
				}
				a=100000;
				n--;
			}
			
			bw.flush();
		}catch(Exception ex){
			
		}
	}
}
