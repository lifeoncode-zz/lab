#!/usr/bin/env python3

# this small script checks if computer is connected
# to the web by pinging google, if no response
# then there must be no connection to internet, otherwise...

from time import sleep
import os


def ping():
	os.system("ping google.com -c 3 > ping_results.txt")
	sleep(3)
	return check_pings()


def check_pings():
	file = open("./ping_results.txt", "r")
	results = file.read()
	msg = ""
	if "64 bytes from" in results:
		msg = "We got internet!"
	else:
		msg = "No internet connection..."

	return True, print(msg)


if __name__ == "__main__":
	ping()
