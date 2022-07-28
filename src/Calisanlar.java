public class Calisanlar {
    String calisanIsmi;
    int maas;
    int haftalikCalismaSaati;
    int iseGirisYili;

    Calisanlar(String calisanIsmi, int maas, int haftalikCalismaSaati, int iseGirisYili)
    {
        this.calisanIsmi = calisanIsmi;
        this.maas = maas;
        this.haftalikCalismaSaati = haftalikCalismaSaati;
        this.iseGirisYili = iseGirisYili;
    }

    int vergi()
    {
        int vergi = 0;
        if (this.maas <= 1000)
        {
            return 0;
        }
        if (this.maas > 1000)
        {
            vergi = vergi + ((this.maas * 3) / 100);
        }
        return vergi;
    }

    int ekstraUcret()
    {
        int ekstraUcret = 0;

        if (this.haftalikCalismaSaati > 40)
        {
            ekstraUcret = (this.haftalikCalismaSaati - 40) * 30;
        }

        return  ekstraUcret;
    }

    int maasArtisi()
    {
        int maasArtisi = 0;
        int yil = 2021;
        if (yil - this.iseGirisYili < 10)
        {
            maasArtisi = (this.maas * 5) / 100;
        }

        if (yil - this.iseGirisYili > 9 && yil - this.iseGirisYili < 20)
        {
            maasArtisi = (this.maas * 10) / 100;
        }

        if (yil - this.iseGirisYili > 19)
        {
            maasArtisi = (this.maas * 15) / 100;
        }
        return maasArtisi;
    }

    void calisanBilgiGoster()
    {
        System.out.println("************************");
        System.out.println();
        System.out.println("\tCalisanin Bilgileri");
        System.out.println("------------------------");
        System.out.println();
        System.out.println("Calisanin Ismi : " + this.calisanIsmi);
        System.out.println("Calisanin Maasi : " + this.maas);
        System.out.println("Calisanin Haftalik Calisma Saati : " + this.haftalikCalismaSaati);
        System.out.println("Calisanin Ise Giris Yili : " + this.iseGirisYili);
        System.out.println("Calisanin Odeyecegi Vergi : " + this.vergi());
        System.out.println("Calisanin Alacagi Bonus Ucret : " + this.ekstraUcret());
        System.out.println("Calisanin Yillik Maas Artisi : " + this.maasArtisi());
        System.out.println("Vergi Dahil Calisana Odenecek Ucret (Bonuslar Dahil) : " + ((this.maas - this.vergi()) + this.ekstraUcret()));
        System.out.println("Yeni Maas : " + this.yeniMaas());
        System.out.println();

    }
    int yeniMaas()
    {
        int yeniMaas = ((this.maas + this.ekstraUcret() + this.maasArtisi()) - this.vergi());
        return yeniMaas;
    }
}
