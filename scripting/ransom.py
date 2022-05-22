#!/bin/env python3

import os

files = []
for file in os.listdir():
	if file == "ransom.py":
		continue
	else:
		files.append(file)

print(f"files collected: {files}")
