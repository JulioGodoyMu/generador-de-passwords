package cl.juliogodoymunoz.Contrase�a;

import java.util.Random;

public class Contrase�a {
	
       static long contador=0;
       private int largoContrase�a;
       private String contrase�a;
      
       
	   public  Contrase�a(int largoContrase�as) {
		  
		  largoContrase�a=largoContrase�as;
		  
		  generarContrase�as();
		  }
	   
	   public void generarContrase�as() {
		   	 contrase�a="";
		   	 contador++;
			 char aux;
			 Random rnd=new Random();
			 for(int j=0;j<largoContrase�a;j++) {
			 int rndAux=rnd.nextInt(122);
			 if((rndAux>47&&rndAux<58)||(rndAux>64&&rndAux<91)||(rndAux>96&&rndAux<123)) {
				 aux=(char)rndAux;
				 contrase�a=contrase�a+aux;
			   }else {
				 j=j-1;
			   }
		     }
	   }
	   
	   public boolean contrase�aDebil() {
		  boolean retorno=false;
		  int contMay=0,contMin=0,contNum=0;
		  byte[] arregloByte=contrase�a.getBytes();
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
	   public String getContrase�a() {
		   return contrase�a;
	   }
	   public int getLargo() {
		   return largoContrase�a;
	   }
}
