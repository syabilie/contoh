package tubes;

public class driver {
    public static void main(String[] args) {
        double panjang = 5;
        double lebar = 3;

        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
        double luas = persegiPanjang.hitungLuas();
        double luas1 = persegiPanjang.hitungLuas();
        double luas2 = persegiPanjang.hitungLuas();
        double luas3 = persegiPanjang.hitungLuas();
        double luas4 = persegiPanjang.hitungLuas();
        double luas5 = persegiPanjang.hitungLuas();

        System.out.println("Luas Persegi Panjang: " + luas);
        System.out.println("Luas Persegi Panjang: " + luas1);
        System.out.println("Luas Persegi Panjang: " + luas2);
        System.out.println("Luas Persegi Panjang: " + luas3);
        System.out.println("Luas Persegi Panjang: " + luas4);
        System.out.println("Luas Persegi Panjang: " + luas5);
    }
}

