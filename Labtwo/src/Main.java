import ru.ifmo.se.pokemon.*;

public class Main{
    public static void main(String[] args) {
        System.out.println("Battle begins!!");
        Battle battle = new Battle();
        Victini victini = new Victini("Knight 1",1);
        Kingdra kingdra = new Kingdra("Knight 2",1);
        Rockruff rockruff = new Rockruff ("Knight 3",1);
        Seadra seadra = new Seadra ("Knight 4",1);
        Lycanroc lycanroc = new Lycanroc("Knight 5",1);
        Horsea horsea= new Horsea("Knight 6",1);

        battle.addAlly(victini);
        battle.addAlly(kingdra);
        battle.addAlly(rockruff);
        battle.addFoe(seadra);
        battle.addFoe(lycanroc);
        battle.addFoe(horsea);
        battle.go();

        System.out.println("Battle ends!");
        System.out.println();
        System.out.println();

    }
}
