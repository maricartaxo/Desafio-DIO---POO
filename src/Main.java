import br.com.dio.desafio.domínio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição curso java");
        mentoria.setData(LocalDate.now());

        Conteudo conteudo = new Curso();

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Develope");
        bootcamp.setDescricao("Descrição Bootcamp Java Delevoper");
        bootcamp.setConteudos().add(curso1);
        bootcamp.setConteudos().add(curso2);
        bootcamp.setConteudos().add(mentoria);

        Dev devMari = new Dev();
        devMari.setNome("Mari");
        devMari.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Mari" + devMari.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Mari" + devMari.getConteudosConcluidos());

        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Marcos" + devMarcos.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Marcos" + devMarcos.getConteudosConcluidos());



    }

}
