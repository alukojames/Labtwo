import ru.ifmo.se.pokemon.*;

public class Work_Up extends StatusMove{
    public Work_Up(){
        super(Type.NORMAL,0,100);
    }

        protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK,1);
        pokemon.setMod(Stat.SPECIAL_ATTACK,1);
    }


    protected String describe() {
        return "The user's Attack and Special Attack is raised by one stage each";
    }
}
