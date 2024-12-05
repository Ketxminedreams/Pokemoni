package MovesGlobal;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
public class DoubleTeam extends StatusMove{
    public DoubleTeam (double acc){
        super(Type.NORMAL,0, acc);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.ATTACK, 3);
        p.addEffect(e);
        System.out.println(p.toString() + " Атака +3");
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.confuse(p);
    }
    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
