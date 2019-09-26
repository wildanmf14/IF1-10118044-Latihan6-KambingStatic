package latihan.kambingStatic;
/*
Nama        : Wildan Muhammad Fikri
Kelas       : IF1
NIM         : 10118044
Deskripsi   : Implementasi pada dua class
 */
public class KambingStatic {
	
	
	//class Mamalia{
	//  public static int jumlahKambing;
	//}
	public static final String NAMA_KAMBING = "MIDUN";
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
    }

}
