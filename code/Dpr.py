class Dpr:

    __idd = ""
    __nama = ""
    __nama_bidang = ""
    __nama_partai = ""

    def __init__(self, idd="", nama="", nama_bidang="", nama_partai=""):
        self.__idd = idd
        self.__nama = nama
        self.__nama_bidang = nama_bidang
        self.__nama_partai = nama_partai

    def get_idd(self):
        return self.__idd

    def set_idd(self, idd):
        self.__idd = idd

    def get_nama(self):
        return self.__nama

    def set_nama(self, nama):
        self.__nama = nama

    def get_nama_bidang(self):
        return self.__nama_bidang

    def set_nama_bidang(self, nama_bidang):
        self.__nama_bidang = nama_bidang

    def get_nama_partai(self):
        return self.__nama_partai

    def set_nama_partai(self, nama_partai):
        self.__nama_partai = nama_partai
