#!/bin/env python3

from time import sleep
from sys import argv
from getpass import getpass


def signup():
    while True:
        username = get_username("signup")
        if validate_username(username):
            break
        else:
            print("Invalid username...")

    while True:
        password = get_password("signup")
        if validate_password(password):
            break
        else:
            print("Invalid password...")

    return create_user(username, password)


def login():
    while True:
        username = get_username("login")
        if find_user(username):
            password = get_password("login")
            if match_user_password(username, password):
                print(f"Login successful! Welcome back {username}...")
                break
            else:
                print(f"Invalid password for {username}, try again.\n")
        else:
            print(f"User {username} not found, try again.\n")
            

def get_username(login_or_signup):
    if login_or_signup == "signup":
        return input("create a username: ").strip()

    if login_or_signup == "login":
        return input("enter username: ").strip()


def get_password(login_or_signup):
    if login_or_signup == "signup":
        return getpass("create a password: ").strip()

    if login_or_signup == "login":
        return getpass("enter password: ").strip()


def create_user(username, password):
    print(f"creating user...\nUSERNAME: {username}\nPASSWORD: {password}")
    try:
        open("users.txt", "x")
    except Exception:
        print("found users in database...\n")
    
    try:
        with open("users.txt", "a") as users_file:
            users_file.write(f"{username}:{password}\n")
            print(f"{username} Successfully signed up!\n")

    except FileNotFoundError:
        print("Error: users table not found in database...")


def find_user(username):
    try:
        with open("users.txt") as users_file:
            if username not in users_file.read():
                return False
            else:
                return True
    except Exception:
        print("Error: users not found in database...\n")

        
def match_user_password(username, password):
    try:
        with open("users.txt") as users_file:
            usernames = users_file.readlines()
            for user in usernames:
                user_details = user.split(":")
                if user_details[0] == username:
                    if user_details[1][:-1] == password:
                        return True;
                    else:
                        return False
                    
    except Exception:
        print("Error: users not found in database...\n")


def validate_username(username):
    if len(username) < 4 or len(username) > 25:
        return False
    else:
        return True

    
def validate_password(password):
    if len(password) < 8 or not is_number(password):
        return False
    else:
        return True


def is_number(value):
    value_checker = ""
    for i in value:
        try:
            int(i)
            value_checker += "yes"
        except Exception:
            value_checker += "no"
        
    if "yes" not in value_checker:
        return False
    else:
        return True

try:
    if argv[1].lower().strip() == "signup":
        signup()
    if argv[1].lower().strip() == "login":
        login()

except Exception:
    print("Please provide argument [login/signup]")


