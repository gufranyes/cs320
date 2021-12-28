package Model.Stories;

import Controller.StoryController;
import Model.Actor;
import Model.Event;
import Model.Story;

public class Pheria extends Story {
    private StoryController storyController;

    public Pheria(StoryController storyController) {
        this.storyController = storyController;

        String e1Str = "You woke up to one of the ordinary days you were used to at the inn. While your mother is a waitress at the inn, your father works as a bartender. Since your childhood, you have dreamed of buying this inn and becoming its owner. And now you are one step closer to this dream because the Trader School you won with a scholarship starts this year. Your first lesson is in 2 days. So, you wash your hands and go downstairs to help your mother. However, they want you to have a pleasant time outside, as it is almost time for the school to open. What will you do about it:";
        String e1o1 = "Be persistent in helping ";
        String e1o2 = "Walk on the street ";
        String e1o3 = "Look at the school from afar";
        String e1o4 = "Do nothing";
        Event event1 = new Event(e1Str, 1, 2, 3, 4, 3, storyController.player, new Actor(), e1o1, e1o2, e1o3, e1o4, false, false);

        String e2Str = "Although they were a little upset, your parents, who were proud of their daughter's determination and success, did not insist any longer and let you stay at the inn. The inn wasn't very crowded yet, so you helped with the preparations for the evening. As it got crowded, you helped your mother with the services. In the following hours, an unexpected name came to the inn. Corai was here. But what would it be doing here? Corai was the best friend of the Traderssons' son, Aemir. He didn't know you, but he can definitely remember you when you meet him at school 2 days later. Will you hide from him or will you continue to help your family? Your decision:";
        String e2o1 = "Help";
        String e2o2 = "Hide";
        Event event2 = new Event(e2Str, 2, 5, 5, 6, 6, storyController.player, new Actor(), e2o1, e2o1, e2o2, e2o2, false, false);

        String e3Str = "You listened to your family and started wandering the streets. Since you have an interest in business, you were usually examining the shops on the streets and trying to calculate how much they earned. This time, while calculating a blacksmith's income, you saw the Corai from across the street heading towards your inn. You can go back to the inn and see what they will do, but he will definitely remember you when school starts. But isn't it very noble to help your family? Or you can hide in front of the blacksmith and just wait for them to leave. After all, no one wants to start school socially behind, right? Your decision:";
        Event event3 = new Event(e3Str, 3, 5, 5, 6, 6, storyController.player, new Actor(), e2o1, e2o1, e2o2, e2o2, false, false);

        String e4Str = "You listened to your family and started going to school. Since you have an interest in business, you were usually examining the shops on the streets and trying to calculate how much they earned while going to school. This time, while calculating a blacksmith's income, you saw the Corai from across the street heading towards your inn. You can go back to the inn and see what they will do, but he will definitely remember you when school starts. But isn't it very noble to help your family? Or you can hide in front of the blacksmith and just wait for them to leave. After all, no one wants to start school socially behind, right? Your decision:";
        Event event4 = new Event(e4Str, 4, 5, 5, 6, 6, storyController.player, new Actor(), e2o1, e2o1, e2o2, e2o2, false, false);

        String e5Str = "You chose to help your family. He was “extremely” kind to you when you went to their table to take orders. You know he'll definitely remember you when school opens. After a while, they got up and left. What a day it was. The next day passed similarly, but calmer. It was the first day of school now. When you wake up in the morning, you have a surprise from your mother and father. They probably saved money and bought you the beautiful dress that stood before you, without you noticing. Out of gratitude to them, you put on the dress and went downstairs to them. You could see that they were very happy to see you like that. \"You don't want to be late for your first day of school, honey.\" And they said goodbye to you.";
        String e5AllOptions = "You get on with your day.";
        Event event5 = new Event(e5Str, 5, 7, 7, 7, 7, storyController.player, new Actor(), e5AllOptions, e5AllOptions, e5AllOptions, e5AllOptions, false, false);

        String e6Str = "You chose to hide. You hope he won't remember you when school starts. After a while, you thought that they got up and left. What a day it was. The next day passed similarly, but calmer. It was the first day of school now. When you wake up in the morning, you have a surprise from your mother and father. They probably saved money and bought you the beautiful dress that stood before you, without you noticing. Out of gratitude to them, you put on the dress and went downstairs to them. You could see that they were very happy to see you like that. \"You don't want to be late for your first day of school, honey.\" And they said goodbye to you.";
        Event event6 = new Event(e6Str, 6, 7, 7, 7, 7, storyController.player, new Actor(), e5AllOptions, e5AllOptions, e5AllOptions, e5AllOptions, false, false);

        String e7Str = "The school was even better than expected. There were elegantly dressed professors, handsome boys, and very pretty girls everywhere. You definitely felt like you were in a different city. Someone must have understood this astonishment because a girl came to you. “Yes, there can be a huge difference between non-scholars and scholarship holders like us. I'm Saname. Pleased to meet you. Let's at least try to pass the day without incident. Besides, your dress is beautiful, maybe if you don't draw attention, they won't even know you're on a scholarship.” You went to class together while she was telling these things. The classes you took didn't catch your attention at first. You felt like you knew most of what they were talking about. Only the last lesson caught your attention today. Aemir was there and you definitely felt something deep inside your heart. He was charming. When you returned to the inn, you slept without saying much because it was crowded. You hoped the next day would be more fun.";
        String e7o1 = "You mentioned Aemir in your diary";
        String e7o2 = "You mentioned your day at school in your diary";
        String e7o3 = "You didn't write anything in your diary";
        String e7o4 = "You got busy and forgot about your diary";
        Event event7 = new Event(e7Str, 7, 8, 8, 8, 8, storyController.player, new Actor(), e7o1, e7o2, e7o3, e7o4, false, false);

        String e8Str = "What you wanted yesterday came true. When you got to school, it was obvious that a lot of fun was waiting for you. There were handouts all around, with the words “Bar Girl Pheria! Maybe you can see it if you go. If you can't see her, you'll see her mother.\" it was written. Those who saw you were starting to laugh among themselves, and some men were showing the courage to say something. In the heat of the event, you just wanted to be able to go to class, but it was clear that they would make today very difficult for you. Sometimes they threw papers with ugly notes in the lessons. Even the scholarship girl who was with you yesterday was trying to stay away from you today. The lesson you had with Aemir was quieter than usual. But still, someone threw paper. Aemir saw this and took the paper without opening it and threw it in the trash. At least the day was quiet. This time, when you returned to the inn, it was emptier, but you did not want to talk about today.";
        String e8o1 = "You wore the beautiful dress the next day";
        String e8o2 = "You wore casual clothes the next day";
        Event event8 = new Event(e8Str, 8, 9, 9, 9, 9, storyController.player, new Actor(), e8o1, e8o1, e8o2, e8o2, false, false);

        String e9Str = "When you went to school the next day, everyone was calmer. You didn't understand what was happening, but it didn't matter as long as they kept quiet. On the way to class, Saname came to you. “Last night, Aemir told everyone to stop making fun of you. Can you believe it? Will you go and thank him?\" This was actually an interesting question. Why did he even do that? Meanwhile, Aemir said, “Your dress is beautiful.” And he walked past you. Are you going to stop him and talk? Or are you going to keep quiet and try not to attract any more attention? Your decision:";
        String e9o1 = "“Thank you. But I wonder why he did it.” ";
        String e9o2 = "Go to class without saying anything ";
        Event event9 = new Event(e9Str, 9, 10, 10, 11, 11, storyController.player, new Actor(), e9o1, e9o1, e9o2, e9o2, false, false);

        String e10Str = "Aemir paused for a while after hearing you but continued walking towards his class without saying anything. You went to your class too, but you kept wondering why he was doing this. Some people were still staring at you, but this time you thought it wasn't because of the inn. After class, Aemir came up to you, “I really don't care what others think. I think I like you and I want to be with you. I hope you feel the same way. Would you like to go eat something after class tomorrow?\" And he looked pretty serious. To be honest, no one expected this. Your answer:";
        String e10o1 = "Accept";
        String e10o2 = "Reject";
        Event event10 = new Event(e10Str, 10, 12, 12, 12, 12, storyController.player, new Actor(), e10o1, e10o1, e10o2, e10o2, false, false);

        String e11Str = "Aemir continued walking towards his class without saying anything too. You went to your class, but you kept wondering why he was doing this. Some people were still staring at you, but this time you thought it wasn't because of the inn. After class, Aemir came up to you, “I really don't care what others think. I think I like you and I want to be with you. I hope you feel the same way. Would you like to go eat something after class tomorrow night?\" And he looked pretty serious. To be honest, no one expected this. Your answer:";
        Event event11 = new Event(e11Str, 11, 12, 12, 13, 13, storyController.player, new Actor(), e10o1, e10o1, e10o2, e10o2, false, false);

        String e12Str = "You accepted. Is this really happening? You're going to dinner with Aemir. The next morning, without thinking, you put on your beautiful dress and your excitement was more than ever. You were literally dying to go to school. After meeting with your parents, you went straight to school. But you never saw Aemir at school today. Are they making a bad joke? No, Aemir is not that kind of person. He shouldn't be. And why would he do such a thing? For fun? While all these thoughts were gnawing at you, the lessons were over. But Aemir was still nowhere to be found. After a while, you saw him. He was more handsome than ever. Moreover, he had come by horse-drawn carriage. As soon as he saw you, he said, “Sorry to keep you waiting. It took longer than I expected to set everything up.” He said and showed the carriage. You spent a night with Aemir, like a fairy tale. At the end of the night, he turns to you and says, \"There's one thing I need to be sure of at the end of this night. Although most people don't know, I am sick and I don't know if I will get better. Do you still want to have a relationship with me?\" It was a question that Aemir really cared about your answer. Your answer:";
        Event event12 = new Event(e12Str, 12, 14, 14, 15, 15, storyController.player, new Actor(), e10o1, e10o1, e10o2, e10o2, false, false);

        // ENDING 3
        String e13Str = "You refused to go to dinner. Aemir looked rather sad. But you should have focused on your studies. This kind of thing shouldn't have happened. Moreover, you two were a person of very different worlds. Your goals were very different. You have never stopped working towards these goals. You graduated from school with honors and built great businesses. You never met Aemir again at school. You held a celebration when you bought the inn where your family works. You invited some of your friends from school, including Saname. When you asked her about Aemir, told you that Aemir married Handy, took over his father's business, and even made it bigger. He was such a wonderful husband, she said, that everyone who saw them thought they were living in fairy tales. Under their gaze at you, “You missed a great opportunity.” There was such an expression. But it doesn’t matter anymore. You are so used to being alone...";
        Event event13 = new Event(e13Str, 13, -100, -100, -100, -100, storyController.player, new Actor(), "END", "END", "END", "END", false, false);

        // ENDING 1
        String e14Str = "You refused. Aemir looked rather sad. But you should have focused on your studies. This kind of thing shouldn't have happened. Moreover, you two were a person of very different worlds. Your goals were very different. You have never stopped working towards these goals. You graduated from school with honors and built great businesses. You never met Aemir again at school. You held a celebration when you bought the inn where your family works. You invited some of your friends from school, including Saname. When you asked her about Aemir, she told you that he passed away in the last year of school. But now that you're a business owner, things like that shouldn't affect you. Money must keep flowing...";
        Event event14 = new Event(e14Str, 14, -100, -100, -100, -100, storyController.player, new Actor(), "END", "END", "END", "END", false, false);

        // ENDING 2
        String e15Str = "You started a wonderful relationship with Aemir. Even though your lessons showed little regression, Aemir understood the situation and you started working more together. Your grades were increasing again, easily. Meanwhile, Aemir seemed to cling to life again with you, finding meaning. Although he had a difficult time due to his illness, Aemir held on to life and eventually recovered. You both graduated successfully. You built great businesses on your own while he took over his family's business. Everyone was so proud of you when you bought the inn where your family worked. You gave great news to your family when you organized a celebration after you bought the inn. Now there was you, Aemir, and a baby in your womb too…";
        // wow, nsfw
        Event event15 = new Event(e15Str, 15, -100, -100, -100, -100, storyController.player, new Actor(), "END", "END", "END", "END", false, false);

        this.addEvent(event1);
        this.addEvent(event2);
        this.addEvent(event3);
        this.addEvent(event4);
        this.addEvent(event5);
        this.addEvent(event6);
        this.addEvent(event7);
        this.addEvent(event8);
        this.addEvent(event9);
        this.addEvent(event10);
        this.addEvent(event11);
        this.addEvent(event12);
        this.addEvent(event13);
        this.addEvent(event14);
        this.addEvent(event15);
    }
}
