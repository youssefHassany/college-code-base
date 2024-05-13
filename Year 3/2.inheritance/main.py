# 1) What is inheritance
# 2) when to use inheritance
# 3) What is polymorphism
# 4) when to use polymorphism

# ------------------------------------------------------

# create 4 people (classes) , 1 student, 1 athelete, 1 actress, 1 singer
# each has first name and last name and a method to print their info "showInfo"
# the rest of the proprieties are unique

class Person:
    def __init__(self, firstName, lastName):
        self.firstName = firstName
        self.lastName = lastName
    
    def showInfo(self):
        print(f'{self.firstName} {self.lastName}')


class Student(Person):
    def __init__(self, firstName, lastName, gpa):
        super().__init__(firstName, lastName)
        self.gpa = gpa

    def showInfo(self):
        print(f'{self.firstName} {self.lastName} his GPA is {self.gpa}')



class Athelete(Person):
    def __init__(self, firstName, lastName, benchPressWeight):
        super().__init__(firstName, lastName)
        self.benchPressWeight = benchPressWeight


a = Athelete("David", "Laid", 100)
a.showInfo()