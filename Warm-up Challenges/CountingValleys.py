def countingValleys(steps, path):
   currentLevel = 0  #We are in the Sea level
   result = 0
   underSea = False
   for char in path :
      if char == 'U' :
         currentLevel += 1
      else :
         currentLevel -= 1
      if underSea == True and currentLevel == 0 :
         result += 1
         underSea = False
      if currentLevel < 0 :
         underSea = True
   return result

if __name__ == '__main__':

   steps = int(input().strip())

   path = input()

   result = countingValleys(steps, path)

   print(str(result))