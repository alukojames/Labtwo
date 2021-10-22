import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove{
    public Swagger(){
        super(Type.NORMAL,0,85);
    }

    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK,2);
        Effect.confuse(pokemon);
    }


    protected String describe() {
        return "Target is confused";
    }
}
