package test;

import java.text.DecimalFormat;
import java.util.Scanner;

public class main {

	
	public static void main(String args[]) {
		
		 double inversionInicial = 0;
		 double aportacionAnual = 0;
		 double porcentajeAnual = 0;
		 int anioInversion = 0;
		 double rendimientoInversion = 0;
		 Scanner in = new Scanner(System.in);
		System.out.println("Ingresar Inversion Inicial");
		inversionInicial = in.nextDouble();
		System.out.println("Ingresar Aportacion Anual");
		aportacionAnual = in.nextDouble();
		System.out.println("Ingresar Porcentaje Anual");
		porcentajeAnual = in.nextDouble();
		System.out.println("Años de inversion");
		anioInversion = in.nextInt();
		System.out.println("Rendimiento de inversion");
		rendimientoInversion = in.nextDouble();
		
		
		 
		 calcularTasa(inversionInicial,aportacionAnual,porcentajeAnual,anioInversion,rendimientoInversion);
		 
		 
		 
		 
		 
	}
	
	public static void calcularTasa(double inversionInicial, double aportacionAnual, double porcentajeAnual, int anioInversion, double rendimientoInversion ) {
		double aportacion=0;
		double rendimiento= 0;
		double saldoInicial= 0;
		double saldoFinal = 0;
		String salida ="";
		double montoFinal = 0;
		double ganaciarPorInversion = 0;
		double aportacionesAnuales =0;
		DecimalFormat formato = new DecimalFormat("#.00"); 
		if(inversionInicial >= 1000) {
			if(aportacionAnual >= 0) {
				if(porcentajeAnual >= 0) {
					if(anioInversion >0 ) {
						if(rendimientoInversion >0) {
							for(int c =0;c < anioInversion;c++) {
								if(c ==0) {
									aportacion = aportacionAnual;
									//System.out.println(aportacion);
								}else {  
									aportacion =     ((aportacion) * (1+ (porcentajeAnual/100)))  ; 
								}
								
								if(c == 0) {
									saldoInicial = inversionInicial;
									 
								} 
								
								
								rendimiento = ((saldoInicial + aportacion) * (rendimientoInversion/100));
								saldoFinal =  (saldoInicial + aportacion + rendimiento);
								
								/*
								 *  Esta parte la agregue por manejar los decimales pero hay discrepancia en los resultados con los resultados
								 *  del test.
								 *  
								 * if(aportacion % 2 != 0) {  
									if(Math.round(aportacion % 2)>=2) {
										aportacion = Math.floor(aportacion);
									}else {
										aportacion = Math.ceil(aportacion); 
									}
									
								}
								
								if(saldoInicial % 2 != 0) {  
									if(Math.round(saldoInicial % 2)>=2) {
										saldoInicial = Math.floor(saldoInicial);
									}else {
										saldoInicial = Math.ceil(saldoInicial); 
									}
									
								}
								
								if(rendimiento % 2 != 0) {  
									if(Math.round(rendimiento % 2)>=2) {
										rendimiento = Math.floor(rendimiento);
									}else {
										rendimiento = Math.ceil(rendimiento); 
									}
									
								}
								if(saldoFinal % 2 != 0) {  
									if(Math.round(saldoFinal % 2)>=2) {
										saldoFinal = Math.floor(saldoFinal);
									}else {
										saldoFinal = Math.ceil(saldoFinal); 
									}
									
								}
								 */
								  
								
								  salida+= (c+1)+ "       "+  formato.format(saldoInicial)  +"        "+formato.format(aportacion)+ "          " + formato.format(rendimiento)+ "         " + formato.format(saldoFinal)+ "\n";
								 
								 montoFinal = saldoFinal;
								 aportacionesAnuales += aportacion;
								 ganaciarPorInversion = montoFinal - inversionInicial - aportacionesAnuales;
								 saldoInicial = saldoFinal;
							}
							System.out.println("Ganancias por inversion: " + formato.format(ganaciarPorInversion));
							System.out.println("Monto Final: " + formato.format(montoFinal)); 
							System.out.println("Año || Saldo Inicial || Aportacion || Rendimiento || Saldo Final");
							System.out.println(salida);
							
						}else {
							System.out.println("No es posible procesar su solicitud con los datos proporcionados");
						}
					}else {
						System.out.println("No es posible procesar su solicitud con los datos proporcionados");
					}
				}else {
					System.out.println("No es posible procesar su solicitud con los datos proporcionados");
				}
			}else {
				System.out.println("No es posible procesar su solicitud con los datos proporcionados");
			}
		}else {
			System.out.println("No es posible procesar su solicitud con los datos proporcionados");
		}
		
	}
	
	
}
