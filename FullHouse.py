kartu=['2','3','4','5','6','7','8','9','10','J','Q','K','A'],\
      ['h','k','s','w']
inc=0
tot=0

# hks-hk
for i in range(13):
    for j in range(13):
        for k in range(3):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for m in range(2):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][j],end='')
                print(kartu[1][m],end=' ')
        print('')
        inc+=1
    print()
    tot=inc-13
print(tot)

# hks-hs
for i in range(13):
    for j in range(13):
        for k in range(3):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for m in range(0,4,+2):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][j],end='')
                print(kartu[1][m],end=' ')
        print('')
        inc+=1
    print()
    tot=inc-26
print(tot)

# hks-hw
for i in range(13):
    for j in range(13):
        for k in range(3):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for m in range(0,4,+3):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][j],end='')
                print(kartu[1][m],end=' ')
        print('')
        inc+=1
    print()
    tot=inc-39
print(tot)

# hks-ks
for i in range(13):
    for j in range(13):
        for k in range(3):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for m in range(1,3):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][j],end='')
                print(kartu[1][m],end=' ')
        print('')
        inc+=1
    print()
    tot=inc-52
print(tot)

# hks-kw
for i in range(13):
    for j in range(13):
        for k in range(3):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for m in range(1,4,+2):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][j],end='')
                print(kartu[1][m],end=' ')
        print('')
        inc+=1
    print()
    tot=inc-65
print(tot)

# hks-sw
for i in range(13):
    for j in range(13):
        for k in range(3):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for m in range(k,k+2):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][j],end='')
                print(kartu[1][m],end=' ')
        print('')
        inc+=1
    print()
    tot=inc-78
print(tot)

# ksw-hk
for i in range(13):
    for j in range(13):
        for k in range(1,4):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for m in range(2):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][j], end='')
                print(kartu[1][m], end=' ')
        print('')
        inc += 1
    print()
    tot = inc - 91
print(tot)

# ksw-hs
for i in range(13):
    for j in range(13):
        for k in range(1,4):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for m in range(0,4,+2):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][j], end='')
                print(kartu[1][m], end=' ')
        print('')
        inc += 1
    print()
    tot = inc - 104
print(tot)

# ksw-hw
for i in range(13):
    for j in range(13):
        for k in range(1,4):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for m in range(0,4,+3):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][j], end='')
                print(kartu[1][m], end=' ')
        print('')
        inc += 1
    print()
    tot = inc - 117
print(tot)

# ksw-ks
for i in range(13):
    for j in range(13):
        for k in range(1,4):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for m in range(1,3):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][j], end='')
                print(kartu[1][m], end=' ')
        print('')
        inc += 1
    print()
    tot = inc - 130
print(tot)

# ksw-kw
for i in range(13):
    for j in range(13):
        for k in range(1,4):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for m in range(1,4,+2):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][j], end='')
                print(kartu[1][m], end=' ')
        print('')
        inc += 1
    print()
    tot = inc - 143
print(tot)

# ksw-sw
for i in range(13):
    for j in range(13):
        for k in range(3):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for m in range(k,k+2):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][j], end='')
                print(kartu[1][m], end=' ')
        print('')
        inc += 1
    print()
    tot = inc - 156
print(tot)

# hkw-hk
for i in range(13):
    for j in range(13):
        for k in range(2):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for k in range(3,4):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for m in range(2):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][j],end='')
                print(kartu[1][m],end=' ')
        print('')
        inc+=1
    print()
    tot=inc-169
print(tot)

# hkw-hs
for i in range(13):
    for j in range(13):
        for k in range(2):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for k in range(3,4):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for m in range(0,4,+2):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][j],end='')
                print(kartu[1][m],end=' ')
        print('')
        inc+=1
    print()
    tot=inc-182
print(tot)

# hkw-hw
for i in range(13):
    for j in range(13):
        for k in range(2):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for k in range(3,4):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for m in range(0,4,+3):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][j],end='')
                print(kartu[1][m],end=' ')
        print('')
        inc+=1
    print()
    tot=inc-195
print(tot)

# hkw-ks
for i in range(13):
    for j in range(13):
        for k in range(2):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for k in range(3,4):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for m in range(1,3):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][j],end='')
                print(kartu[1][m],end=' ')
        print('')
        inc+=1
    print()
    tot=inc-208
print(tot)

# hkw-kw
for i in range(13):
    for j in range(13):
        for k in range(2):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for k in range(3,4):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for m in range(1,4,+2):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][j],end='')
                print(kartu[1][m],end=' ')
        print('')
        inc+=1
    print()
    tot=inc-221
print(tot)

# hkw-sw
for i in range(13):
    for j in range(13):
        for k in range(2):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for k in range(3,4):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for m in range(k-1,k+1):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][j],end='')
                print(kartu[1][m],end=' ')
        print('')
        inc+=1
    print()
    tot=inc-234
print(tot)

# hsw-hk
for i in range(13):
    for j in range(13):
        for k in range(1):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for k in range(2,4):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for m in range(2):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][j],end='')
                print(kartu[1][m],end=' ')
        print('')
        inc+=1
    print()
    tot=inc-247
print(tot)

# hsw-hs
for i in range(13):
    for j in range(13):
        for k in range(1):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for k in range(2,4):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for m in range(0,4,+2):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][j],end='')
                print(kartu[1][m],end=' ')
        print('')
        inc+=1
    print()
    tot=inc-260
print(tot)

# hsw-hw
for i in range(13):
    for j in range(13):
        for k in range(1):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for k in range(2,4):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for m in range(0,4,+3):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][j],end='')
                print(kartu[1][m],end=' ')
        print('')
        inc+=1
    print()
    tot=inc-273
print(tot)

# hsw-ks
for i in range(13):
    for j in range(13):
        for k in range(1):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for k in range(2,4):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for m in range(1,3):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][j],end='')
                print(kartu[1][m],end=' ')
        print('')
        inc+=1
    print()
    tot=inc-286
print(tot)

# hsw-kw
for i in range(13):
    for j in range(13):
        for k in range(1):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for k in range(2,4):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for m in range(1,4,+2):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][j],end='')
                print(kartu[1][m],end=' ')
        print('')
        inc+=1
    print()
    tot=inc-299
print(tot)

# hsw-sw
for i in range(13):
    for j in range(13):
        for k in range(1):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for k in range(2,4):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][i],end='')
                print(kartu[1][k],end=' ')
        for m in range(k-1,k+1):
            if kartu[0][i] == kartu[0][j]:
                continue
            else:
                print(kartu[0][j],end='')
                print(kartu[1][m],end=' ')
        print('')
        inc+=1
    print()
    tot=inc-312
print(tot)