import ru.ifmo.se.pokemon.*;

public class Lycanroc extends Rockruff{
    public Lycanroc(String name, int level){
        super(name,level);
        setType(Type.ROCK);
        setStats(75,115,65,55,65,112);
        addMove(new Swagger());
    }

}
