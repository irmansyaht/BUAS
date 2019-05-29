/**
 * Kelas Enum untuk Pilihan Item yang boleh digunakan di dalam Game BUAS
 * @author Irmansyah Turhamun, Dhio Makarim Utomo, Rizky Nurfaizi, M Haqy Aunoora
 *
 * @version 1.0 (Stable for Demo)
 * */
 
public enum Item {
    pisau ("Pisau"),
    pedang ("Pedang"),
    jamu ("Jamu"),
    ikan ("Ikan"),
    jeruk("Jeruk");

    private  final String name;
    private  Item (String s){
        name = s;
    }

    /**
     * Method untuk mengecek nama Item yang ada di dalam enum
     * @param otherName nama lain yang di cek ada dalam enum
     * @return boolean ketika nama tersebut ada di dalam enum maka akan true dan sebaliknya akan false
     */
    public boolean equalsName(String otherName){
        return  name.equals(otherName);
    }

    /**
     * Method to String untuk membuat enum Item menjadi String
     * @return  Mengubah nama enum menjadi String
     */
    public String toString(){
        return this.name;
    }


}
