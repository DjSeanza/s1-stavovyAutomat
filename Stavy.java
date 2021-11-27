/**
 * 20. 11. 2021 - 17:16
 *
 * @author Patrik Ištvanko
 */
public enum Stavy {
    S0("\u001B[42m" + "\u001B[30mZelená\u001B[0m", 0),
    S1("\u001B[42m" + "\u001B[30mZelená\u001B[0m", 1),
    S2("\u001B[41m" + "\u001B[30mČervená\u001B[0m", 2),
    S3("\u001B[41m" + "\u001B[30mČervená\u001B[0m", 3);

    private final String farba;
    private final int hodnota;

    Stavy(String farba, int hodnota) {
        this.farba = farba;
        this.hodnota = hodnota;
    }

    public String getFarba() {
        return this.farba;
    }

    public int getHodnota() {
        return this.hodnota;
    }
}
