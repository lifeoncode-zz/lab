
from soupsieve import select


class Person:

    def __init__(self, name, age, job):
        self.name = name
        self.age = age
        self.job = job

    def information(self):
        return f"{self.name} is {self.age} years old and he is a {self.job}."


jake = Person("Jake", 23, "game developer")
info = jake.information()
print(info)