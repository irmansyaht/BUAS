/**
 * Kelas untuk membuat Monster Slime di dalam Game BUAS
 * @author Irmansyah Turhamun, Dhio Makarim Utomo, Rizky Nurfaizi, M Haqy Aunoora
 *
 * @version 1.0 (Stable for Demo)
 * */
public class Monster_Slime extends Monster {
    public Monster_Slime(){
        name = "Slime";
        hp = 18;
        attack = 8;
        attackMessage = "Enyah Kau!";
        type = MonsterType.physical;
    }
}