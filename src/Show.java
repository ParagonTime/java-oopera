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
        int count = 0;
        int indexForReplace = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(srcSurname)) {
                indexForReplace = i;
                count++;
            }
        }
        if (indexForReplace < 0) {
            System.out.printf("Актер с фамилией %s отсутствует \n", srcSurname);
            return;
        } else if (count > 1) {
            System.out.printf("Найдено десколько актеров с фамилией %s \n", srcSurname);
            return;
        }
        listOfActors.set(indexForReplace, newActor);
    }
}
