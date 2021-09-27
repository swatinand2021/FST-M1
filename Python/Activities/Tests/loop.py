a = 0

while a < 5:
  print(a)
  a += 1


  a = 0
while a < 5:
  print(a)
  if a == 3:
    break
  a += 1 

  a = 0 
while a < 5:
  a += 1
  if a == 3:
    continue
  print(a)

  a = 1
while a < 5:
  print(a)
  a += 1
else:
  print("a is no longer less than 5")

fruits = ["apple", "banana", "cherry"]
for fruit in fruits:
  print(fruit) 

fruits = ["apple", "banana", "cherry"]
for fruit in fruits:
  if fruit == "banana":
    break
  print(fruit) 

fruits = ["apple", "banana", "cherry"]
for fruit in fruits:
  if fruit == "banana":
    continue
  print(fruit) 

for x in range(6):
  print(x) 

for x in range(2,6):
	
  print(x) 

	
for x in range(2,8,2):
	
  print(x)

for x in range(6):
  print(x)
else:
  print("Finally finished!") 

adjectives = ["red", "big", "tasty"]
fruits = ["apple", "banana", "cherry"]

for adjective in adjectives:
  for fruit in fruits:
    print(adjective, fruit) 