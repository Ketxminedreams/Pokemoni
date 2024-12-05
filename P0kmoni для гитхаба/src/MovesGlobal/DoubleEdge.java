package MovesGlobal;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
public class DoubleEdge extends PhysicalMove{
    public DoubleEdge(double power, int acc){
        super(Type.NORMAL,120, power, 100, acc);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        super.applyOppDamage(def, damage);
        System.out.println(def.toString() + " наносит");
    }
    @Override
    protected void applySelfDamage(Pokemon attacker, double damage){
        super.applySelfDamage(attacker,damage);
    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "наносит " + pieces[pieces.length-1];
    }
}
