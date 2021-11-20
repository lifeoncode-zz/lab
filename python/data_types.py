# working with variables and diff data types

from datetime import date

current_year = date.today().year

name = input('Enter your name: ').title()
age = int(input('How old are you? '))

print(f'Hello {name}, you are {age} years old so you were born in {current_year - age}\n')

print(f'"{name}" is of type: {type(name)}')
print(f'"{age}" is of type: {type(age)}')
print(f'"{current_year}" is of type: {type(current_year)}\n')
 


# numeric

# int
num_as_string = '42'
num_as_integer = int(num_as_string)

# float
num_as_float = float(num_as_integer)

print(num_as_string, type(num_as_string))
print(num_as_integer, type(num_as_integer))
print(num_as_float, type(num_as_float))

