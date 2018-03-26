import random
kartupoker = ['2W','2H','2S','2K','3W','3H','3S','3K','4W','4H','4S','4K','5W',
              '5H','5S','5K','6W','6H','6S','6K','7W','7H','7S','7K','8W','8H',
              '8S','8K','9W','9H','9S','9K','10W','10H','10S','10W','JW','JH','JS',
              'JK','QW','QH','QS','QK','KW','KH','KS','KK','AW','AH','AS','AK']

fk=0
fh=0
thr=0
pair=0
# drawkartu = ['10W','10K','10h','10S','9W']
def drawacakkartu():
    drawkartu = []
    random.shuffle(kartupoker)
    print('Draw Kartu: ')
    for i in range(0,5):
        drawkartu.append(kartupoker[i])
    return drawkartu

drawkartu = drawacakkartu()
print(drawkartu)
print('')


# four:
for i in range(5):
    for j in range(i+1,5):
        for k in range(j+1,5):
            for l in range(k+1,5):
                if drawkartu[i][0]==drawkartu[j][0]==drawkartu[k][0]==drawkartu[l][0]:
                    fk+=1
if fk==1:
    print('Ini Merupakan Four of A Kind')


# fullhouse
for i in range (3):
    for j in range (i+1,4):
        for k in range (j+1,5):
            for l in range (4):
                for m in range(l+1,5):
                    if(drawkartu[i][0]==drawkartu[j][0]==drawkartu[k][0]) and (drawkartu[l][0]==drawkartu[m][0]) and\
                        (drawkartu[i][0]!=drawkartu[l][0]):
                        fh+=1
if fh==1:
    print('Ini Merupakan Full House')


# flush:
if drawkartu[0][-1]==drawkartu[1][-1]==drawkartu[2][-1]==drawkartu[3][-1]==drawkartu[4][-1]:
    print('Ini Merupakan Flush')


# threes:
for i in range(5):
    for j in range(i+1,5):
        for k in range(j+1,5):
            if drawkartu[i][0]==drawkartu[j][0]==drawkartu[k][0]:
                thr+=1
if thr==1:
    print('Ini Merupakan Three of A Kind')


# twopair&pair:
for i in range(5):
    for j in range(i+1,5):
        if drawkartu[i][0]==drawkartu[j][0]:
            pair+=1
if pair==1:
    print('Ini Merupakan Pair')
if pair==2:
    print('Ini Merupakan Two Pair')


# def cek(drawkartu):
#     if (drawkartu[0][0]==drawkartu[1][0]==drawkartu[2][0]==drawkartu[3][0] or
#         drawkartu[0][0]==drawkartu[1][0]==drawkartu[2][0]==drawkartu[4][0] or
#         drawkartu[0][0]==drawkartu[1][0]==drawkartu[3][0]==drawkartu[4][0] or
#         drawkartu[0][0]==drawkartu[2][0]==drawkartu[3][0]==drawkartu[4][0] or
#         drawkartu[1][0]==drawkartu[2][0]==drawkartu[3][0]==drawkartu[4][0]):
#         print('Ini Merupakan Four of a Kind')
#     if ((drawkartu[0][0]==drawkartu[1][0]==drawkartu[2][0] and drawkartu[3][0]==drawkartu[4][0]) or
#         (drawkartu[0][0]==drawkartu[1][0]==drawkartu[3][0] and drawkartu[2][0]==drawkartu[4][0]) or
#         (drawkartu[0][0]==drawkartu[1][0]==drawkartu[4][0] and drawkartu[2][0]==drawkartu[3][0]) or
#         (drawkartu[0][0]==drawkartu[2][0]==drawkartu[3][0] and drawkartu[1][0]==drawkartu[4][0]) or
#         (drawkartu[0][0]==drawkartu[2][0]==drawkartu[4][0] and drawkartu[1][0]==drawkartu[3][0]) or
#         (drawkartu[0][0]==drawkartu[3][0]==drawkartu[4][0] and drawkartu[1][0]==drawkartu[2][0]) or
#         (drawkartu[1][0]==drawkartu[2][0]==drawkartu[3][0] and drawkartu[0][0]==drawkartu[4][0]) or
#         (drawkartu[1][0]==drawkartu[2][0]==drawkartu[4][0] and drawkartu[0][0]==drawkartu[3][0]) or
#         (drawkartu[1][0]==drawkartu[3][0]==drawkartu[4][0] and drawkartu[0][0]==drawkartu[2][0]) or
#         (drawkartu[2][0]==drawkartu[3][0]==drawkartu[4][0] and drawkartu[0][0]==drawkartu[1][0])):
#         print('Ini Merupakan Full House')
#     elif (drawkartu[0][-1]==drawkartu[1][-1]==drawkartu[2][-1]==drawkartu[3][-1]==drawkartu[4][-1]):
#         print('Ini Merupakan Flush')
#     elif (drawkartu[0][0]==drawkartu[1][0]==drawkartu[2][0] or drawkartu[0][0]==drawkartu[1][0]==drawkartu[3][0] or
#         drawkartu[0][0]==drawkartu[1][0]==drawkartu[4][0] or drawkartu[0][0]==drawkartu[2][0]==drawkartu[3][0] or
#         drawkartu[0][0]==drawkartu[2][0]==drawkartu[4][0] or drawkartu[0][0]==drawkartu[3][0]==drawkartu[4][0] or
#         drawkartu[1][0]==drawkartu[2][0]==drawkartu[3][0] or drawkartu[1][0]==drawkartu[2][0]==drawkartu[4][0] or
#         drawkartu[2][0]==drawkartu[3][0]==drawkartu[4][0]):
#         print('Ini Merupakan Three of a Kind')
#
# print(cek(drawkartu))