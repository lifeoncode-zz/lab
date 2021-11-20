# Woring with string data types

# case sensitive
message = 'Hi I am Python'
meSsage = 'Hi I am also Python'
print(message)
print(meSsage)
print(f'{message} is not the same as {meSsage}.\n')

# concat
perosn_1 = 'jake'
person_2 = 'fin'

print(person_2+' and '+perosn_1+' are bros.')
print(person_2,'and',perosn_1,'live together.')
print(f'{perosn_1} loves his bro, {person_2}\n')

# --------------------------------------------
# take input
something_stored_here = input('Enter something: ')
print(f'You entered: "{something_stored_here}"\n')


# escaping characters in strings
split_string = 'This is how you\nstart\nnew\nlines\nin\npython!\n'
print(split_string)

escape_quotes = 'My father said \'don\'t you worry child!\''
print(escape_quotes)

tab_string = 'Push me \tover \there!\n'
print(tab_string)


# multiline strings
message = '''this is a message
delivered to you by Python
multiline strings. Enjoy!
'''
print(message)


# split line length to limit characters
long_line_string = 'You nee to cut this line because it is too long \
    and you might be sick of reading it like this!\n'
print(long_line_string)


# raw strings
# escape not recognized - takes EVERYTHING in '' as string
raw_string = r'\nothing in \this string is escaped.'
print(raw_string)
