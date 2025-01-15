# Prompt for two 2D matrices of the same dimensions
rows = int(input("Enter the number of rows: "))
cols = int(input("Enter the number of columns: "))

matrix1 = []
matrix2 = []

print("Enter elements for Matrix 1:")
for i in range(rows):
    row = list(map(int, input().split()))
    matrix1.append(row)

print("Enter elements for Matrix 2:")
for i in range(rows):
    row = list(map(int, input().split()))
    matrix2.append(row)

result = [[matrix1[i][j] + matrix2[i][j] for j in range(cols)] for i in range(rows)]

print("Resulting Matrix after Addition:")
for row in result:
    print(row)