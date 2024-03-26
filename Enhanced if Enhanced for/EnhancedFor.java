public class EnhancedFor {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8,9,10}; //Dilakukan deklarasi dan inisialsiasi array
        int sum = 0;
        for(int num:nums){ //Dibaca sebagai for num in nums. sebelah kiri menjadi key yang mengambil data array pada index tersebut, sedangkan sebelah kanan titik dua (:) merujuk kepada nama array yang digunakan sebagai pedoman.
            //Iterasi akan berjalan terus sampai index value terakhir dalam array.


            System.out.println(num); //perintah di dalmnya menuliskan num yang merupakan data yang diambil dari nums
            sum += num;//lalu dilakukan penambahan terus menerus setiap valuenya
        }
        System.out.println(sum); // setelah pengulangan selesai dilakukan print jumlah dari value nums
    }
}
