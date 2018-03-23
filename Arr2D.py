minuman=['kopi','capuccino','frappucino'],\
        ['jus apel','jus jeruk','jus alpukat']

# print(minuman[1][1])
# for i in (minuman):
#     for j in i:
#         print (j)

kartu=['2','3','4','5','6','7','8','9','10','J','Q','K','A'],\
      ['h','k','s','w']


inc=0
for i in range (13):
    for j in range(0,2):
        for k in range(j,j+1):
            print(kartu[0][i],end='')
            print(kartu[1][j],end=' ')
    inc+=1
    print()
print(inc)
print()
for i in range (13):
    for j in range(0,2):
        for k in range(j,j+1):
            print(kartu[0][i],end='')
            print(kartu[1][j+k],end=' ')
    inc+=1
    print()
print(inc)
print()
for i in range (13):
    for j in range(0,2):
        for k in range(j,j+1):
            print(kartu[0][i],end='')
            print(kartu[1][j+k+k],end=' ')
    inc+=1
    print()
print()
print(inc)