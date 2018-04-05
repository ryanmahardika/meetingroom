# file = open("test.txt","w")
# file.write("Tulis Apaan Aja")

# file = open("input.txt","r")
# print(file.read())

# file = open("test.txt","a")
# file.write("Suka-Suka")

file = open('input.txt', 'r')
isi = file.read()
angka = isi.split(' ')
arrayf=[];
fib=1;
for i in range(6):
    if (i==0):
        arrayf.append(str(fib))
    else:
        arrayf.append(str(fib))
        fib=fib+int(arrayf[i-1])

for j in range(len(angka)):
    if angka[j] in arrayf:
        file1=open('output.txt','a')
        file1.write(angka[j])
        file1.write(' ')