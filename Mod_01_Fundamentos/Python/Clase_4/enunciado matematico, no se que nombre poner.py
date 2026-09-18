gil: float = float(input("¿Cuantos dolares tiene Guillermo?: "))
luis: float = gil / 2
juan: float = (gil + luis) / 2

total: float = gil + luis + juan

print("Si Guillermo tiene $", gil, "entonces\nLuis tiene $", luis, "\nJuan tiene $", juan, "\ny entre todos tienen", total)