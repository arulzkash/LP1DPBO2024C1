// import library and file.
#include <bits/stdc++.h>
#include "Dpr.cpp"

// using standard namespace
using namespace std;

int main()
{

    cout << "Selamat Datang " << '\n';
    cout << "Fitur" << '\n';
    cout << "1. Tambah Anggota DPR" << '\n';
    cout << "2. Ubah Anggota DPR" << '\n';
    cout << "3. Hapus Anggota DPR" << '\n';
    cout << "4. Selesai" << '\n';
    int pilihan;
    cin >> pilihan;

    list<Dpr> llist;
    string input_id;

    while (pilihan != 4)
    {
        string id, nama, nama_bidang, nama_partai;
        if (pilihan == 1)
        {
            cout << "Masukkan ID, Nama, Nama Bidang, Nama Partai" << '\n';
            cin >> id >> nama >> nama_bidang >> nama_partai;
            Dpr temp;

            temp.set_id(id);
            temp.set_nama(nama);
            temp.set_nama_bidang(nama_bidang);
            temp.set_nama_partai(nama_partai);

            llist.push_back(temp);
            cout << "Anggota DPR berhasil ditambahkan" << '\n';
        }
        else if (pilihan == 2)
        {
            cout << "Masukkan ID yang ingin diubah:" << '\n';
            cin >> input_id;
            for (list<Dpr>::iterator it = llist.begin(); it != llist.end(); it++)
            {
                if (it->get_id() == input_id)
                {
                    cout << "Masukkan nama, nama bidang, dan nama partai yang baru:" << '\n';
                    cin >> nama >> nama_bidang >> nama_partai;
                    it->set_nama(nama);
                    it->set_nama_bidang(nama_bidang);
                    it->set_nama_partai(nama_partai);
                }

                cout << "Anggota DPR dengan ID " << input_id << " berhasil diubah." << endl;

                
            }
        }
        else if (pilihan == 3)
        {
            cout << "Masukkan ID yang ingin dihapus" << endl;
            cin >> input_id;
            for (auto it = llist.begin(); it != llist.end(); ++it)
            {
                if (it->get_id() == input_id)
                {
                    it = llist.erase(it); // Hapus item dari list
                    cout << "Anggota DPR dengan ID " << input_id << " berhasil dihapus." << endl;
                    
                }
            }
        }
        cout << '\n';
        cout << "Fitur" << '\n';
        cout << "1. Tambah" << '\n';
        cout << "2. Ubah" << '\n';
        cout << "3. Hapus" << '\n';
        cout << "4. Selesai" << '\n';
        cin >> pilihan;
    }

    cout << "List Anggota DPR  : " << '\n';
    int i = 0;
    for (list<Dpr>::iterator it = llist.begin(); it != llist.end(); it++)
    {
        cout << (i + 1) << ". " << it->get_id() << " | " << it->get_nama() << " | " << it->get_nama_bidang() << " | " << it->get_nama_partai() << '\n';
        i++;
    }

    return 0;
}