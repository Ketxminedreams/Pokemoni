package Pokem0n1;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import MovesGlobal.AquaTail;
import MovesGlobal.Rest;
import MovesGlobal.Bulldoze;
public class barboach extends Pokemon{
    public barboach(String name, int level){
        super(name,level);
        super.setType(Type.WATER,Type.GROUND);
        super.setStats(50,48,43,46,41,60);
        AquaTail AquaTail = new AquaTail(90,90);
        Rest Rest = new Rest(100);
        Bulldoze Buldoze = new Bulldoze(60,100);
        super.setMove(AquaTail,Buldoze,Rest);
    }

}
