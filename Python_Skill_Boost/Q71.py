# Write a recursive solution to the Tower of Hanoi puzzle for n disks.

def hanoi(n, source, target, auxiliary):
    if n == 1:
        print(f"Move disk 1 from {source} to {target}")
        return
    hanoi(n-1, source, auxiliary, target)  # Move n-1 disks from source to auxiliary
    print(f"Move disk {n} from {source} to {target}")  # Move the nth disk
    hanoi(n-1, auxiliary, target, source)  # Move n-1 disks from auxiliary to target
