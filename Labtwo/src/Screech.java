import ru.ifmo.se.pokemon.*;

public class Screech extends StatusMove{
    public Screech(){
        super(Type.NORMAL,0,85);
    }


    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.DEFENSE,-2);
    }


    protected String describe() {
        return "Lowers the target's Defense by two stages";
    }
}
