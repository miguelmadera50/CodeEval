# CodeEval Easy:
# Multiplying Lists
import sys
test_cases = open(sys.argv[1], 'r')
for test in test_cases:
    
    split = test.split(" | ")
    num1 = split[0].split()
    num2 = split[1].split()
    string = ""

    for i in range(0, len(num1)):
        string += str(int(num1[i]) * int(num2[i])) + " "

    # Removes trailing space
    print string[:-1]

test_cases.close()



