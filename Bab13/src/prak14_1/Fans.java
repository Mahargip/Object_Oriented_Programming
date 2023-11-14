package prak14_1;

public class Fans {
    private String nama;
    
    public Fans(){
        
    }
    
    public Fans(String nama){
        this.nama = nama;
    }
    
    public void showName(){
        System.out.print(nama);
    }
    
    public void watchingPerformances(){
        System.out.println("noname: melihat idolanya dari youtube");
    }
    
    public void watchingPerformances(Musician musician){
        System.out.print(nama + ": melihat idolanya ");
        musician.perform();
        System.out.println();
    }

    
    
}
