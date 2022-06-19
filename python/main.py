
from curses.ascii import US


class User():
    
    def __init__(self, username, password) -> None:
        self.username = username
        self.password = password


    def get_username(self):
        return self.username

    def get_password(self):
        return self.password

    def user_info(self):
        return f"{self.username}'s password is {self.password}"


jake = User("jake", "1234")


print(jake.user_info())