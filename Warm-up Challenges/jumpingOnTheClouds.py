# Complete the sockMerchant function below.
def jumpingOnClouds(c,n):
    i = 1
    if c[0] == 0 :  count = 1 
    else : count =  0
    while i < n-1 :
        if c[i] == 0 and c[i-1] == 0 and c[i+1] == 0 :
            c[i] = 1
        if c[i] == 0 :
            count += 1
        i += 1
    if c[n-1] == 0 : count += 1
    return count - 1    
             

if __name__ == '__main__':

   n = int(input())

   c = list(map(int, input().rstrip().split()))

   result = jumpingOnClouds(c,n)

   print(result)

