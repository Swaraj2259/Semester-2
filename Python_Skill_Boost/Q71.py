# Write a recursive solution to the Tower of Hanoi puzzle for n disks.

def tower_of_hanoi(n, source, auxiliary, target):
    if n == 1:
        print(f"Move disk 1 from {source} to {target}")
        return
    # Move n-1 disks from source to auxiliary
    tower_of_hanoi(n - 1, source, target, auxiliary)
    # Move the nth disk from source to target
    print(f"Move disk {n} from {source} to {target}")
    # Move the n-1 disks from auxiliary to target
    tower_of_hanoi(n - 1, auxiliary, source, target)

# Number of disks
n = int(input("Enter the number of disks: "))
tower_of_hanoi(n, "A", "B", "C")