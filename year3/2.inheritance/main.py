class Person:
    def __init__(self, fName, lName):
        self.firstName = fName
        self.lastName = lName

    def printName(self):
        print(f'{self.firstName} {self.lastName}')


class Student(Person):
    def __init__(self, fName, lName, gpa):
        super().__init__(fName, lName)
        self.gpa = gpa

    def printInfo(self):
        print(f'{self.firstName} {self.lastName} GPA is {self.gpa}')


s1 = Student("Youssef", "Hassany", 3.0)
s1.printName()
s1.printInfo()