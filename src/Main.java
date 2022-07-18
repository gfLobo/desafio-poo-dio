import br.com.desafio.dio.dominio.Bootcamp;
import br.com.desafio.dio.dominio.Curso;
import br.com.desafio.dio.dominio.Dev;
import br.com.desafio.dio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso cursoJavaScript = new Curso();
        cursoJavaScript.setTitulo("JavaScript Avançado");
        cursoJavaScript.setDescricao("Desvendando o JavaScript");
        cursoJavaScript.setCargaHoraria(8);

        Curso cursoTypeScript = new Curso();
        cursoTypeScript.setTitulo("TypeScript Avançado");
        cursoTypeScript.setDescricao("Desvendando o TypeScript");
        cursoTypeScript.setCargaHoraria(4);

        Mentoria mentoriaReact = new Mentoria();
        mentoriaReact.setTitulo("Mentoria React.js");
        mentoriaReact.setDescricao("Tire dúvidas sobre atividades e planejamento de carreira.");


        Bootcamp bootcampReact = new Bootcamp();
        bootcampReact.setNome("React.js");
        bootcampReact.setDescricao("Sua jornada pelo desenvolvimento Web começa aqui!");
        bootcampReact.getConteudos().add(cursoJavaScript);
        bootcampReact.getConteudos().add(cursoTypeScript);
        bootcampReact.getConteudos().add(mentoriaReact);

        Dev dev1 = new Dev();
        dev1.setNome("Gustavo");

        Dev dev2 = new Dev();
        dev2.setNome("João");

        dev1.inscreverBootcamp(bootcampReact);
        dev2.inscreverBootcamp(bootcampReact);

        System.out.println("Inscrições no bootcamp " + bootcampReact.getNome() + ":\n" + bootcampReact.getDevsInscritosStringfy() + "\n\n\n\n");


        System.out.println(dev1.getNome() + dev1.getConteudosInscritos());
        System.out.println(dev1.getNome() + " XP= " + dev1.calcularTotalXP());
        System.out.println(dev2.getNome() + dev2.getConteudosInscritos());
        System.out.println(dev2.getNome() + " XP= " + dev2.calcularTotalXP());

        System.out.println("\n\nConcluindo curso(s)...");
        dev1.progredir(cursoJavaScript.getId());
        dev1.progredir(cursoTypeScript.getId());
        dev2.progredir(cursoTypeScript.getId());
        System.out.println("\nConteúdos inscritos:");
        System.out.println(dev1.getNome() + dev1.getConteudosInscritos());
        System.out.println(dev2.getNome() + dev2.getConteudosInscritos());
        System.out.println("\nConteúdos concluídos:");
        System.out.println(dev1.getNome() + dev1.getConteudosConcluidos());
        System.out.println(dev1.getNome() + " XP= " + dev1.calcularTotalXP());
        System.out.println(dev2.getNome() + dev2.getConteudosConcluidos());
        System.out.println(dev2.getNome() + " XP= " + dev2.calcularTotalXP());

    }
}
