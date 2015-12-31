def calculateArea(side):
    return side*side


def calculateAreaWithPromptsAndFeedback(firstPromptText,feedbackText):
    side = int(input(firstPromptText))
    area = calculateArea(side)
    print(feedbackText+" "+str(area))



firstPrompt = "Please enter a number for one side "
feedback = "Your area is"

calculateAreaWithPromptsAndFeedback(firstPrompt,feedback)