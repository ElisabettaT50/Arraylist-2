import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con 12 elementi e stamparlo in console.
mettere in ordine la collezione e stampare il risultato
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        Student student1 = new Student("Maria Salvi", 29);
        Student student2 = new Student("Max Smith", 31);
        Student student3 = new Student("Sara Rossi", 26);
        Student student4 = new Student("Giulia Lalli", 24);
        Student student5 = new Student("Alex Verdi", 29);
        Student student6 = new Student("Anna Bianchi", 30);
        Student student7 = new Student("Gianni Zilli", 22);
        Student student8 = new Student("Sam Fahd", 24);
        Student student9 = new Student("Marco Rossi", 29);
        Student student10 = new Student("Gianna Blu", 30);
        Student student11 = new Student("Davide Till", 34);
        Student student12 = new Student("Nina Olen", 21);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);

        students.sort(Comparator.comparing(Student :: getName));

        System.out.println("Students in class: " + students);
    }
}
