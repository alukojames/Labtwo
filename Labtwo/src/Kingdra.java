import ru.ifmo.se.pokemon.*;

public class Kingdra extends Seadra{
    public Kingdra(String name, int level){
        super(name,level);
        setStats(75,95,95,95,95,85);
        setType(Type.WATER,Type.DRAGON);
        addMove(new Brutal_Swing());
    }

}
