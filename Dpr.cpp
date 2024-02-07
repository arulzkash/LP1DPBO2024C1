// import library
#include <iostream>
#include <string>

// using standard namespace
using namespace std;

class Dpr
{
private:
    string id, nama, nama_bidang, nama_partai;

public:
    Dpr()
    {
        this->id = "";
        this->nama = "";
        this->nama_bidang = "";
        this->nama_partai = "";
    }

    Dpr(string id, string nama, string nama_bidang, string nama_partai)
    {
        this->id = id;
        this->nama = nama;
        this->nama_bidang = nama_bidang;
        this->nama_partai = nama_partai;
    }

    string get_id()
    {
        return this->id;
    }

    void set_id(string id)
    {
        this->id = id;
    }

    string get_nama()
    {
        return this->nama;
    }

    void set_nama(string nama)
    {
        this->nama = nama;
    }

    string get_nama_bidang()
    {
        return this->nama_bidang;
    }

    void set_nama_bidang(string nama_bidang)
    {
        this->nama_bidang = nama_bidang;
    }

    string get_nama_partai()
    {
        return this->nama_partai;
    }

    void set_nama_partai(string nama_partai)
    {
        this->nama_partai = nama_partai;
    }


    ~Dpr()
    {

    }
};