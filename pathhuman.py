# size matriks
N = 8

# cetak langkah jalurnya
def printSolution(solmatriks):
    for i in solmatriks:
        for j in i:
            print(str(j) + " ", end="")
        print("")


# fungsi untuk cek jika x,y valid
# index for N*N Maze
def cek(maze, x, y):
    if x >= 0 and x < N and y >= 0 and y < N and maze[x][y] == 1:
        return True

    return False


def penyelesaian(maze):
    # matriks 8x8
    solmatriks = [[0 for j in range(8)] for i in range(8)]

    if ceklangkah(maze, 0, 1, solmatriks) == False:
        print("Tidak Ada Penyelesaian Langkah");
        return False

    printSolution(solmatriks)
    return True


# fungsi pengecekan perlangkah
def ceklangkah(maze, x, y, solmatriks):
    # titik kordinat finish
    if x == N - 2 and y == N - 4:
        solmatriks[x][y] = 1
        return True

    # cek jika maze[x][y] valid
    if cek(maze, x, y) == True:
        # tandai kalo kordinat merupakan path benar (solusi)
        solmatriks[x][y] = 1

        # pindah ke bawah
        if ceklangkah(maze, x + 1, y, solmatriks) == True:
            return True

        # jika pindah ke bawah tidak bisa
        # pindah kanan
        if ceklangkah(maze, x, y + 1, solmatriks) == True:
            return True

        # jika ke kanan dan ke bawah tidak bisa
        # pindah ke kiri
        if ceklangkah(maze, x, y - 1, solmatriks) == True:
            return True

        # BACKTRACK: x,y bukan jalurnya
        solmatriks[x][y] = 0
        return False


if __name__ == "__main__":
    maze = [[0, 1, 1, 0, 1, 1, 1, 1],
            [1, 1, 0, 0, 0, 1, 1, 0],
            [1, 1, 1, 1, 1, 1, 1, 0],
            [1, 1, 1, 1, 1, 1, 1, 0],
            [0, 0, 0, 1, 1, 1, 1, 0],
            [1, 1, 1, 0, 0, 1, 1, 0],
            [1, 1, 1, 1, 1, 1, 0, 1],
            [1, 1, 1, 1, 0, 0, 1, 1]]

    penyelesaian(maze)