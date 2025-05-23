# Escape-From-Kingdom-Velmoria-Lavanthi-
TITLE: [Escape from Kingdom Velmoria]

AUTHOR(S)/PROGRAMMER(S): [Lavanthi Narasimman]

DATE DUE: [5-22-2025]

DATE SUBMITTED: [5-22-2025]

COURSE TITLE: [AP Computer Science Advanced]

SECTION: [8 AM]

DESCRIPTION: [Escape of Kingdom Velmoria is game where the user fidn their way out of the Dangeous Kingdom of Velmoria.
To escape, they must collect three different items: spellbook,wand,purple diamond. They must also soles puzzles and go
through different rooms.They meet characters like Lunara and Nyxeria who help you and Grinsorrow who will test you.
But, they should not meet Queen Vespara or they die.]

HONOR STATEMENT: [Lavanthi Narasimman]

HOWTO: [upload on github and download it]

BIBLIOGRAPHY: [
    -Slideshows in Canva
    -https://www.geeksforgeeks.org/different-ways-for-integer-to-string-conversions-in-java/
    -https://stackoverflow.com/questions/19008970/java-what-does-n-mean
    -https://www.geeksforgeeks.org/generating-random-numbers-in-java/
    -https://www.w3schools.com/java/java_break.asp
    -https://www.w3schools.com/java/java_inheritance.asp
    -https://www.w3schools.com/java/java_arraylist.asp
    -https://www.youtube.com/watch?v=JU767SDMDvA
    -https://www.youtube.com/watch?v=GomDg1LS7R4
]

RESOURCES: N/A

TUTORS: Here are the tutors and how they helped me/suggestions they gave:
        Nicholas:Originally, for the Lunara(NPC), I was going to write all her lines in the main class,
         and write an if statement that if the player's current room was in the start room then all her lines would show.
         Nicholas then saw me code and told me to just amke a whole seperate class on it so that it would be easier and much neater.
         He also helped me write the NPC class. He was also the one who recommended me to write the printHelp method. He said the
          user would probably wanna know what exact words to write, he also
        Caroline:
        So previously I had one key in the kitchen. The user would just grab that key and be done. Carolina then suggested,it would
        better if there were two keys, it would be better. So then I had the text say there were two keys and then in the openChest method
        I would check the color of it, but this just complicated stuff. Caroline then told me to change it from a hasKey variable to two variables
        hasBlue and hasPurpleKey which simplified it. She helped me change the methods accordingly
        Evan:
         When the computer goes through the inventory to find the blue key, i wanted it to stop the moment it found it.
         I fought of somehow using recursion to end the loops, but then I asked Evan and he told using a breath method would just be much easier
COMMENTS:
        I want to let you know that I did two extra Credit:
            -3rd suprise Ending: Lose against Grinsorrow is death
            -Battle: you do a mini number battle with Grinsorrow

REFLECTION: [My idea for this was it to be like an escape the kingdom idea.
             I wanted it so that there was a evil queen that you had to escape.
             For example, in the game granny, you had to get all these random items to break out of the house.
             Similarly, I thought you need specific items to escape the kingdom. I wanted to add the clown as a
             protector for an item and as the 3rd end game. I wanted to make a witch that
             let you escape ad a servant that introduces the game. So I created the whole plan. The user would met Lunara at the start of the game, where she explains the directions of the game. There would be three puzzles. One puzzle is where the user must find the blue key to open the chest. Second puzzle is where the user needs to unscramble the word to get the diamond. The third puzzle is where the user needs to answer the riddle and win the number battle to get the spell book. Then the user would have to go the witch , give her the three items and then they can escape. But if they see the queen, they dead. This was script I had in mind. I wrote the game plan and the code for the game. This game took me a week to make. From 5/14 to 5/17, I worked on the game for hour and a half each day. On 5/18 to 5/20,I worked on it for like 3 hours. The 21th and 22nd , I was busy just rechecking the code and writing the reflections which took around an hour.

             I faced a couple of problems when working on this assignment. But there were some big ones.
             One was dealing with the chest. So in the game, one of the puzzles is to get a blue key from the kitchen
              and open the chest with it. There big issue I had with it was with there being multiple keys. Originally there was only supposed to be one key, but then Caroline advised me to make it challenge where the user will have to pick the right key. So then in the texts, I had  to change it where I had a purple key and a blue key. Then I had to add a bunch of if statements where it just got really complicated. I wrote different if statements like if the the string is blue key then open the chest. Then I realized that I can just make it easier by creating two variables called blue Key and purple key. Secondly, I ended up adding two methods that made sure that the user had the blue key before opening the chest so that the user could get the wand. Another big challenge was with the the battle between the clown and user. Basically after the user gets the questions right, the two have to do a number battle. Basically, if the user chose the same number as the clown,  they would die if not the clown gives them the spell book. So I had to compare the number of the user and the clown. The issue was that the clown's number was an integer while the user's number would be a String. So I tried to convert the the user's string to an integer. But after trying I decided I could just change the clown's input as a string by creating a new variable which add a space at the end. Then I could substring just the zeroth index to help properly compare the two stuff. Another big issue I had was with meeting the requirements. One of the requirements involved having inheritance(aka a parent-child class). Now, when I first saw this, I was lowkey confused on how I could do it. Then I thought what if the user could get other items like maybe a paper or a key. So then I thought I could have other objects like the keys which are items but then the three main items I needed to escape the kingdom. SO I made an item class and an needed Item class which inherited from the item class. Another requirement I Struggled at forts to find a way to complete was with the searching and sorting part. At first, I thought of creating an array List of all the rooms, but then I wasn't sure how helpful that would be. Then I thought, once we had to confront the witch, I would make a new array List with just the required items. I also used inheritance sort for the one of the puzzles. When the user had to unscramble the word (the original word was grin sorrow), I thought if I just alphabetically sorted the word, then that would be a way of an unsorted word. But sorting it alphabetically was a bit of a challenge. I was used to usually sorting numbers. So I ended up watching videos and I also asked Nicholas to help me write that. I also had a bit of challenge with the open Chest method. So before the user could take the wand, I wanted to make sure that user even has the blue key in their inventory. I thought of maybe trying to recursion with third but that just made it complicating. I went to computer science tutoring, and one of the tutors(Evan) helped me. He told me to just use the break method as it would just immediately stop the method. He told me how to do it and even showed me a website that he used to use which helped him. Another struggle was with the clown. So after the user had won against the clown, they should have been able to get the spell book, but for some reason , it would not get added to inventory. I tried putting a add to the item inventory in multiple areas. In the end, I ended putting a text saying that to get  the book, that needed to type of words take spell book, and then in the main function I put an if-statement saying that if the user put take spell book, the spell book had to be added to the inventory.

             Overall, I really enjoyed this project. It was hard, but it was quite creative and fun to come up with.


             ]
