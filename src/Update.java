/**
 * Created by Janek Timmas on 6.03.2015.
 */
public class Update {
    private static int tick = 1;

    public static int getTick() {
        return tick;
    }

    public static void Tick() {
        Main.payDay(Main.kokkuIncome() * tick);

        //Property.sissetulekProperty.setValue(Integer.toString(Main.kokkuIncome()));


        //System.out.println("--------------------" + "\n");
        //System.out.println("Raha on hetkel: " + Main.getRaha() + " eurot." + "\n");
        //System.out.println("Kogumaad on hetkel: " + Main.kokkuMaad() + " ha." + "\n");
        //System.out.println("Kogu sissetulek on hetkel: " + Main.kokkuIncome() + " eur/s." + "\n");
        //System.out.println("Menüüsse sisenemiseks vajuta ENTER");
        //System.out.println("Mängust väljumiseks kirjuta exit");
    }
}
