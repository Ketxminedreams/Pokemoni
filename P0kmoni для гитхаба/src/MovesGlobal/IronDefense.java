package MovesGlobal;
import ru.ifmo.se.pokemon.*;
public class IronDefense extends StatusMove {
    public IronDefense (double acc){
        super(Type.STEEL,0 ,acc);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.DEFENSE, 2);
        p.addEffect(e);
        System.out.println(p.toString() + " Защита +2");
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.confuse(p);
    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "увеличивает" + pieces[pieces.length-1];
    }

}
