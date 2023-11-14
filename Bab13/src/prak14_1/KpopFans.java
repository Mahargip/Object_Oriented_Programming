package prak14_1;

public class KpopFans extends Fans{
    public KpopFans(){
        
    }
    
    public KpopFans(String nama){
        super(nama);
    }
    
    public void watchingPerformances(Musician musician, String expression) {
        showName();
        System.out.print(": melihat idolanya ");
        musician.perform();
        System.out.println();
    }

}
