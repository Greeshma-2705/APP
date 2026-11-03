import sympy as sp

t = sp.symbols('t')

# Displacement function
s = t**3 - 6*t**2 + 9*t + 5

# Velocity
v = sp.diff(s, t)
print("Velocity:", v)

# Acceleration
a = sp.diff(v, t)
print("Acceleration:", a)

# Time when vehicle is at rest
rest = sp.solve(v, t)
print("Vehicle at rest:", rest)

# Definite integration from 0 to 3
distance = sp.integrate(v, (t, 0, 3))
print("Displacement:", distance)