print("\n*****Welcome to Saturn Coffee*****\n")

price_BlackCoffee=3
price_Espresso=4
price_Latte=6
price_Cappuccino=7
price_Frappuccino=9

print("What would you like to have? Here is our menu:\n")
print("1)Black Coffee: $" + str(price_BlackCoffee))
print("2)Espresso: $" + str(price_Espresso))
print("3)Latte: $" + str(price_Latte))
print("4)Cappuccino: $" + str(price_Cappuccino))
print("5)Frappuccino: $" + str(price_Frappuccino))


id_Black_Coffee = "1"
id_Espresso = "2"
id_Latte = "3"
id_Cappuccino = "4"
id_Frappuccino = "5"

while True:
    order = input("\nEnter option(or 0 to exit): ")
    if order=="0":
       exit()
    
    if not order:
        print("\nI can't read your mind.")
        continue

    
    if order not in [id_Black_Coffee, id_Espresso, id_Latte, id_Cappuccino, id_Frappuccino]:
        print("\nInvalid input!")
        print("Available options are in the menu.")
    else:
  
          if order == id_Black_Coffee:
           item= "Black Coffee"

          elif order == id_Espresso:
           item= "Espresso"

          elif order == id_Latte:
            item ="Latte"

          elif order == id_Cappuccino:
            item="Cappuccino"
            

          elif order == id_Frappuccino:
            item="Frappuccino"  
           
          print("\nSo, you would like to have " + item + ".")
          break
    
while True:
   
   quantity=input("\nHow many " + item + "'s do you want? ")


   if not quantity:
      print("I can't read your mind!")
      continue
   if not quantity.isnumeric():
      print("Invalid input!")
      continue
   
   if quantity=="0":
      exit()
   else:
      break
   
total = 0

if item == "Black Coffee":
    total = price_BlackCoffee * int(quantity)
elif item == "Espresso":
    total = price_Espresso * int(quantity)
elif item == "Latte":
    total = price_Latte * int(quantity)
elif item == "Cappuccino":
    total = price_Cappuccino * int(quantity)
elif item == "Frappuccino":
    total = price_Frappuccino * int(quantity)


print("\nYour total is $" + str(total)+".")

payment_1="1"
payment_2="2"

print("\n        ***Payment options***")
print("1)Cash")
print("2)Scan QR code")

while True:
   pay =input("\nEnter option(or 0 to exit):")

   if not pay.isnumeric():
      print("Invalid input!")
      continue

   if pay=="0":
      exit()

   else:
      break


if pay==payment_1:
      
      input("\nThank You, Here is the order bill.\nPlease pay to the cash counter and receive your order.")
      print("")
      print("Thank you! Visit again!\n")
      
if pay==payment_2:
        
        input("\nThank You! Please scan the QR code.\n")
        print("***Payment Successfull***\n\nHere is your receipt.\nPlease receive your order at the counter.")
        print("\nThank you! Visit again!\n")