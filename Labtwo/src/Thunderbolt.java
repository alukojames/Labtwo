import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove {
    public Thunderbolt(){
        super(Type.ELECTRIC,90,100);
    }

    protected void applyOppDamage(Pokemon pokemon, double v) {
        super.applyOppDamage(pokemon, 1);
    }

    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random()<=0.1);
        Effect.paralyze(pokemon);
    }
}
