import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Victini extends Pokemon{
    public Victini(String name, int level){
        super(name,level);
        setType(Type.PSYCHIC,Type.FIRE);
        setStats(100,100,100,100,100,100);
        setMove(new Swagger(), new Screech(), new Low_Sweep(), new Work_Up());
    }

}
