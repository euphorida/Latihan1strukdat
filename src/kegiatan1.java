import java.util.ArrayList;

public class kegiatan1 {
    public static void main(String[] args) {
        ArrayList <String> Hewan = new ArrayList<>();
        Hewan.add("Angsa");
        Hewan.add("Bebek");
        Hewan.add("Cicak");
        Hewan.add("Domba");
        Hewan.add("Elang");
        Hewan.add("Gajah");
        Hewan.add("Badak");
        Hewan.add("Bebek");
        int jumlah=0;
        System.out.println(Hewan);
        System.out.print("Posisi index = ");
        for (int i = 0; i < Hewan.size(); i++) {
            if (Hewan.get(i).equals("Bebek")){
                jumlah++;
                System.out.print(i + "  ");
            }
        }
        System.out.println("\nBebek ada : " + jumlah);
        Hewan.remove("Bebek");
        System.out.println(Hewan);
        System.out.println("indeks ke-0 = "+Hewan.get(0));
        System.out.println("indeks ke-2 = "+Hewan.get(2));

        Hewan.remove(0);
        System.out.println(Hewan);

        Hewan.set(0, "Ular");
        System.out.println(Hewan);
        Hewan.add(2, "Itik");
        System.out.println(Hewan);

        Hewan.subList(2, 5).clear();
        System.out.println(Hewan);

        System.out.println("Elemen pertama : "+ Hewan.get(0));
        System.out.println("Elemen terakhir : "+ Hewan.get(Hewan.size()-1));

        System.out.println("jumlah elemen : "+ Hewan.size());
        System.out.println("badak ada di index : "+ Hewan.indexOf("Badak"));

    }
}
