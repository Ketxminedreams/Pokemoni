package Pokem0n1;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import MovesGlobal.AquaTail;
import MovesGlobal.Rest;
import MovesGlobal.Bulldoze;
import MovesGlobal.StoneEdge;
public class Whiscash extends Pokemon{
    public Whiscash(String name, int level){
        super(name, level);
        super.setType(Type.GROUND,Type.WATER);
        super.setStats(110,78,73,76,71,60);
        AquaTail AquaTail = new AquaTail(90,90);
        Rest Rest = new Rest(100);
        Bulldoze Buldoze = new Bulldoze(60,100);
        StoneEdge StoneEdge = new StoneEdge(100,100);
        super.setMove(AquaTail,Buldoze,StoneEdge,Rest);
    }
}
