package MovesGlobal;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;
public class Rest extends StatusMove{
    public Rest (double acc){
        super(Type.PSYCHIC,100,acc);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
       Effect e = new Effect().stat(Stat.HP,100);
       p.addEffect(e);
       Effect.sleep(p);
        System.out.println(p.toString() + "+HP");
    }
}
