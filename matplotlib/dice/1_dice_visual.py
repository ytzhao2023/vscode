import pygal
from dice import Dice

# Set a dice of 6 sides.
dice = Dice()

# Roll the dice, and record every number in a list.
results = []
for roll_num in range(1000):
    result = dice.roll()
    results.append(result)
print(results)

#  Analyze the frequency of every number.
frequencies = []
for value in range(1, dice.num_sides + 1):
    frequency = results.count(value)
    frequencies.append(frequency)

# Make the frequencied visualize.
hist = pygal.Bar()
hist.title = "Results of rolling one D6 1000 times."
hist.x_labels = ["1", "2", "3", "4", "5", "6"]
hist.x_title = "Results"
hist.y_title = "Frequencies of Resuls"
hist.add("D6", frequencies)
hist.render_to_file("1_dice_visual.svg")