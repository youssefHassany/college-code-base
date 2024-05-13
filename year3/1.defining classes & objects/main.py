# 1) use case and why
# 2) how to implement a class
# 3) constructor
# 4) how to create an object

# -----------------------------------

# create 3 people : name, age, phone number, love spider-man?

class Person:
    def __init__(self, name = "Unknown", age = 18, phone = "+20"):
        self.personName = name
        self.personAge = age
        self.personPhone = phone
    
    def showPersonInfo(self):
        print(f'{self.personName} has {self.personAge} years his phone is {self.personPhone}')


p1 = Person("Youssef", 21, "012")
# p1.showPersonInfo()

baby = Person(age = 0)
baby.showPersonInfo()