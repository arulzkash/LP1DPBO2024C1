public class Dpr
{
    private String id, nama, nama_bidang, nama_partai;


    public Dpr()
    {
        this.id = "";
        this.nama = "";
        this.nama_bidang = "";
        this.nama_partai = "";
    }

    public Dpr(String id, String nama, String nama_bidang, String nama_partai)
    {
        this.id = id;
        this.nama = nama;
        this.nama_bidang = nama_bidang;
        this.nama_partai = nama_partai;
    }

    public String get_id()
    {
        return this.id;
    }

    public void set_id(String id)
    {
        this.id = id;
    }

    public String get_nama()
    {
        return this.nama;
    }

    public void set_nama(String nama)
    {
        this.nama = nama;
    }

    public String get_nama_bidang()
    {
        return this.nama_bidang;
    }

    public void set_nama_bidang(String nama_bidang)
    {
        this.nama_bidang = nama_bidang;
    }

    public String get_nama_partai()
    {
        return this.nama_partai;
    }

    public void set_nama_partai(String nama_partai)
    {
        this.nama_partai = nama_partai;
    }
}