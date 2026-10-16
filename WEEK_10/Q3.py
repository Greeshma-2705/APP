prices = [500, 1200, 2500, 800, 1500]

# a) Pure function to calculate discounted price
def discount(price):
    if price > 1000:
        return price * 0.80
    return price

# b) Apply discount using map()
discounted = list(map(discount, prices))
print("Discounted prices:", discounted)

# c) Identify products costing more than 1000
eligible = list(filter(lambda p: p > 1000, prices))
print("Eligible product prices:", eligible)

# d) The pure function returns a new value
# without modifying the original list.
print("Original prices:", prices)