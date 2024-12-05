package Pokem0n1;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import MovesGlobal.ThunderBolt;
import MovesGlobal.DoubleTeam;
import MovesGlobal.Nuzzle;
public class Pikachu extends Pokemon{
    public Pikachu(String name, int level){
        super(name, level);
        super.setType(Type.ELECTRIC);
        super.setStats(35,55,40,50,50,90);
        ThunderBolt thunderBolt = new ThunderBolt(90,100);
        DoubleTeam DoubleTeam = new DoubleTeam(100);
        Nuzzle Nuzlle = new Nuzzle(20,100);
        super.setMove(Nuzlle,thunderBolt,DoubleTeam);
    }
}
