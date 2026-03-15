class Student:
  name="Karan"
  def __init__(self,name,marks):
    self.name=name
    self.marks=marks
    print("Adding new student to the database..")

  def welcome(self):
    print("Welcome ",self.name)

  def get_marks(self):
    return self.marks

s1=Student("karan",88)
s1.welcome()
print(s1.get_marks())

