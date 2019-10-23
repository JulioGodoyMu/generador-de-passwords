package cl.juliogodoymunoz.Contraseña;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
          
          int numContraseñas=Integer.parseInt(JOptionPane.showInputDialog("introdusca el numero de contraseñas a generar:"));
          int largoContraseña;
          do{
        	 largoContraseña=Integer.parseInt(JOptionPane.showInputDialog("introdusca el numero de caracteres de la contraseña:"));		
          }while(largoContraseña<13); 
            Contraseña[] contraseña=new Contraseña[numContraseñas];
          for(int i=0;i<numContraseñas;i++) {
        	  contraseña[i]=new Contraseña(largoContraseña);
        	  do {
        		contraseña[i].generarContraseñas(); 
        	  }while(!contraseña[i].contraseñaDebil());
        	
          }
          for(int j=0;j<contraseña.length;j++) {
        	  System.out.println(contraseña[j].getContraseña()+"  j = "+j);
          }
          System.out.println(Contraseña.contador);
        }

}
