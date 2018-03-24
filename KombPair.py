kartu=['2','3','4','5','6','7','8','9','10','J','Q','K','A'],\
      ['h','k','s','w']


inc=0
#hk
for i in range (13):
    for j in range(0,2):
        for k in range(j,j+1):
            print(kartu[0][i],end='')
            print(kartu[1][j],end=' ')
    inc+=1
    print()
print(inc)
print()

#hs
for i in range (13):
    for j in range(0,2):
        for k in range(j,j+1):
            print(kartu[0][i],end='')
            print(kartu[1][j+k],end=' ')
    inc+=1
    print()
print(inc)
print()

#hw
for i in range (13):
    for j in range(0,2):
        for k in range(j,j+1):
            print(kartu[0][i],end='')
            print(kartu[1][j+(2*k)],end=' ')
    inc+=1
    print()
print(inc)
print()

# ks
for i in range (13):
    for j in range(1,3):
        for k in range(j,j+1):
            print(kartu[0][i],end='')
            print(kartu[1][j],end=' ')
    inc+=1
    print()
print(inc)
print()

# kw
for i in range (13):
    for j in range(1,4,+2):
        for k in range(j,j+1,+2):
            print(kartu[0][i],end='')
            print(kartu[1][j],end=' ')
    inc+=1
    print()
print(inc)
print()

# sw
for i in range (13):
    for j in range(1,3):
        for k in range(j,j+1):
            print(kartu[0][i],end='')
            print(kartu[1][j+1],end=' ')
    inc+=1
    print()
print(inc)
print()