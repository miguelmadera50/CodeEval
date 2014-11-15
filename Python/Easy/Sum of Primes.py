# CodeEval Easy
# Sum1000Primes
primes = 0
sumPrimes = 0
acc = 2

# Returns 1 if number is prime, 0 otherwise
def isPrime(number):
    for i in range(2, int((number ** 0.5))):
        if number % i == 0:
            return 0
    return 1

while primes < 1000:    
    if isPrime(acc):
        sumPrimes += acc
        primes += 1
    acc += 1
print sumPrimes

