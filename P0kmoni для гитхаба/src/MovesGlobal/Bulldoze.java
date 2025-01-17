package MovesGlobal;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
public class Bulldoze extends PhysicalMove {
    public Bulldoze(double power, double acc) {
        super(Type.GROUND, power, acc);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "наносит" + pieces[pieces.length - 1];
    }
}
