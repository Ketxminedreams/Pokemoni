package MovesGlobal;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
public class Nuzzle extends PhysicalMove{
    public Nuzzle(double pow, int acc){
        super(Type.ELECTRIC, 20,pow , 100,acc);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double power){
        super.applyOppDamage(def,power);
        Effect.paralyze(def);
        System.out.println(def.toString() + "Получил урон, и Покемон парализован");
    }
    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "Наносит" + pieces[pieces.length-1];
    }
}
