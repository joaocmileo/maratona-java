package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.testes;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    static void main() {
        Estudante est = new Estudante();
        Estudante est2 = new Estudante();

        System.out.println(est.idade);
        System.out.println(est.nome);
        System.out.println(est.sexo);

        est2.nome = "Sanji";

        System.out.println(est2.idade);
        System.out.println(est2.nome);
        System.out.println(est2.sexo);


    }
}
