#!/bin/env python3

from time import sleep
import turtle

bob = turtle.Turtle()
bob.pencolor('red')
bob.pensize(2)


def error_msg():
    print('GET YOUR SHIT TOGETHER!')


def go(x, y):
    try:
        bob.goto(x, y)
    except:
        error_msg()


def forward(steps):
    try:
        bob.fd(steps)
    except:
        error_msg()


def back(steps):
    try:
        bob.bk(steps)
    except:
        error_msg()


def right(deg):
    try:
        bob.rt(deg)
    except:
        error_msg()


def left(deg):
    try:
        bob.lt(deg)
    except:
        error_msg()


def up():
    bob.penup()


def down():
    bob.pendown()



def draw_i():
    up()
    go(-500, 200)
    down()
    forward(50)
    back(25)
    right(90)
    forward(200)
    left(90)
    back(25)
    forward(50)

    return draw_l()


def draw_l():
    up()
    go(-300, 200)
    down()
    right(90)
    forward(200)
    left(90)
    forward(50)

    return draw_o()


def draw_o():
    up()
    go(-150, 200)
    down()
    bob.circle(-100)

    return draw_v()


def draw_v():
    up()
    go(-50, 200)
    down()
    right(75)
    forward(200)
    left(150)
    forward(200)

    return draw_e()


def draw_e():
    up()
    go(100, 200)
    right(75)
    down()
    forward(80)
    back(80)
    right(90)
    forward(100)
    left(90)
    forward(50)
    back(50)
    right(90)
    forward(100)
    left(90)
    forward(80)

    return draw_y()


def draw_y():
    up()
    go(250, 200)
    down()
    right(75)
    forward(100)
    right(15)
    forward(100)
    back(100)
    left(165)
    forward(100)

    return False







sleep(5)
draw_i()

turtle.exitonclick();
