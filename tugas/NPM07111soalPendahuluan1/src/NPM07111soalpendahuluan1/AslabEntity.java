/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NPM07111soalpendahuluan1;
import java.util.Date;
/**
 *
 * @author ezaim
 */
public class AslabEntity {
    String npm,nama,password,notelp;
    Date Tanggallahir;
    public AslabEntity(String npm,String nama,String password,String notelp,Date tanggallahir){
        this.npm=npm;
        this.nama=nama;
        this.password=password;
        this.notelp=notelp;
        this.Tanggallahir=tanggallahir;
}
    String getNpm(){
        return this.npm;
}
    String getNama(){
        return this.nama;
}
    String getPassword(){
        return this.password;
}
    String getNoTelp(){
        return this.notelp;
}
    Date getDate(){
        return this.Tanggallahir;
}
}