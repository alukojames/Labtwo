import ru.ifmo.se.pokemon.*;

import java.util.concurrent.locks.Condition;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL,70,100);
    }


    protected void applyOppDamage(Pokemon pokemon, double damage){
        pokemon.setMod(Stat.HP,(int) damage);
        Status pokemonCondition = pokemon.getCondition();
        if (pokemonCondition.equals(Status.BURN)||(pokemonCondition.equals(Status.PARALYZE)||(pokemonCondition.equals(Status.POISON)))){
            pokemon.setMod(Stat.HP,2);
        }
    }


    protected String describe() {
        return "Attacker's power is doubled";
    }
}
