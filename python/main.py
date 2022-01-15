import turtle

anton = turtle.Turtle()

def draw_square():
    anton.color('purple', 'yellow')
    anton.begin_fill()

    for i in range(4):
        anton.fd(100)
        anton.rt(90)

    anton.end_fill()

# one
draw_square()

anton.penup()
anton.fd(150)
anton.pendown()

# two
draw_square()

anton.penup()
anton.bk(300)
anton.pendown()

# three
draw_square()


turtle.exitonclick()