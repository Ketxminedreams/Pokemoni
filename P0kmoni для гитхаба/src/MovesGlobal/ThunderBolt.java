package MovesGlobal;
import Utility.Utility;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
public class ThunderBolt extends SpecialMove{
    public ThunderBolt (double power, double acc){
        super(Type.ELECTRIC, power,acc);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double power) {
        super.applyOppDamage(def, power);
        if (Utility.chance(0.1)) {
            Effect.paralyze(def);
            System.out.println(def.toString() + "Покемон парализован");
        }
    }
    @Override
        protected String describe() {
            String[] pieces = this.getClass().toString().split("\\.");
            return "Наносит" + pieces[pieces.length-1];
        }

}
