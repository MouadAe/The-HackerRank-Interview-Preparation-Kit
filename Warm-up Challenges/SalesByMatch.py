# Complete the sockMerchant function below.
def sockMerchant(n, ar):
    countDict = dict()
    result = 0
    for item in ar :
        if item in countDict :
            countDict[item] += 1
            if countDict[item] % 2 == 0 :
               result += 1
        else :
            countDict[item] = 1
    return result

if __name__ == '__main__':

   n = int(input())

   ar = list(map(int, input().rstrip().split()))

   result = sockMerchant(n, ar)

   print(result)

