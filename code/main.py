from Dpr import Dpr

print("\nSelamat Datang")
print("Fitur\n")
print("1. Tambah Anggota DPR")
print("2. Ubah Anggota DPR")
print("3. Hapus Anggota DPR")
print("4. List Anggota DPR")
print("5. Selesai")

list_dpr = []

while True:
    pilihan = int(input())

    if pilihan == 5:
        break

    elif pilihan == 1:
        print("Masukkan ID, Nama, Nama Bidang, Nama Partai")
        idd = str(input())
        nama = str(input())
        nama_bidang = str(input())
        nama_partai = str(input())
        temp = Dpr(idd, nama, nama_bidang, nama_partai)
        list_dpr.append(temp)
        print("Anggota DPR berhasil ditambahkan")

    elif pilihan == 2:
        print("Masukkan ID yang ingin diubah:")
        input_id = str(input())
        for dpr in list_dpr:
            if dpr.get_idd() == input_id:
                print("Masukkan nama, nama bidang, dan nama partai yang baru:")
                nama = str(input())
                nama_bidang = str(input())
                nama_partai = str(input())
                dpr.set_nama(nama)
                dpr.set_nama_bidang(nama_bidang)
                dpr.set_nama_partai(nama_partai)
                print(f"Anggota DPR dengan ID {input_id} berhasil diubah.")
                break

    elif pilihan == 3:
        print("Masukkan ID yang ingin dihapus")
        input_id = str(input())
        for dpr in list_dpr:
            if dpr.get_idd() == input_id:
                list_dpr.remove(dpr)
                print(f"Anggota DPR dengan ID {input_id} berhasil dihapus.")
                break

    elif pilihan == 4:
        iddWidth = 0
        namaWidth = 0
        bidangWidth = 0
        partaiWidth = 0
        for dpr in list_dpr:
            iddWidth = max(iddWidth, len(dpr.get_idd()))
            namaWidth = max(namaWidth, len(dpr.get_nama()))
            bidangWidth = max(bidangWidth, len(dpr.get_nama_bidang()))
            partaiWidth = max(partaiWidth, len(dpr.get_nama_partai()))

        print("List Anggota DPR:")
       

        if iddWidth < 3:
            print("------", end="")
        else:
            print("----", end="")
            for i in range(iddWidth - 2 + 2):
                print("-", end="")

        if namaWidth < 5:
            print("--------", end="")
        else:
            print("------", end="")
            for i in range(namaWidth - 4 + 2):
                print("-", end="")

        if bidangWidth < 12:
            print("---------------", end="")
        else:
            print("-------------", end="")
            for i in range(bidangWidth - 11 + 2):
                print("-", end="")

        if partaiWidth < 12:
            print("---------------", end="")
        else:
            print("-------------", end="")
            for i in range(partaiWidth - 11 + 2):
                print("-", end="")

       
        print("-")
       
        if iddWidth < 3 :
            print("| ID  ", end="")
        
        else:
            print("| ID", end="")
            for i in range (i < iddWidth - 2 + 2):
                print(" ", end="")

       
        
        if namaWidth < 5 :
            print("| Nama  ", end="")
        
        else:
            print("| Nama", end="")
            for i in range (i < namaWidth - 4 + 2):
                print(" ", end="")

       
        
        if bidangWidth < 12 :
            print("| Nama Bidang  ", end="")
        
        else:
            print("| Nama Bidang", end="")
            for i in range (i < bidangWidth - 11 + 2):
                print(" ", end="")

        
        
        if partaiWidth < 12 :
            print("| Nama Partai  ", end="")
        
        else:
            print("| Nama Partai", end="")
            for i in range (i < partaiWidth - 11 + 2):
                print(" ", end="")
        print("|")

        if iddWidth < 3:
            print("------", end="")
        else:
            print("----", end="")
            for i in range(iddWidth - 2 + 2):
                print("-", end="")

        if namaWidth < 5:
            print("--------", end="")
        else:
            print("------", end="")
            for i in range(namaWidth - 4 + 2):
                print("-", end="")

        if bidangWidth < 12:
            print("---------------", end="")
        else:
            print("-------------", end="")
            for i in range(bidangWidth - 11 + 2):
                print("-", end="")

        if partaiWidth < 12:
            print("---------------", end="")
        else:
            print("-------------", end="")
            for i in range(partaiWidth - 11 + 2):
                print("-", end="")

        # print("-")
        print("-")
        
        

        


        for dpr in list_dpr:
           
            print("|", dpr.get_idd(), end="")
            if iddWidth < 3:
                for j in range(2 - len(dpr.get_idd()) + 2):
                    print(" ", end="")
            else:
                for j in range(iddWidth - len(dpr.get_idd()) + 2):
                    print(" ", end="")

            print("|", dpr.get_nama(), end="")
            if namaWidth < 3:
                for j in range(4 - len(dpr.get_nama()) + 2):
                    print(" ", end="")
            else:
                for j in range(namaWidth - len(dpr.get_nama()) + 2):
                    print(" ", end="")
            
            print("|", dpr.get_nama_bidang(), end="")
            if bidangWidth < 3:
                for j in range(11 - len(dpr.get_nama_bidang()) + 2):
                    print(" ", end="")
            else:
                for j in range(bidangWidth - len(dpr.get_nama_bidang()) + 2):
                    print(" ", end="")
           
            print("|", dpr.get_nama_partai(), end="")
            if partaiWidth < 3:
                for j in range(11 - len(dpr.get_nama_partai()) + 2):
                    print(" ", end="")
            else:
                for j in range(partaiWidth - len(dpr.get_nama_partai()) + 2):
                    print(" ", end="")
            print("|")
                    
        if iddWidth < 3:
            print("------", end="")
        else:
            print("----", end="")
            for i in range(iddWidth - 2 + 2):
                print("-", end="")

        if namaWidth < 5:
            print("--------", end="")
        else:
            print("------", end="")
            for i in range(namaWidth - 4 + 2):
                print("-", end="")

        if bidangWidth < 12:
            print("---------------", end="")
        else:
            print("-------------", end="")
            for i in range(bidangWidth - 11 + 2):
                print("-", end="")

        if partaiWidth < 12:
            print("---------------", end="")
        else:
            print("-------------", end="")
            for i in range(partaiWidth - 11 + 2):
                print("-", end="")

        # print("-")
        print("-")

    print("\n")
    print("Fitur")
    print("1. Tambah")
    print("2. Ubah")
    print("3. Hapus")
    print("4. List Anggota DPR")
    print("5. Selesai")
