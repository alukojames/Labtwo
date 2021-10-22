import ru.ifmo.se.pokemon.*;

public class Double_Team extends StatusMove {
    public Double_Team(){
        super(Type.NORMAL,0,100);
    }


    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.EVASION,2);
    }

    protected String describe() {
        return "Evasion is raised by one stage";
    }

}
