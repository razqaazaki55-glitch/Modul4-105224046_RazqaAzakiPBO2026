//No.1
public class MesinKopi {
    float bijiKopi;
    int air;
    int susu;

    //no.2
    public void isiUlangBahan(float bijiKopi, int air, int susu){
        this.bijiKopi = bijiKopi;
        this.air = air;
        this.susu = susu;

        System.out.println("Bahan berhasil diisi ulang!");
        System.out.println("  Biji Kopi : " + this.bijiKopi + " gram");
        System.out.println("  Air       : " + this.air      + " ml");
        System.out.println("  Susu      : " + this.susu     + " ml");
    }
    
    //No.3
    public boolean cekKetersediaanCappuccino(){
        if (bijiKopi >= 15 && air >= 50 && susu >= 100) {
            System.out.println("Seluruh bahan mencukupi");
            return true;
        } else {
            System.out.println("Ada satu atau lebih bahan yang tidak memenuhi standar resep.");
            return false;
        }
    }

    //No.4
    public MesinKopi() {
        this.bijiKopi = 0;
        this.air      = 0;
        this.susu     = 0;
    }

    public static void main(String[] args) {
        MesinKopi mesinLobby = new MesinKopi();
 
        mesinLobby.cekKetersediaanCappuccino();
 
        mesinLobby.isiUlangBahan(20, 60, 120);
 
        mesinLobby.cekKetersediaanCappuccino();
 
    }
}

