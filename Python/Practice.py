class Student:
  def __init__(self,name,marks):
    self.name=name
    self.marks=marks

  @staticmethod
  def hello():
    print("Hello")

  def print_avg(self):
    sum=0
    for val in self.marks:
      sum+=val
    print("Hi",self.name, "Your Average marks are",(sum/3))

s1= Student("Nitin",[75,85,88])
s1.print_avg()
s1.hello()

s1.name="Pookie"
s1.print_avg()