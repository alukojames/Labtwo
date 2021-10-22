import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove{
    public Rest(){
        super(Type.PSYCHIC,0,100);
    }


    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().condition(Status.SLEEP).turns(2));
        pokemon.setMod(Stat.HP,1);
    }

    protected String describe() {
        return "User sleeps for two turns and is completely healed";
    }

}
