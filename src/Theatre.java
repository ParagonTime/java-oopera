import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Ivan", "Ivanov", Gender.MAN, 184);
        Actor actor2 = new Actor("Anton", "Petrov", Gender.MAN, 185);
        Actor actor3 = new Actor("Max", "Sidorov", Gender.MAN, 186);
        Director director1 = new Director("Petr", "Petrov", Gender.MAN, 0);
        Director director2 = new Director("Misha", "Mamedov", Gender.MAN, 2);
        MusicAuthor musicAuthor = new MusicAuthor("Max", "Sidorov", Gender.WOMAN);
        Choreographer choreographer = new Choreographer("Maya", "Plisetskaya", Gender.WOMAN);
        MusicalShow spectacle = new MusicalShow("Nutcracker", 120, director1,
                new ArrayList<>(), musicAuthor, "Nutcracker next");
        Opera opera = new Opera("Carmen", 121, director2,
                new ArrayList<>(), musicAuthor, "Carmen text", 30);
        Ballet ballet = new Ballet("Swan lake", 123, director1,
                new ArrayList<>(), musicAuthor, "Swan lake text", choreographer);

        spectacle.addActorToShow(actor1);
        spectacle.addActorToShow(actor2);
        spectacle.addActorToShow(actor3);
        opera.addActorToShow(actor1);
        opera.addActorToShow(actor2);
        ballet.addActorToShow(actor1);
        ballet.addActorToShow(actor3);

        System.out.println("Spectacle actors: ");
        spectacle.printActors();
        System.out.println("Opera actors: ");
        opera.printActors();
        System.out.println("Ballet actors: ");
        ballet.printActors();

        opera.replaceActor(actor3, "Petrov");
        System.out.println("Opera actors: ");
        opera.printActors();

        ballet.replaceActor(actor2, "Pchelkin");

        System.out.print("opera libretto: ");
        opera.printLibretto();

        System.out.print("ballet libretto: ");
        ballet.printLibretto();
    }
}
