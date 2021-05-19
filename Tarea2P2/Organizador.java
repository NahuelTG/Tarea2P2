import java.util.ArrayList;
/**
 * Write a description of class Organizador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Organizador
{
    private ArrayList<Estudiante> Lista;
    private int ListaEstudiantes;
    public Organizador(int nroEstudiantes, Estudiante Estudiante){
        Lista = new ArrayList<Estudiante>();
        for(int i = 0;i < nroEstudiantes;i++){
            Estudiante = new Estudiante();
            if(Lista.add(Estudiante)){
                ListaEstudiantes++;
            }
        }
    }
    /*
     * El primer estudiante esta en la casilla 0, el segundo estudiante 
     * esta en la casilla 1 y asi sucesivamente.
     */
    public void AniadirNotas(int Casilla, int Nota){
        Nota = Lista.get(Casilla).setNota(Nota);
    }
    public int PromedioNotas(){
        int Notas = 0;
        for(int i = 0; i < Lista.size();i++){
            Notas = Notas + Lista.get(i).getNota();
        }
        Notas = Notas / Lista.size();
        return Notas;
    }
    public int PromedioNotasAprobadas(){
        int Notas = 0;
        int P = 0;
        for(int i = 0; i < Lista.size();i++){
            if(Lista.get(i).getNota() > 50){
                Notas = Notas + Lista.get(i).getNota();
                P++;
            }
        }
        Notas = Notas / P;
        return Notas;
    }
    public int NroEstudiantesAprobados(){
        int Aprobados = 0;
        for(int i = 0;i < Lista.size();i++){
            if(Lista.get(i).getNota() > 50){
                Aprobados++;
            }
        }
        return Aprobados;
    }
    public int NroEstudiantesReprobados(){
        int Reprobados = 0;
        for(int i = 0;i < Lista.size();i++){
            if(Lista.get(i).getNota() <= 50){
                Reprobados++;
            }
        }
        return Reprobados;
    }
    public int NotaMasAlta(){
        int NotaAlta = 0;
        int nota = 0;
        for(int i = 0;i < Lista.size();i++){
            int Nota = Lista.get(i).getNota();
            int n = 0;
            for(int b = 0;b < Lista.size();b++){
                if(Nota < Lista.get(b).getNota()){
                    nota= Lista.get(b).getNota();
                    n++;
                     if(n == 0){
                        NotaAlta = nota;
                    }
                }
                if(NotaAlta < nota){
                    NotaAlta = nota;
                }
            }
        }
        return NotaAlta;
    }
    public int getNota(int i){
        return Lista.get(i).getNota();
    }
    public int Lista(){
        return Lista.size();
    }
}
