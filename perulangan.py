# Minta pengguna memasukkan sebuah bilangan
bilangan = float(input("Masukkan sebuah bilangan: "))

# Percabangan if-else untuk mengecek jenis bilangan
if bilangan > 0:
    print("Bilangan adalah positif.")
elif bilangan < 0:
    print("Bilangan adalah negatif.")
else:
    print("Bilangan adalah nol.")
