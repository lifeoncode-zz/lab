

from click import pass_context
from flask_login import session_protected


class Person:
    """"needs 3 args to construct
    args: NAME, AGE, GENDER
    """
    def __init__(self, name, age, gender):
        self.name = name
        self.age = age
        self.gender = gender
    
    def get_name(self):
        """returns Person name"""
        return self.name.title()

    def get_age(self):
        """returns Person age"""
        return self.age

    def get_gender(self):
        """returns Person gender"""
        return self.gender

    def get_person_details(self):
        return f"{self.name.title()} is {self.age} years old and is of {self.gender} gender"

    def speak(self, what):
        return f'{self.name.upper()} says "{what}"'


jake = Person("jake", 34, "male")

print(jake.speak("this is fun"))