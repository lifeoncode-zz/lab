#!/bin/env python3
import os
from time import sleep

while True:
	os.system('ping google.com -c 2 > result.txt')
	with open("result.txt", "r") as file:
		if "64 bytes from" in file.read():
			print("Systems online...")
			sleep(5)
			open_browser()
			break
		else:
			print("Systems offline.")

def open_browser():
	os.system('firefox google.com')
