package Pokem0n1;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import MovesGlobal.ThunderBolt;
import MovesGlobal.DoubleTeam;
public class Pichu extends Pokemon{
    public Pichu(String name, int level){
        super(name, level);
        super.setType(Type.ELECTRIC);
        super.setStats(20,40,15,35,35,60);
        ThunderBolt thunderBolt = new ThunderBolt(90,100);
        DoubleTeam DoubleTeam = new DoubleTeam(100);
        super.setMove(DoubleTeam,thunderBolt);
    }
}
