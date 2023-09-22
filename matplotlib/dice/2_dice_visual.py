import pygal
from dice import Dice

# Set 2 dices of 6 sides.
dice_1 = Dice()
dice_2 = Dice()

# Roll the dice, and record every number in a list.
results = []
for roll_num in range(1000):
    result = dice_1.roll() + dice_2.roll()
    results.append(result)
print(results)

#  Analyze the frequency of every number.
frequencies = []
max_result = dice_1.num_sides + dice_2.num_sides
for value in range(2, max_result + 1):
    frequency = results.count(value)
    frequencies.append(frequency)

# Make the frequencied visualize.
hist = pygal.Bar()
hist.title = "Results of rolling two D6 1000 times."
hist.x_labels = ["2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"]
hist.x_title = "Results"
hist.y_title = "Frequencies of Resuls"
hist.add("D6 + D6", frequencies)
hist.render_to_file("2_dice_visual.svg")