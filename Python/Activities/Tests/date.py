from datetime import datetime

x = datetime.now()
print(x) 

# Output: 2020-05-01 12:11:17.902820


from datetime import datetime

x = datetime.now()

print(x.year) # Output: 2020
print(x.strftime("%A")) # Output: Friday


from datetime import datetime

x = datetime(2020, 5, 1)

print(x) # Output: 2020-05-01 00:00:00

from datetime import datetime

x = datetime(2020, 5, 1)

print(x.strftime("%B")) # Output: May