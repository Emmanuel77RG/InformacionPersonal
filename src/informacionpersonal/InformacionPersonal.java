
package informacionpersonal;

/**
 *
 * @author maryse
 * 
 * Programa para imprimir cadenas en Java 
 * 
 */

public class InformacionPersonal {

    String nombre = "Emmanuel",
           apellido_paterno = "Rojas",
           apellido_materno = "Gonzalez";
    int centa = 1913085;
    String semestre_en_curso = "2° Semestre";
    String Primera_materia = "Programacion";
    String Primer_horario = "Martes y Jueves de 10am - 12:30pm";
    String Segunda_materia = "Teoria de Sistemas";
    String Segundo_horario = "Lunes y Miercoles de 9am - 10:30am";
    String Tercera_materia = "Ingles";
    String Tercer_horario = "Miercoles y Viernes de 7am - 9am";
    
    public void Informacion(){        
        System.out.println("El nombre completo de la persona es: " + nombre +" "+ apellido_paterno +" "+ apellido_materno );
        System.out.println("Su numero de cuenta es: " + centa);
        System.out.println("El semestre que cursa es: SEGUNDO SEMESTRE" + semestre_en_curso);
        System.out.println("Materias que cursa:");
        System.out.println(Primera_materia+" "+Primer_horario);
        System.out.println(Segunda_materia+" "+Segundo_horario);
        System.out.println(Tercera_materia+" "+Tercer_horario);
    }
    
    public static void main(String[] args) {
        InformacionPersonal informacion= new InformacionPersonal();
        informacion.Informacion();
                
    }
    
}
