package cl.juliogodoymunoz.Contraseña;

import java.util.Random;

public class Contraseña {
	
       static long contador=0;
       private int largoContraseña;
       private String contraseña;
      
       
	   public  Contraseña(int largoContraseñas) {
		  
		  largoContraseña=largoContraseñas;
		  
		  generarContraseñas();
		  }
	   
	   public void generarContraseñas() {
		   	 contraseña="";
		   	 contador++;
			 char aux;
			 Random rnd=new Random();
			 for(int j=0;j<largoContraseña;j++) {
			 int rndAux=rnd.nextInt(122);
			 if((rndAux>47&&rndAux<58)||(rndAux>64&&rndAux<91)||(rndAux>96&&rndAux<123)) {
				 aux=(char)rndAux;
				 contraseña=contraseña+aux;
			   }else {
				 j=j-1;
			   }
		     }
	   }
	   
	   public boolean contraseñaDebil() {
		  boolean retorno=false;
		  int contMay=0,contMin=0,contNum=0;
		  byte[] arregloByte=contraseña.getBytes();
		  for(int i=0;i<arregloByte.length;i++) {
			  if(arregloByte[i]>47&&arregloByte[i]<58) {
				  contNum++;
			  }else if(arregloByte[i]>64&&arregloByte[i]<91) {
				  contMay++;
			  }else if(arregloByte[i]>96&&arregloByte[i]<123) {
				  contMin++;
			  }
		  }
		  if(contNum>9&&contMay>1&&contMin>0)
			  retorno=true;
		  return retorno;
	   }
	   public String getContraseña() {
		   return contraseña;
	   }
	   public int getLargo() {
		   return largoContraseña;
	   }
}
