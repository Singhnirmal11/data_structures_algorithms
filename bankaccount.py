class Account:
  def __init__(self,balance,account_no):
    self.balance=balance
    self.account_no=account_no

  def debit(self,amount):
    self.balance-=amount
    print("Rs.",amount,"was debited")
    print("Total balance",self.get_balance())

  def credit(self,amount):
    self.balance+=amount
    print("Rs.",amount,"was credited")
    print("Total balance",self.get_balance())
  
  def get_balance(self):
    return self.balance
  
acc1=Account(10000,123)
acc1.debit(1000)
acc1.credit(2000)
acc1.get_balance()