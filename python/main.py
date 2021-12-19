import turtle
from random import choice


s = turtle.getscreen()

# players
player_one = turtle.Turtle()
player_one.color('blue')
player_one.shape('turtle')
player_one.penup()
player_one.goto(-200, 100)

player_two = player_one.clone()
player_two.color('red')
player_two.penup()
player_two.goto(-200, -100)


# homes
player_one.goto(200, 50)
player_one.pendown()
player_one.circle(50)
player_one.penup()
player_one.goto(-200, 100)

player_two.goto(200, -150)
player_two.pendown()
player_two.circle(50)
player_two.penup()
player_two.goto(-200, -100)



# gameplay
die = [1, 2, 3, 4, 5, 6]
# while 

    
    
turtle.exitonclick()
