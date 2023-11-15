arr = [1,2,3,5,6,8,6,4,3,6]

ganjil = 0
genap = 0

for angka in arr:
    if angka %2 == 0:
        ganjil += 1
    else:
        genap += 1
    
print("angka ganjil : ",ganjil)
print("angka genap  : ",genap)