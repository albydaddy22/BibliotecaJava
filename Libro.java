public class Libro {

    private String titolo, autore, dataPub, editore;

    public Libro() {}

    public Libro(String titolo, String autore, String dataPub, String editore) {
        setTitolo(titolo);
        setAutore(autore);
        setDataPub(dataPub);
        setEditore(editore);
    }

    public void setTitolo(String titolo) {this.titolo = titolo;}
    public void setAutore(String autore) {this.autore = autore;}
    public void setDataPub(String dataPub) {this.dataPub = dataPub;}
    public void setEditore(String editore) {this.editore = editore;}
    public String getTitolo() {return titolo;}
    public String getAutore() {return autore;}
    public String getDataPub() {return dataPub;}
    public String getEditore() {return editore;}
}