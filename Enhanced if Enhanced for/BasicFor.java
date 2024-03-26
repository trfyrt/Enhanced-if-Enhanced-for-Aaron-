public class BasicFor {
    public static void main(String[] args) {
        //Enhanced for tidak dapat berjalan tanpa array. Jadi basic for berguna untuk membuat perulangan yang tidak berhubungan dengan array.

        for (int i=1; i<=5; ++i){
            System.out.println("Nomor " + i);
        }

        //Sedangkan untuk enhanced fornya harus menggunakan array seperti ini:
        int [] nums = {1,2,3,4,5}; //harus mendeklarasi array terlebih dahulu sebelum membuat for loopsnya
        for (int i:nums){
            System.out.println("Nomor " + i);
        }
    }
}
