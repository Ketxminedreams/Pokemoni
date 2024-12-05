package MovesGlobal;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class StoneEdge extends PhysicalMove {
    public StoneEdge(double power, double acc) {
        super(Type.ROCK, power, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double power) {
        super.applyOppDamage(def, power);
    }
    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "Наносит" + pieces[pieces.length - 1];
    }
}
