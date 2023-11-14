package prak12_2;

public class Kecebong extends Katak {
    public double panjangEkor;

    public Kecebong(int umur, String nama) {
        super(umur, nama);
    }

    public Kecebong(int umur, String nama, double panjangEkor) {
        super(umur, nama);
        this.panjangEkor = panjangEkor;
    }

    
    public String caraBergerak(){
        if (panjangEkor > 0) {
            return "melompat";
        } else {
            return "berenang";
        }
        
    }

    public double getPanjangEkor() {
        return panjangEkor;
    }

    public int getUmur() {
        return umur;
    }

    public String getNama() {
        return nama;
    }
}
