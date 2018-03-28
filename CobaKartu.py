import random
kartu=['2w','2h','2k','2s','3w','3h','3k','3s','4w','4h','4k','4s','5w','5h','5k','5s',
       '6w','6h','6k','6s','7w','7h','7k','7s','8w','8h','8k','8s','9w','9h','9k','9s',
       '10w','10h','10k','10s','Jw','Jh','Jk','Js','Qw','Qh','Qk','Qs','Kw','Kh','Kk','Ks',
       'Aw','Ah','Ak','As']
poker=[]
sp=[]
fk=0
tot=0


# draw 5 kartu
def kocok():
    random.shuffle(kartu)
    for i in range (5):
        poker.append (kartu[i])
        print(poker[i],end=' ')
    return poker

kocok()
print()

# Straight Flush

# Four of a Kind
for i in range (5):
    for j in range (i+1,5):
        for k in range (j+1,5):
            for m in range (k+1,5):
                if poker[i][0]==poker[j][0]==poker[k][0]==poker[m][0]:
                    fk+=1
if fk==1:
    print('Anda dapat Four of a Kind')

# Full House
for i in range (3):
    for j in range (i+1,4):
        for k in range (j+1,5):
            for m in range(4):
                for n in range (m+1,5):
                    if (poker[i][0]==poker[j][0]==poker[k][0]) and (poker[m][0]==poker[n][0]) and (poker[i][0]!=poker[m][0]):
                        tot+=1
if tot==1:
    print('Anda dapat Full House')

# Flush
if poker [0][-1]==poker[1][-1]==poker[2][-1]==poker[3][-1]==poker[4][-1]:
    print('Anda dapat Flush')

# Straight
for i in range(5):
    sp.append(poker[i][0])
for j in range(5):
    if sp[j][0] == '2':
        sp[j]=80
    elif sp[j][0] == '3':
        sp[j]=81
    elif sp[j][0] == '4':
        sp[j]=82
    elif sp[j][0] == '5':
        sp[j]=83
    elif sp[j][0] == '6':
        sp[j]=84
    elif sp[j][0] == '7':
        sp[j] = 85
    elif sp[j][0] == '8':
        sp[j] = 86
    elif sp[j][0] == '9':
        sp[j] = 87
    elif sp[j][0] == '1':
        sp[j] = 88
    elif sp[j][0] == 'J':
        sp[j]=89
    elif sp[j][0] == 'Q':
        sp[j]=90
    elif sp[j][0] == 'K':
        sp[j]=91
    elif sp[j][0] == 'A':
        sp[j]=92
sp=sorted(sp)
if sp[3]==83 and sp[4]==92:
    sp[4]=79
    sp=sorted(sp)
print(sp)
if sp[0]==sp[1]-1 and sp[1]==sp[2]-1 and sp[2]==sp[3]-1 and sp[3]==sp[4]-1:
    print ('Anda dapat Straight')

# Three of a Kind
for i in range (5):
    for j in range (i+1,5):
        for k in range (j+1,5):
            if poker[i][0]==poker[j][0]==poker[k][0]:
                tot+=1
if tot==1:
    print('Anda dapat Threes')

# Pair dan Two Pairs
for i in range (5):
    for j in range (i+1,5):
        if poker[i][0]==poker[j][0]:
            tot+=1
if tot==1:
    print('Anda dapat Pair')
if tot==2:
    print('Anda dapat Two Pairs')