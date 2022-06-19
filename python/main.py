
class Car():

    def __init__(self, name, is_sedan, num_of_seats) -> None:
        self.name = name
        self.is_sedan = is_sedan
        self.num_of_seats = num_of_seats

    def get_info(self) -> str:
        if self.is_sedan:
            return f'{self.name} is a sedan and has {self.num_of_seats} seats.'
        else:
            return f'{self.name} is not a sedan and has {self.num_of_seats} seats.'

    def get_seats(self) -> int:
        return self.num_of_seats

    def get_name(self) -> str:
        return self.name


class Wagon(Car):

    def __init__(self) -> None:
        super().__init__("Wagon", True, 4)


class InnovaCrysta(Car):

    def __init__(self) -> None:
        super().__init__("Innova", False, 6)


class HondaCity(Car):

    def __init__(self) -> None:
        super().__init__("Honda", True, 2)


wagon = Wagon()
honda = HondaCity()
innova = InnovaCrysta()


print(wagon.get_name())
print(innova.get_name())
print(honda.get_name())


