# CodeEval Easy:
# Multiplication Table

for n in range(1,13):
    numbers = ""
    for m in range(1,13):
        numbers += str(n * m).rjust(4)
    print numbers.rjust(4)





