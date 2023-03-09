import java.util.ArrayList;

public class Kota<E>{
    private E element;

    public Kota(E kota){
        element=kota;
    }

    public E getElement(){
        return element;
    }

    public static void main(String[] args){
        Kota<Integer> jumlahKota = new Kota<Integer>(9);
        Kota<String> namaKota = new Kota<String>("Malang");
        System.out.println("Jumlah kota di Jawa Timur : "+ jumlahKota.getElement() + " kota");
        System.out.println("Salah satu kota di Jawa Timur : Kota "+ namaKota.getElement());
    }
}
public static void class Konsumsi<M, I>{
    private M m;
    private I i;

    public M getM(){
        return m;
    }

    public I getI(){
        return i;
    }

    public void setKonsumsi (M makanan, I minuman){
        this.m = makanan;
        this.i = minuman;
    }
}

public class Hidangan{
    protected String namaHidangan;

    public String getNamaHidangan(){
        return namaHidangan;
    }

    public void setNamaHidangan(String namaHidangan) {
        this.namaHidangan = namaHidangan;
    }

    public String disantap(){
        return "Makanan dihidangkan";
    }
}

public class Minuman extends Hidangan{
    public String disantap(){
        return this.getNamaHidangan() + " diminum";
    }
}

public class Makanan extends Hidangan{
    public String disantap(){
        return this.getNamaHidangan() + " dimakan";
    }
}

public class Main{
    public static void main(String[] args){
        ArrayList<Konsumsi> ListKonsumsi = new ArrayList<>();
        Konsumsi<Makanan, Minuman> breakfast = new Konsumsi<>();
        Konsumsi<Makanan, Minuman> lunch = new Konsumsi<>();

        Makanan roti = new Makanan();
        roti.setNamaHidangan("Roti Tawar");
        Minuman susu = new Minuman();
        susu.setNamaHidangan("Susu Sapi");
        breakfast.setKonsumsi(roti, susu);
        ListKonsumsi.add(breakfast);

        Makanan nasi = new Makanan();
        nasi.setNamaHidangan("Nasi Putih");
        Minuman air = new Minuman();
        air.setNamaHidangan("Air Putih");
        lunch.setKonsumsi(nasi, air);
        ListKonsumsi.add(lunch);

        System.out.println("Menu Konsumsi");
        for (Konsumsi<Makanan, Minuman> konsumsi: ListKonsumsi){
            Makanan makanan = konsumsi.getM();
            Minuman minuman = konsumsi.getI();

            System.out.println(makanan.disantap());
            System.out.println(minuman.disantap());
        }
    }
}