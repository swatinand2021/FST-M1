
# Get the users names
user1 = input("Enter name of first player: ")
user2 = input("Enter name of second player: ")

# Get the users choices
user1_input = input(user1 + ", Choose  rock/paper/scissors: ").lower()
user2_input = input(user2 + ", Choose  rock/paper/scissors: ").lower()

# Run the algorithm to see who wins
if user1_input == user2_input:
    print("It's a tie!")
elif user1_input == 'rock':
    if user2_input == 'scissors':
        print("Rock wins!")
    else:
        print("Paper wins!")
elif user1_input == 'scissors':
    if user2_input == 'paper':
        print("Scissors win!")
    else:
        print("Rock wins!")
elif user1_input == 'paper':
    if user2_input == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")