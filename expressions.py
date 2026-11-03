import sympy as sp

x = sp.symbols('x')

# Expansion
expr = (x + 2)**2
print("Expanded:", sp.expand(expr))

# Factorization
expr2 = x**2 + 5*x + 6
print("Factorized:", sp.factor(expr2))

# Simplification
expr3 = (x**2 - 4)/(x - 2)
print("Simplified:", sp.simplify(expr3))

# Solving quadratic equation
equation = x**2 - 5*x + 6
solution = sp.solve(equation, x)

print("Solutions:", solution)