# size matriks
N = 8


# cetak langkah jalurnya
def printSolution(sol):
    for i in sol:
        for j in i:
            print(str(j) + " ", end="")
        print("")


# fungsi untuk cek jika x,y valid
# index for N*N Maze
def isSafe(maze, x, y):
    if x >= 0 and x < N and y >= 0 and y < N and maze[x][y] == 1:
        return True

    return False

def solveMaze(maze):
    # matriks 8x8
    sol = [[0 for j in range(8)] for i in range(8)]

    if solveMazeUtil(maze, 0, 1, sol) == False:
        print("Solution doesn't exist");
        return False

    printSolution(sol)
    return True


# A recursive utility function to solve Maze problem
def solveMazeUtil(maze, x, y, sol):
    # kordinat finish
    if x == N - 2 and y == N - 3:
        sol[x][y] = 1
        return True

    # cek jika maze[x][y] valid
    if isSafe(maze, x, y) == True:
        # tanda kalo kordinat merupakan path benar (solusi)
        sol[x][y] = 1

        # pindah kanan (arah x)
        if solveMazeUtil(maze, x + 1, y, sol) == True:
            return True

        # jika pindah ke kanan tidak bisa
        # pindah bawah (arah y)
        if solveMazeUtil(maze, x, y + 1, sol) == True:
            return True

        # # jika pindah ke bawah tidak bisa
        # # pindah ke kiri (arah -x)
        # if solveMazeUtil(maze, x - 1, y, sol) == True:
        #     return True

        # If none of the above movements work then
        # BACKTRACK: unmark x,y as part of solution path
        sol[x][y] = 0
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

    solveMaze(maze)