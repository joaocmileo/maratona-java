package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.testes;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    static void main() {
        Estudante estudante = new Estudante();
        estudante.idade = 18;
        estudante.nome = "João Paulo";
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);


    }


}
