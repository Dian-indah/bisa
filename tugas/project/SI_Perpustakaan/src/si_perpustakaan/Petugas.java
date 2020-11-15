package si_perpustakaan;

public class Petugas extends WargaPerpus {
   // Attribut    
    private String password;
    
    // Constructor
    public Petugas(String no_id, String nama, String alamat, String password){
        super(no_id, nama, alamat);
        this.password = password;
    }
    
    // Accessor    
    @Override 
    String getNo_id(){
        return no_id;
    }
    @Override 
    String getNama(){
        return nama;
    }
    @Override 
    String getAlamat(){
        return alamat;
    }
    String getPassword(){
        return this.password;
    }
}
