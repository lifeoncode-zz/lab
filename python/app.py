import turtle

anton = turtle.Turtle()

def big_star():
    anton.fd(200)
    small_star()
    

def small_star():
    for i in range(5):
        anton.fd(50)
        anton.lt(145)

turtle.exitonclick()