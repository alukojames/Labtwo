import ru.ifmo.se.pokemon.*;

public class Low_Sweep extends PhysicalMove {
    public Low_Sweep(){
        super(Type.FIGHTING,65,100);
    }


    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPEED,-1);
    }


    protected String describe() {
        return "target's Speed is lowered by one stage";
    }
}
