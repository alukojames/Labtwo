import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
    public Thunder(){
        super(Type.ELECTRIC,110,17);
    }


    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random()<=0.3)
            Effect.paralyze(pokemon);
    }


    protected void applyOppDamage(Pokemon pokemon, double v) {
        super.applyOppDamage(pokemon, v);
    }


    protected String describe() {
        return "Target is paralysed";
    }
}
