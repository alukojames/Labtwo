import ru.ifmo.se.pokemon.*;

public class Brutal_Swing extends PhysicalMove{
    public Brutal_Swing(){
        super(Type.DARK,60,100);
    }


    protected void applyOppDamage(Pokemon pokemon, double damage) {
        pokemon.setMod(Stat.HP, (int)damage);
    }


    protected String describe() {
        return "regular damage inflicted";
    }
}
