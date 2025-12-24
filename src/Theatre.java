import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Василий", "Грязных", Gender.MALE, 175);
        Actor actor2 = new Actor("Василий", "Грязнов", Gender.MALE, 176);
        Actor actor3 = new Actor("Василиса", "Премудрая", Gender.FEMALE, 177);
        Director director1 = new Director("Кабан", "Кабаныч", Gender.MALE, 100500);
        Director director2 = new Director("Кабаниха", "Кабанычна", Gender.FEMALE, 100500);
        MusicAuthor musicAuthor = new MusicAuthor("Игорь", "Козлов", Gender.MALE);
        Choreographer choreographer = new Choreographer("Иван", "Баранов", Gender.MALE);

        Show show =  new Show("Обычный", 120, director1, new ArrayList<>());
        Opera opera =  new Opera("Оперный", 360, director2, new ArrayList<>(), musicAuthor, "текст либретто 1", 5);
        Ballet ballet =  new Ballet("Балет", 180, director1, new ArrayList<>(), musicAuthor, "текст либретто 2", choreographer);

        show.addActor(actor1);
        opera.addActor(actor1);
        opera.addActor(actor2);
        ballet.addActor(actor2);
        ballet.addActor(actor3);

        show.printActors();
        opera.printActors();
        ballet.printActors();

        show.replaceActor(actor3, actor1.getSurname());
        show.printActors();

        opera.printLibrettoText();
        ballet.printLibrettoText();
    }
}
