import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nSelamat Datang");
        System.out.println("Fitur\n");
        System.out.println("1. Tambah Anggota DPR");
        System.out.println("2. Ubah Anggota DPR");
        System.out.println("3. Hapus Anggota DPR");
        System.out.println("4. List Anggota DPR");
        System.out.println("5. Selesai");
        int pilihan;
        Scanner sc = new Scanner(System.in);
        pilihan = sc.nextInt();

        ArrayList<Dpr> list = new ArrayList<>();

        while (pilihan != 5) {
            String id, nama, nama_bidang, nama_partai, input_id;
            if (pilihan == 1) {
                System.out.println("Masukkan ID, Nama, Nama Bidang, Nama Partai");
                id = sc.next();
                nama = sc.next();
                nama_bidang = sc.next();
                nama_partai = sc.next();
                Dpr temp = new Dpr(id, nama, nama_bidang, nama_partai);
                list.add(temp);
                System.out.println("Anggota DPR berhasil ditambahkan");
            } else if (pilihan == 2) {
                System.out.println("Masukkan ID yang ingin diubah:");
                input_id = sc.next();
                for (Dpr dpr : list) {
                    if (dpr.get_id().equals(input_id)) {
                        System.out.println("Masukkan nama, nama bidang, dan nama partai yang baru:");
                        nama = sc.next();
                        nama_bidang = sc.next();
                        nama_partai = sc.next();
                        dpr.set_nama(nama);
                        dpr.set_nama_bidang(nama_bidang);
                        dpr.set_nama_partai(nama_partai);
                        System.out.println("Anggota DPR dengan ID " + input_id + " berhasil diubah.");
                    }
                }
            } else if (pilihan == 3) {
                System.out.println("Masukkan ID yang ingin dihapus");
                input_id = sc.next();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).get_id().equals(input_id)) {
                        list.remove(i);
                        System.out.println("Anggota DPR dengan ID " + input_id + " berhasil dihapus.");
                        break; // exit loop once item is removed
                    }
                }
            } else if (pilihan == 4) {
                int idWidth = 0, namaWidth = 0, bidangWidth = 0, partaiWidth = 0;
                for (Dpr dpr : list) {
                    idWidth = Math.max(idWidth, dpr.get_id().length());
                    namaWidth = Math.max(namaWidth, dpr.get_nama().length());
                    bidangWidth = Math.max(bidangWidth, dpr.get_nama_bidang().length());
                    partaiWidth = Math.max(partaiWidth, dpr.get_nama_partai().length());
                }

                System.out.println("List Anggota DPR:");

                if (idWidth < 3) {
                    System.out.print("------");
                } else {
                    System.out.print("----");
                    for (int i = 0; i < idWidth - 2 + 2; i++) {
                        System.out.print("-");
                    }
                }
                
                if (namaWidth < 5) {
                    System.out.print("--------");
                } else {
                    System.out.print("------");
                    for (int i = 0; i < namaWidth - 4 + 2; i++) {
                        System.out.print("-");
                    }
                }
                
                if (bidangWidth < 12) {
                    System.out.print("---------------");
                } else {
                    System.out.print("-------------");
                    for (int i = 0; i < bidangWidth - 11 + 2; i++) {
                        System.out.print("-");
                    }
                }
                
                if (partaiWidth < 12) {
                    System.out.print("---------------");
                } else {
                    System.out.print("-------------");
                    for (int i = 0; i < partaiWidth - 11 + 2; i++) {
                        System.out.print("-");
                    }
                }

                System.out.print("-\n");

                if (idWidth < 3) {
                    System.out.print("| ID  ");
                } else {
                    System.out.print("| ID");
                    for (int i = 0; i < idWidth - 2 + 2; i++) {
                        System.out.print(" ");
                    }
                }

                if (namaWidth < 5) {
                    System.out.print("| Nama  ");
                } else {
                    System.out.print("| Nama");
                    for (int i = 0; i < namaWidth - 4 + 2; i++) {
                        System.out.print(" ");
                    }
                }

                if (bidangWidth < 12) {
                    System.out.print("| Nama Bidang  ");
                } else {
                    System.out.print("| Nama Bidang");
                    for (int i = 0; i < bidangWidth - 11 + 2; i++) {
                        System.out.print(" ");
                    }
                }

                if (partaiWidth < 12) {
                    System.out.print("| Nama Partai  ");
                } else {
                    System.out.print("| Nama Partai");
                    for (int i = 0; i < partaiWidth - 11 + 2; i++) {
                        System.out.print(" ");
                    }
                }
                System.out.print("|\n");

                if (idWidth < 3) {
                    System.out.print("------");
                } else {
                    System.out.print("----");
                    for (int i = 0; i < idWidth - 2 + 2; i++) {
                        System.out.print("-");
                    }
                }
                
                if (namaWidth < 5) {
                    System.out.print("--------");
                } else {
                    System.out.print("------");
                    for (int i = 0; i < namaWidth - 4 + 2; i++) {
                        System.out.print("-");
                    }
                }
                
                if (bidangWidth < 12) {
                    System.out.print("---------------");
                } else {
                    System.out.print("-------------");
                    for (int i = 0; i < bidangWidth - 11 + 2; i++) {
                        System.out.print("-");
                    }
                }
                
                if (partaiWidth < 12) {
                    System.out.print("---------------");
                } else {
                    System.out.print("-------------");
                    for (int i = 0; i < partaiWidth - 11 + 2; i++) {
                        System.out.print("-");
                    }
                }

                System.out.print("-\n");

                for (int i = 0; i < list.size(); i++) {
                    Dpr dpr = list.get(i);
                    System.out.print("| " + dpr.get_id());
                    if (idWidth < 3) {
                        for (int j = 0; j < 2 - dpr.get_id().length() + 2; j++) {
                            System.out.print(" ");
                        }
                    } else {
                        for (int j = 0; j < idWidth - dpr.get_id().length() + 2; j++) {
                            System.out.print(" ");
                        }
                    }

                    System.out.print("| " + dpr.get_nama());
                    if (namaWidth < 5) {
                        for (int j = 0; j < 4 - dpr.get_nama().length() + 2; j++) {
                            System.out.print(" ");
                        }
                    } else {
                        for (int j = 0; j < namaWidth - dpr.get_nama().length() + 2; j++) {
                            System.out.print(" ");
                        }
                    }

                    System.out.print("| " + dpr.get_nama_bidang());
                    if (bidangWidth < 12) {
                        for (int j = 0; j < 11 - dpr.get_nama_bidang().length() + 2; j++) {
                            System.out.print(" ");
                        }
                    } else {
                        for (int j = 0; j < bidangWidth - dpr.get_nama_bidang().length() + 2; j++) {
                            System.out.print(" ");
                        }
                    }

                    System.out.print("| " + dpr.get_nama_partai());
                    if (partaiWidth < 12) {
                        for (int j = 0; j < 11 - dpr.get_nama_partai().length() + 2; j++) {
                            System.out.print(" ");
                        }
                    } else {
                        for (int j = 0; j < partaiWidth - dpr.get_nama_partai().length() + 2; j++) {
                            System.out.print(" ");
                        }
                    }

                    System.out.print("|\n");

                    if (idWidth < 3) {
                        System.out.print("------");
                    } else {
                        System.out.print("----");
                        for (int j = 0; j < idWidth - 2 + 2; j++) {
                            System.out.print("-");
                        }
                    }
                    
                    if (namaWidth < 5) {
                        System.out.print("--------");
                    } else {
                        System.out.print("------");
                        for (int j = 0; j < namaWidth - 4 + 2; j++) {
                            System.out.print("-");
                        }
                    }
                    
                    if (bidangWidth < 12) {
                        System.out.print("---------------");
                    } else {
                        System.out.print("-------------");
                        for (int j = 0; j < bidangWidth - 11 + 2; j++) {
                            System.out.print("-");
                        }
                    }
                    
                    if (partaiWidth < 12) {
                        System.out.print("---------------");
                    } else {
                        System.out.print("-------------");
                        for (int j = 0; j < partaiWidth - 11 + 2; j++) {
                            System.out.print("-");
                        }
                    }
                    

                    System.out.print("-\n");
                }
            }
            System.out.println('\n');
            System.out.println("Fitur");
            System.out.println("1. Tambah");
            System.out.println("2. Ubah");
            System.out.println("3. Hapus");
            System.out.println("4. List Anggota DPR");
            System.out.println("5. Selesai");
            pilihan = sc.nextInt();
        }

        // System.out.println("List Anggota DPR:");
        // for (int i = 0; i < list.size(); i++) {
        // Dpr dpr = list.get(i);
        // System.out.println((i + 1) + ". " + dpr.get_id() + " | " + dpr.get_nama() + "
        // | " + dpr.get_nama_bidang()
        // + " | " + dpr.get_nama_partai());
        // }
        // Calculate column widths

    }

}
