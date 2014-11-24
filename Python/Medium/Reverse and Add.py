# CodeEval Medium:
# Reverse and Add
import sys
test_cases = open(sys.argv[1], 'r')
for test in test_cases:

    num = int(test)
    reverse = test[::-1]
    loops = 0
    
    while test != reverse:
        num += int(reverse)    
        test = str(num)
        reverse = test[::-1]
        loops += 1

    print str(loops) + " " + test

test_cases.close()

