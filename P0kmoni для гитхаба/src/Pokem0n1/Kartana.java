package Pokem0n1;
import MovesGlobal.DoubleEdge;
import MovesGlobal.StoneEdge;
import MovesGlobal.Swagger;
import MovesGlobal.IronDefense;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Kartana extends Pokemon{
    public Kartana(String name,int level){
        super(name, level);
        super.setType(Type.GRASS, Type.STEEL);
        super.setStats(59,181,131,59,31,109);
        DoubleEdge DoubleEdge = new DoubleEdge(120,100);
        StoneEdge StoneEdge = new StoneEdge(100,80);
        Swagger Swagger = new Swagger(85);
        IronDefense IronDefence = new IronDefense(100);
        super.setMove(IronDefence,Swagger,StoneEdge,DoubleEdge);
    }
}
