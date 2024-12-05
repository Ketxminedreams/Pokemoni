package MovesGlobal;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
public class AquaTail extends PhysicalMove{
        public AquaTail(double power, double acc) {
            super(Type.WATER, power, acc);
        }
        @Override
                protected String describe() {
            String[] pieces = this.getClass().toString().split("\\.");
            return "наносит" + pieces[pieces.length-1];

        }
    }


