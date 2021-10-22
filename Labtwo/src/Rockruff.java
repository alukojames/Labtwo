import ru.ifmo.se.pokemon.*;

public class Rockruff extends Pokemon{
    public Rockruff(String name, int level){
        super(name,level);
        setType(Type.ROCK);
        setStats(45,65,40,30,40,60);
        setMove(new Double_Team(), new Thunderbolt(), new Swagger());
    }

}
