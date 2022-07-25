import os

current_dir = os.getcwd()
for dir in os.listdir(current_dir):
    print(dir)