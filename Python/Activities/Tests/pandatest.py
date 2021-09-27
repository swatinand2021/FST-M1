	
# import pandas
	
import pandas as pd
	
 
	
# Create a dictionary to hold our data
	
data = {
	
  "X": [1, 2, 3, 4, 5],
	
  "Y": [9, 8, 7, 6, 5],
	
  "Z": [10, 12, 8, 4, 3]
	
}
	
 
	
# Create a new DataFrame using our dictionary
	
table = pd.DataFrame(data)
	
 
	
# Print the DataFrame
	
print(table)


import pandas
	
dataframe = pandas.read_csv('employees.csv')
	
print(dataframe)


	
import pandas
	
dataframe = pandas.read_csv('employees.csv')
	
print(dataframe["Name"][2])



# import pandas
import pandas

# Structure our data as a dictionary
data = {
  "Vehicle Type": ["Car", "Car", "Bike"],
  "Manufacturer": ["Maruti", "Toyota", "Royal Enfield"],
  "Model": ["Swift", "Corolla", "Thunderbird"]
}

# Create a new DataFrame using the data
dataframe = pandas.DataFrame(data)

# Write the data to a csv file
dataframe.to_csv("vehicles.csv")