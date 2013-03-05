/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prgitejemplo;

/**
 * @author Sanjay
 */
public class GitAux {
    
    public void metodoAlumno1(){
        System.out.println("metodo 1");
        System.out.println("modificado por alumno 1"); //alumno 1
    }
    
    public void metodoAlumno2(){
        System.out.println("metodo 2");
        System.out.println("MEGAMODIFICACION DEL ALUMNO 2"); // alumno 2

    }
    
    public void metodoComunitario(){
        System.out.println("Aqui escribimos todos");

        //modificaciones alumno 1
        System.out.println("Alumno 1 inserta esta sentencia");
	//OTRO MODIFICACION!!!!!!!TOMAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
        System.out.println("Alumno 1 inserta esta sentencia OTRA VEZZZ");


        //SUPER ULTRA MODIFICACION alumno 2 QUE SE QUEDAN :DDDD
        System.out.println("Alumno 2 esta hiperescribiendo.");

    }

    public void testGitAux (){
       //metodo rama testing
     System.out.println ("Metodo de testing");
    }
}
