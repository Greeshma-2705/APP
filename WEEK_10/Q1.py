from functools import reduce

marks = [45, 60, 75, 30, 90, 50, 85]

# a) Identify students who scored 50 or above
passed = list(filter(lambda x: x >= 50, marks))
print("Marks 50 or above:", passed)

# b) Add 5 grace marks, maximum 100
grace_marks = list(map(lambda x: min(x + 5, 100), marks))
print("Marks after grace:", grace_marks)

# c) Calculate total marks
total = reduce(lambda x, y: x + y, marks)
print("Total marks:", total)

# d) Lambda functions are short anonymous functions