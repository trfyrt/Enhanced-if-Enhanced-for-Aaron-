public class EnhancedIf {
    public static void main(String[] args){
        //statement enhanced if ini digunakan untuk mempersingkat statement if pada umumnya demi mengefisiensikan compile pada coding
        int i = 10; 
        //Statement if biasa seperti di bawah ini
        if (i>10){
            System.out.println("i lebih besar dari 10");
        }
        else if (i<10){
            System.out.println("i lebih kecil dari 10");
        }
        else{
            System.out.println("i sama dengan 10");
        }

        //Sedangkan pada enhanced if dituliskan seperti ini.
        //Contohnya pada sysout di bawah ini, kondisi pertama jika (i>10) maka akan mengeluarkan output "i lebih besar dari 10" jika bernilai true
        //tetapi jika false akan lanjut ke statement berikutnya, (i<10) maka akan mengeluarkan output "i lebih kecil dari 10" jika bernilai true
        //lalu jika statement sebelumnya false akan diprint "i sama dengan 10"

        System.out.println((i > 10) ? "i lebih besar dari 10" : (i < 10) ? "i lebih kecil dari 10" : "i sama dengan 10");
        //tanda tanya (?) disini menandakan if yang dimana diletakkan setelah menuliskan syarat, lalu titik dua (:) disini menunjukkan output yang berbeda, jika statement true : jika statement false
    }
}
