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
public class PraktikanEntity {
  String npm,nama,password,notelp,kelas;
  Date Tanggallahir;
  int indexpraktikum;
  int indexaslab;
public PraktikanEntity(String npm,String nama,String password,String notelp,Date tanggallahir,int indexprak,int indexaslab,String kelas){
    this.npm=npm;
    this.nama=nama;
    this.password=password;
    this.notelp=notelp;
    this.Tanggallahir=tanggallahir;
    this.indexpraktikum=indexprak;
    this.indexaslab=indexaslab;
    this.kelas=kelas;
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
    int getIndexPraktikum(){
        return this.indexpraktikum;
}
}
