message = "hello world" 
print(message) 

"""hello python"""

len(message)
print(message[10])
print(message[1])
print(message[11])

#Slicing 
print(message[0:5:])
print(message[:5])
print(message[6:])

#Some inbuilt methods in strings
name = "madhurrrr"

print(name.lower())
print(name.upper())
print(name.count('m'))
print(name.find("rrr"))

new_name = name.replace(name, "naman")
print(new_name)


#Concatinating strings
name = "madhur"
greeting= "hyee"
message = greeting + " " + name
print(message)

#String Formatting
message = "{} {} !! how are you !".format(greeting, name)
print(message)

#Using f string literal
message= f"{greeting} {name.upper()} !!"
print(message)
print(dir(message))  # these are the methods which can be used for strings

print(help(str))