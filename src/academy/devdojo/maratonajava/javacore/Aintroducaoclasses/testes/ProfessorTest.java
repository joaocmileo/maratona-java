package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.testes;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest {
    static void main() {

        Professor prof = new Professor();

        prof.nome = "Dorivral";
        prof.idade = 63;
        prof.sexo = 'M';

        System.out.println("|Nome: "+prof.nome+"| |Idade: "+prof.idade+ "| |Sexo: "+prof.sexo+"|");

    }
}
