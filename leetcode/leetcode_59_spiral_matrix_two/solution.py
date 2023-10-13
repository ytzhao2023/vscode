class Solution:
    def generateMatrix(self, n: int) -> list[list[int]]:
        matrix = [[0] * n for _ in range(n)]
        left, top, right, bottom = 0, 0, n-1, n-1
        num = 1

        while num <= n * n:
            for i in range(left, right + 1):
                matrix[top][i] = num
                num += 1
                print(left, right + 1)
            top += 1
            print(top)

            for i in range(top, bottom + 1):
                matrix[i][right] = num
                num += 1
                print(top, bottom + 1)
            right -= 1
            print(right)

            for i in range(right, left - 1, -1):
                matrix[bottom][i] = num
                num += 1
                print(right, left - 1)
            bottom -= 1
            print(bottom)

            for i in range(bottom, top - 1, -1):
                matrix[i][left] = num
                num += 1
                print(bottom, top -1)
            left += 1
            print(left)

        return matrix

m = 5
s= Solution()
spiral_matrix = s.generateMatrix(m)

for row in spiral_matrix:
    print(row)
