/**
 * Kelas untuk membuat Monster Goblin di dalam Game BUAS
 * @author Irmansyah Turhamun, Dhio Makarim Utomo, Rizky Nurfaizi, M Haqy Aunoora
 *
 * @version 1.0 (Stable for Demo)
 * */
public class Monster_Goblin extends Monster {
    public Monster_Goblin(){
        name = "Goblin";
        hp = 20;
        attack = 6;
        attackMessage = "Enyah Kau!";
        type = MonsterType.physical;
    }
}
