## List vs Generator Comprehension: Write a script that demonstrates the difference between a list comprehension and a generator expression for large data.
import time
# List Comprehension
start = time.time()
list_comp = [i for i in range(1000000)]
end = time.time()
print("List Comprehension Time: ", end - start)
start = time.time()
gen_comp = (i for i in range(1000000))
end = time.time()
print("Generator Comprehension Time: ", end - start)