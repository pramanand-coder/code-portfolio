from math import sqrt
print("Welcome to the Quadratic Equation Solver!")
print("Provide the valid coefficients")

a = 0.0

while(a==0.0)
	print("Note that the a is NOT zero")
	print("Provide the coefficient a")
	a = raw_input()
	a = float(a)
	
print("Provide the coefficient b")
	b = raw_input()
	b = float(b)
	
print("Provide the coefficient c")
	c = raw_input()
	c = float(c)
	
D = b*b - 4*a*c

if D>0:
		root1 = (-b+sqrt(D)) / (2*a)
		root2 = (-b-sqrt(D)) / (2*a)
		print("The first root is " + str(root1))
		print("The second root is " + str(root2))

elif D == 0:
			root = -b/(2*a)
			print("The root is " + str(root))
else:
			print("No roots")