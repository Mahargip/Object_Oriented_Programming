package prak14_1;

public class Test {
    public static void main(String args[]){
        Fans fans1 = new Fans();
        Fans fans2 = new Fans("Mona");
        Fans fans3 = new KpopFans("Tomi");
        KpopFans fans4 = new KpopFans("Febi");
        
        fans1.watchingPerformances();
        fans2.watchingPerformances(new Musician());
        fans2.watchingPerformances(new Singer());
        fans3.watchingPerformances(new Biduan());
        fans4.watchingPerformances(new Kpop(), "teriak histeris");
    }
}
