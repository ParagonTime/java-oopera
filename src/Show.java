import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director,
                ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printActors() {
        listOfActors.forEach(System.out::println);
    }

    public void printDirectorInfo() {
        System.out.println(director);
    }

    public void addActorToShow(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актер уже в списке");
        } else {
            listOfActors.add(actor);
        }
    }

    public void replaceActor(Actor newActor, String srcSurname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname() == srcSurname) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.printf("Актер с фамилией %s отсутствует \n", srcSurname);
    }
}
