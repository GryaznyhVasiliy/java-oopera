import java.util.ArrayList;

public class Show {
    protected final String title;
    protected final int duration; //В минутах
    protected final Director director;
    protected final ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printActors() {
        System.out.println("Актёры спектакля " + title);
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        for (Actor existingActor : listOfActors) {
            if (existingActor.equals(actor)) {
                System.out.println("Такой актёр уже является участником шоу. Он не будет добавлен");
                return;
            }
        }
        listOfActors.add(actor);
        System.out.println("Актёр добавлен");
    }

    public void replaceActor(Actor actor, String surnameToReplace) {
        for (Actor existingActor : listOfActors) {
            if (existingActor.getSurname().equals(surnameToReplace)) {
                listOfActors.remove(existingActor);
                listOfActors.add(actor);
                System.out.println("Актёр заменён");
                return;
            }
        }
        System.out.println("Актёр с такой фамилией отсутствует");
    }

    public void printDirectorInfo() {
        System.out.println("Информация о режиссёре спектакля " + this.title);
        this.director.printInfo();
    }
}
