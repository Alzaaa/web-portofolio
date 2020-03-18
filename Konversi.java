public class Konversi{
         int totDetik,detik,totMenit,menit,totJam,jam;

public Konversi(){

totDetik=128377;
detik=totDetik%60;
totMenit=totDetik/60;
menit=totMenit%60;
totJam=totMenit/60;
jam=totJam%24;

}

public static void main(String[] ar){
      Konversi Waktu = new Konversi();
System.out.print(+Waktu.jam +"Jam" +Waktu.menit +"Menit" +Waktu.detik +"Detik");

}

}