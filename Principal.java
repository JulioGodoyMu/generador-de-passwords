package cl.juliogodoymunoz.Contrase�a;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
          
          int numContrase�as=Integer.parseInt(JOptionPane.showInputDialog("introdusca el numero de contrase�as a generar:"));
          int largoContrase�a;
          do{
        	 largoContrase�a=Integer.parseInt(JOptionPane.showInputDialog("introdusca el numero de caracteres de la contrase�a:"));		
          }while(largoContrase�a<13); 
            Contrase�a[] contrase�a=new Contrase�a[numContrase�as];
          for(int i=0;i<numContrase�as;i++) {
        	  contrase�a[i]=new Contrase�a(largoContrase�a);
        	  do {
        		contrase�a[i].generarContrase�as(); 
        	  }while(!contrase�a[i].contrase�aDebil());
        	
          }
          for(int j=0;j<contrase�a.length;j++) {
        	  System.out.println(contrase�a[j].getContrase�a()+"  j = "+j);
          }
          System.out.println(Contrase�a.contador);
        }

}
