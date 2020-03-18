/* Muhammad Akbar Ghazaly
        1302018002

Tugas 2 Biodata Kelas A1 TI  */



public class biodata{
        String nama,stb,fakultas,jurusan;

        public biodata(){
                 nama="Muhammad Akbar Ghazaly";
                 stb ="13020180002";
                 fakultas="Ilmu Komputer";
                 jurusan ="Teknik Informatika";

}
      
       public static void main(String[] arg){
            biodata bio = new biodata();

            System.out.println("Nama      ="+(bio.nama));
            System.out.println("Stambuk   ="+(bio.stb));
            System.out.println("Fakultas  ="+(bio.fakultas));
            System.out.println("Jurusan   ="+(bio.jurusan));

}


}