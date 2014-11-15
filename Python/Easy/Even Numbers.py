# CodeEval Easy:
#Even Numbers

import sys
test_cases = open(sys.argv[1], 'r')
for test in test_cases:
    print int((int(test) % 2 == 0))

test_cases.close()
