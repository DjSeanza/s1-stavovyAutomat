/**
 * 20. 11. 2021 - 17:16
 *
 * @author Patrik Ištvanko
 */
public class Stav {
    private final Stavy[][] stavy;
    private Stavy stav;

    public Stav() {
        this.stav = Stavy.S0;
        this.stavy = new Stavy[][]{{Stavy.S0, Stavy.S0, Stavy.S0, Stavy.S1},
                                   {Stavy.S1, Stavy.S2, Stavy.S0, Stavy.S1},
                                   {Stavy.S1, Stavy.S2, Stavy.S2, Stavy.S3},
                                   {Stavy.S3, Stavy.S3, Stavy.S2, Stavy.S3}};
    }

    public void zmenaStavu(String vstup) {
        if (vstup.equals("0,0")) {
            this.stav = this.stavy[this.stav.getHodnota()][0];
        } else if (vstup.equals("1,0")) {
            this.stav = this.stavy[this.stav.getHodnota()][1];
        } else if (vstup.equals("1,1")) {
            this.stav = this.stavy[this.stav.getHodnota()][2];
        } else if (vstup.equals("0,1")) {
            this.stav = this.stavy[this.stav.getHodnota()][3];
        }
    }

    public void vypis() {
        System.out.format("Aktualny stav: S%d, Farba: %s%n", this.stav.getHodnota(), this.stav.getFarba());
    }
}
