import ru.ifmo.se.pokemon.*;

public class Seadra extends Horsea{
    public Seadra(String name, int level){
        super(name,level);
        setType(Type.WATER);
        setStats(55,65,95,95,45,85);
        addMove(new Work_Up());

    }
}
