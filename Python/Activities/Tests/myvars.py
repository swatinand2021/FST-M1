	
myVariable = 5

print(myVariable)
	
myVariable # Output: 5
	
myVariable = "hello"

print(myVariable)
	


"""
This is a comment
written in
more than just one line
"""

x = 1    # int
y = 2.8  # float
z = 1j   # complex

print(type(x)) # Output: <class 'int'>
print(type(y)) # Output: <class 'float'>
print(type(z)) # Output: <class 'complex'>
print(type(myVariable))

a = """Lorem ipsum dolor sit amet,
consectetur adipiscing elit,
sed do eiusmod tempor incididunt
ut labore et dolore magna aliqua."""
print(a) 


a = "Hello, World!"
print(a[1]) # Output: "e"


b = "Hello, World!"
print(b[2:5]) # Output: "llo"

	
a = "Hello, World!"
	
print(len(a)) # Output: 13

a = "Hello, World!"
print(a.lower()) # Output: "hello, world!"

a = "Hello, World!"
print(a.upper()) # Output: "HELLO, WORLD!"

a = "Hello, World!"
print(a.replace("H", "J")) # Output: "Jello, World!"

a = "Hello, World!"
print(a.split(",")) # returns ['Hello', ' World!'] 

txt = "The rain in Spain stays mainly in the plain"
x = "ain" in txt
y = "ain" not in txt
print(x) # True
print(y) # False

a = "Hello"
b = " World"
c = a + b
print(c) # "Hello World"

age = 36
txt = "My name is John, I am " + age
print(txt)


age = 36
txt = "My name is John, and I am {}"
print(txt.format(age))

# Output: My name is John, and I am 36


quantity = 3
itemno = 567
price = 49.95
myorder = "I want {} pieces of item {} for {} dollars."
print(myorder.format(quantity, itemno, price))

# Output: I want 3 pieces of item 567 for 49.95 dollars.

quantity = 3
itemno = 567
price = 49.95
myorder = "I want to pay {2} dollars for {0} pieces of item {1}."
print(myorder.format(quantity, itemno, price))

# Output: I want to pay 49.95 dollars for 3 pieces of item 567.

