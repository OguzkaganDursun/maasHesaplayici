public class Main {
    public static void main(String[] args) {

        Calisanlar c1 = new Calisanlar("Oguzkagan", 850,30,2019);
        Calisanlar c2 = new Calisanlar("Busra", 3500,58,2011);
        Calisanlar c3 = new Calisanlar("Kemal", 2000,45,1985);

        c1.calisanBilgiGoster();
        c2.calisanBilgiGoster();
        c3.calisanBilgiGoster();
    }
}
