kartu = ['2','3','4','5','6','7','8','9','10','J','Q','K','A'],\
        ['W','H','S','K']
incr1 = 0
incr2 = 0
incr3 = 0
incr4 = 0
incr_total = 0

for i in range(13):
    for j in range(3):
        print(kartu[0][i], end='')
        print(kartu[1][j], end=' ')
    print('')
    incr1 += 1
print('Kemungkinan : ', incr1)


print("\n")
for i in range(13):
    for j in range(1,4):
        print(kartu[0][i], end='')
        print(kartu[1][j], end=' ')
    print()
    incr2 += 1
print('Kemungkinan : ', incr2)



print("\n")
for i in range(13):
    for j in range(2,4):
        print(kartu[0][i], end='')
        print(kartu[1][j], end=' ')
    for j in range(1):
        print(kartu[0][i], end='')
        print(kartu[1][j], end=' ')
        incr3 += 1
    print()
print('Kemungkinan : ', incr3)



print("\n")
for i in range(13):
    for j in range(0,2):
        print(kartu[0][i], end='')
        print(kartu[1][j], end=' ')
    for j in range(3,4):
        print(kartu[0][i], end='')
        print(kartu[1][j], end=' ')
        incr4 += 1
    print()
print('Kemungkinan : ', incr4)

print('\n')
incr_total = incr1+incr2+incr3+incr4
print('Total Kemungkinan: ', incr_total)